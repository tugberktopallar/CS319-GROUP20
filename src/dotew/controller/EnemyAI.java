package dotew.controller;

import java.awt.Point;

import dotew.model.CCharacter;
import dotew.model.Player;
import dotew.model.Skill;

public class EnemyAI {
	/**
	 * 
	 */
	private CCharacter currentCharacter;
	/**
	 * 
	 */
	private Player player;
	
	//Constructor
	/**
	 * @param currentCharacter : current character
	 * @param player : player
	 */
	public EnemyAI(CCharacter currentCharacter, Player player) {
		
		this.currentCharacter = currentCharacter;
		this.player = player;
	}

	
	//Methods
	/**
	 * 
	 */
	public void playTurn(){
		//Get enemy name from definitions
		//use switch case for different enemies
		//cases
		//try to use skill if possible
		//try to normal attack
		//if out of range find the closest path and move closer
		//TODO
	}
	
	/**
	 * check skills of player
	 * @param s : skill 
	 * @return
	 */
	public boolean checkSkillRestrictions(Skill s){
		
		return (getCurrentCharacter().getMapCell().getPosition().distance(getPlayer().getMapCell().getPosition())) <= s.getRestriction();
		
	}
	
	
	//Getters and Setters
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


	/**
	 * @return
	 */
	public Player getPlayer() {
		return player;
	}


	/**
	 * @param player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
	
	
	
}
