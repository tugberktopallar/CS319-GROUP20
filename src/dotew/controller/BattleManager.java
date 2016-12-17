package dotew.controller;

import java.util.ArrayList;

import dotew.model.BattleMap;
import dotew.model.CCharacter;
import dotew.model.Skill;

public class BattleManager {
	
	private BattleMap currentBattleMap;
	private ArrayList characterList;
	private TurnManager turnManager;
	private EnemyAI enemyAI;
	
	//Constructor
	
	public BattleManager(BattleMap currentBattleMap, ArrayList characterList, TurnManager turnManager,
			EnemyAI enemyAI) {
		super();
		this.currentBattleMap = currentBattleMap;
		this.characterList = characterList;
		this.turnManager = turnManager;
		this.enemyAI = enemyAI;
	}
	
	
	// Methods
	public void giveExp(){
		//TODO
	}
	
	
	public boolean checkCharacterStatus(){
		//TODO
		return false;
	}
	
	public void startBattle(){
		//TODO
	}
	
	public boolean isEnemiesDead(){
		//TODO
		return false;
	}
	
	public void endBattle(){
		//TODO
	}
	
	public void applySkill(CCharacter c1, CCharacter c2, Skill s){
		//TODO
	}
	
	private void createTurnManager(ArrayList characterList){
		//TODO
	}
	
	public void giveBattleRewards(ArrayList characterList){
		//TODO
	}
	
	public void passTurn(){
		//TODO
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
