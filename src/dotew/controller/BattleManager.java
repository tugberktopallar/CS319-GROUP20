package dotew.controller;

import java.util.ArrayList;

import dotew.model.BattleMap;
import dotew.model.CCharacter;
import dotew.model.Enemy;
import dotew.model.Player;
import dotew.model.Skill;

public class BattleManager {
	
	private BattleMap currentBattleMap;
	private ArrayList characterList;
	private TurnManager turnManager;
	private EnemyAI enemyAI;
	
	//Constructor
	
	
	
	public BattleManager(BattleMap currentBattleMap, ArrayList characterList, TurnManager turnManager,
			EnemyAI enemyAI) {
		
		this.currentBattleMap = currentBattleMap;
		this.characterList = characterList;
		this.turnManager = turnManager;
		this.enemyAI = enemyAI;
	}
	
	
	// Methods
	public void giveExp(){
		int totalExp = 0;
		
		for (int i = 1; i < getCharacterList().size(); i++) {
			totalExp += ((Enemy) getCharacterList().get(i)).getExpPointValue();
		}
		
		((Player) getCharacterList().get(0)).addExp(totalExp);
	}
	
	
	public boolean checkCharacterStatus(){
		//TODO
		return false;
	}
	
	public void startBattle(BattleMap map){
		setCurrentBattleMap(map);
		createTurnManager(map.getCharacterList());
		
		//TODO
	}
	
	public boolean isEnemiesDead(){
		for (int i = 1; i < getCharacterList().size(); i++) {
			if(!((CCharacter)getCharacterList().get(i)).isDead()){
				return false;
			}
		}
		return true;
	}
	
	public void endBattle(){
		giveBattleRewards(getCharacterList());
		setTurnManager(null);
		((Player) getCharacterList().get(0)).clearAllStatusEffects();
		//TODO
	}
	
	public void applySkill(CCharacter c1, CCharacter c2, Skill s){
		c1.useSkill(c2,s);
		
	}
	
	private void createTurnManager(ArrayList characterList){
		TurnManager tm = new TurnManager(characterList);
		setTurnManager(tm);
	}
	
	public void giveBattleRewards(ArrayList characterList){
		giveExp();
		ArrayList rewards = new ArrayList();
		for (int i = 1; i < getCharacterList().size(); i++) {
			
			for (int j = 0; j < ((Enemy) getCharacterList().get(0)).getDroppableItems().size(); j++) {
				rewards.add(((Enemy) getCharacterList().get(0)).getDroppableItems().get(j));
			}
			
		}
		
	}
	
	public void passTurn(){
		getTurnManager().passTurn();
		while((getTurnManager().getTurn() % getCharacterList().size()) != 0){
			getEnemyAI().setCurrentCharacter(getTurnManager().getCurrentCharacter());
			getEnemyAI().playTurn();
			getTurnManager().passTurn();
		}
	
	}
	
	public void attack(CCharacter c1, CCharacter c2){
		//TODO
	}
	
	
	
	
	
	//Getters and Setters

	public BattleMap getCurrentBattleMap() {
		return currentBattleMap;
	}

	public void setCurrentBattleMap(BattleMap currentBattleMap) {
		this.currentBattleMap = currentBattleMap;
	}

	public ArrayList getCharacterList() {
		return characterList;
	}

	public void setCharacterList(ArrayList characterList) {
		this.characterList = characterList;
	}

	public TurnManager getTurnManager() {
		return turnManager;
	}

	public void setTurnManager(TurnManager turnManager) {
		this.turnManager = turnManager;
	}

	public EnemyAI getEnemyAI() {
		return enemyAI;
	}

	public void setEnemyAI(EnemyAI enemyAI) {
		this.enemyAI = enemyAI;
	}
	

}
