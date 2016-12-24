package dotew.controller;

import java.util.ArrayList;

import dotew.model.CCharacter;

public class TurnManager {
	/**
	 * 
	 */
	private ArrayList characterList;
	/**
	 * 
	 */
	private int turn;
	/**
	 * 
	 */
	private CCharacter currentCharacter;
	
	//Constructor
	/**
	 * @param characterList :list of characters in game
	 */
	public TurnManager(ArrayList characterList) {
		
		this.characterList = characterList;
		this.turn = 0;
		
		this.currentCharacter = (CCharacter) characterList.get(0);
	}
	
	
	//Methods
	/**
	 * @return applies temporary effects on character 
	 */
	public boolean applyStatusAffects(){
		
		return getCurrentCharacter().applyTemporaryEffects();
	}
	
	/**
	 * change turns of the character
	 */
	public void passTurn(){
		
			setTurn(getTurn() + 1);
			
			getCurrentCharacter().endTurnRegen(); // When a character ends turn it gets its regeneragation
			setCurrentCharacter((CCharacter) getCharacterList().get(getTurn() % getCharacterList().size()));
			
			applyStatusAffects();
			
		
	}
	
	
	
	
	
	
	//Getters and Setters
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
	public int getTurn() {
		return turn;
	}
	/**
	 * @param turn
	 */
	public void setTurn(int turn) {
		this.turn = turn;
	}
	/**
	 * @return
	 */
	public CCharacter getCurrentCharacter() {
		return currentCharacter;
	}
	/**
	 * @param currentCharacter
	 */
	public void setCurrentCharacter(CCharacter currentCharacter) {
		this.currentCharacter = currentCharacter;
	}
}
