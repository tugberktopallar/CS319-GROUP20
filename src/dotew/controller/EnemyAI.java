package dotew.controller;

import java.awt.Point;

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
		//Get enemy name from definitions
		//use switch case for different enemies
		//cases
		//try to use skill if possible
		//try to normal attack
		//if out of range find the closest path and move closer
		//TODO
	}
	
	public boolean checkSkillRestrictions(Skill s){
		
		return (getCurrentCharacter().getMapCell().getPosition().distance(getPlayer().getMapCell().getPosition())) <= s.getRestriction();
		
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
