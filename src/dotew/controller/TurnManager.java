package dotew.controller;

import java.util.ArrayList;

import dotew.model.CCharacter;

public class TurnManager {
	private ArrayList characterList;
	private int turn;
	private CCharacter currentCharacter;
	
	//Constructor
	public TurnManager(ArrayList characterList) {
		
		this.characterList = characterList;
		this.turn = 0;
		
		this.currentCharacter = (CCharacter) characterList.get(0);
	}
	
	
	//Methods
	public boolean applyStatusAffects(){
		
		return getCurrentCharacter().applyStatusAffects();
	}
	
	public void passTurn(){
		
			setTurn(getTurn() + 1);
			
			setCurrentCharacter((CCharacter) getCharacterList().get(getTurn() % getCharacterList().size()));
			
			applyStatusAffects();
			
		
		
	}
	
	
	
	
	
	
	//Getters and Setters
	public ArrayList getCharacterList() {
		return characterList;
	}
	
	public void setCharacterList(ArrayList characterList) {
		this.characterList = characterList;
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public CCharacter getCurrentCharacter() {
		return currentCharacter;
	}
	public void setCurrentCharacter(CCharacter currentCharacter) {
		this.currentCharacter = currentCharacter;
	}
}
