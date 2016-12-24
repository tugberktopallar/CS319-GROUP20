package dotew.controller;

import java.util.ArrayList;

import dotew.model.BattleMap;
import dotew.model.CCharacter;
import dotew.model.Enemy;
import dotew.model.Player;
import dotew.model.Skill;

public class BattleManager {
	
	/**
	 * 
	 */
	private BattleMap currentBattleMap;
	/**
	 * 
	 */
	private ArrayList characterList;
	/**
	 * 
	 */
	private TurnManager turnManager;
	/**
	 * 
	 */
	private EnemyAI enemyAI;
	
	//Constructor
	
	
	
	/**
	 * @param currentBattleMap : current battle map
	 * @param characterList : list of characters in the game
	 * @param turnManager : instance of turn manager to determine turns
	 * @param enemyAI : enemy
	 */
	public BattleManager(BattleMap currentBattleMap, ArrayList characterList, TurnManager turnManager,
			EnemyAI enemyAI) {
		
		this.currentBattleMap = currentBattleMap;
		this.characterList = characterList;
		this.turnManager = turnManager;
		this.enemyAI = enemyAI;
	}
	
	/**
	 * gets battle map and initialize other instances accordingly
	 * @param currentBattleMap : current battle map
	 */
	public BattleManager(BattleMap currentBattleMap){
		this.currentBattleMap = currentBattleMap;
		this.characterList = currentBattleMap.getCharacterList();
		createTurnManager(this.characterList);
		this.enemyAI = new EnemyAI(null, (Player) this.characterList.get(0));
	}
	
	
	// Methods
	/**
	 * gives expo
	 */
	public void giveExp(){
		int totalExp = 0;
		
		for (int i = 1; i < getCharacterList().size(); i++) {
			totalExp += ((Enemy) getCharacterList().get(i)).getExpPointValue();
		}
		
		((Player) getCharacterList().get(0)).addExp(totalExp);
	}
	
	
	/**
	 * @return
	 */
	public boolean checkCharacterStatus(){
		//TODO
		return false;
	}
	
	/**
	 * @param map : battle map
	 */
	public void startBattle(BattleMap map){
		setCurrentBattleMap(map);
		createTurnManager(map.getCharacterList());
		
		//TODO
	}
	
	/**
	 * @return checks if enemy is dead or not
	 */
	public boolean isEnemiesDead(){
		for (int i = 1; i < getCharacterList().size(); i++) {
			if(!((CCharacter)getCharacterList().get(i)).isDead()){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ends the battle when smn dies
	 */
	public void endBattle(){
		giveBattleRewards(getCharacterList());
		setTurnManager(null);
		((Player) getCharacterList().get(0)).clearAllStatusEffects();
		//TODO
	}
	
	/**
	 * @param c1 : player which apply the skill
	 * @param c2c: enemy that player wants to apply skill on
	 * @param s : skill
	 */
	public void applySkill(CCharacter c1, CCharacter c2, Skill s){
		c1.useSkill(c2,s);
		
	}
	
	/**
	 * @param characterList : list of charachters
	 */
	private void createTurnManager(ArrayList characterList){
		TurnManager tm = new TurnManager(characterList);
		setTurnManager(tm);
	}
	
	/**
	 * @param characterList
	 */
	public void giveBattleRewards(ArrayList characterList){
		giveExp();
		ArrayList rewards = new ArrayList();
		for (int i = 1; i < getCharacterList().size(); i++) {
			
			for (int j = 0; j < ((Enemy) getCharacterList().get(0)).getDroppableItems().size(); j++) {
				rewards.add(((Enemy) getCharacterList().get(0)).getDroppableItems().get(j));
			}
			
		}
		
	}
	
	/**
	 * changes the turns during battle
	 */
	public void passTurn(){
		getTurnManager().passTurn();
		while((getTurnManager().getTurn() % getCharacterList().size()) != 0){
			getEnemyAI().setCurrentCharacter(getTurnManager().getCurrentCharacter());
			getEnemyAI().playTurn();
			getTurnManager().passTurn();
		}
	
	}
	
	/**
	 * @param c1 : player's character
	 * @param c2 : character that is going to be attacked
	 */
	public void attack(CCharacter c1, CCharacter c2){
		//TODO
	}
	
	
	
	
	
	//Getters and Setters

	/**
	 * @return
	 */
	public BattleMap getCurrentBattleMap() {
		return currentBattleMap;
	}

	/**
	 * @param currentBattleMap
	 */
	public void setCurrentBattleMap(BattleMap currentBattleMap) {
		this.currentBattleMap = currentBattleMap;
	}

	/**
	 * @return
	 */
	public ArrayList getCharacterList() {
		return characterList;
	}

	/**
	 * @param characterList
	 */
	public void setCharacterList(ArrayList characterList) {
		this.characterList = characterList;
	}

	/**
	 * @return
	 */
	public TurnManager getTurnManager() {
		return turnManager;
	}

	/**
	 * @param turnManager
	 */
	public void setTurnManager(TurnManager turnManager) {
		this.turnManager = turnManager;
	}

	/**
	 * @return
	 */
	public EnemyAI getEnemyAI() {
		return enemyAI;
	}

	/**
	 * @param enemyAI
	 */
	public void setEnemyAI(EnemyAI enemyAI) {
		this.enemyAI = enemyAI;
	}
	

}
