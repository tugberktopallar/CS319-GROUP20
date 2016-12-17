package dotew.controller;

import dotew.model.CCharacter;
import dotew.model.Player;
import dotew.model.Skill;

public class EnemyAI {
	private CCharacter currentCharacter;
	private Player player;
	
	//Constructor
	public EnemyAI(CCharacter currentCharacter, Player player) {
		
		this.currentCharacter = currentCharacter;
		this.player = player;
	}

	
	//Methods
	public void playTurn(){
		//TODO
	}
	
	public boolean checkSkillRestrictions(Skill s){
		//TODO
		return false;
	}
	
	
	//Getters and Setters
	public CCharacter getCurrentCharacter() {
		return currentCharacter;
	}


	public void setCurrentCharacter(CCharacter currentCharacter) {
		this.currentCharacter = currentCharacter;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
	
	
	
}
