package dotew.model;

import java.util.ArrayList;

import dotew.controller.GameEngine;

public class BattleMap extends Map{
	
	private Player player;
	private Enemy[] enemies;

	public BattleMap(TerrainCell[][] terrainCellList, ArrayList <CCharacter> characterList, Player player, Enemy[] enemies){
		super(terrainCellList, characterList);
		this.player = player;
		this.enemies = enemies;
	}
	public BattleMap(){
		super();
		this.player = GameEngine.getInstance().getPlayer();
		this.enemies = new Enemy[6];
	}
	//getset
	public Player getPlayer(){
		return player;
	}
	
	public Enemy[] getEnemies(){
		return enemies;
	}
	
	public void setPlayer(Player player){
		this.player = player;
	}
	
	public void setEnemies(Enemy[] enemies){
		this.enemies = enemies;
	}
	
	@Override
	public void draw(){
		super.draw();
		//gui
	}

}
