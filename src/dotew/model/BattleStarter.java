package dotew.model;

import java.awt.Point;
import java.util.ArrayList;

import dotew.controller.GameEngine;

public class BattleStarter extends GameObject{
	private BattleMap battleMapReference;
	//private BattleFactory battlefact;
	public BattleStarter(){
		super();
		this.setType("battlestarter");
		this.setIconName("OgreTexture.png");
		this.makeInteractible();
	}
	/*public BattleMap startBattle(Player p1){
		
	}*/
	
	/*
	 * Reads the Enemy Information  stored in the text file with given filename
	 * Contens of the textFile is like:
	 * Number of Enemies
	 * The path of the battleMap background image.
	 * Enemy Type1
	 * Enemy class1
	 * Enemy level1
	 * EnemyType2
	 * Enemyclass2
	 * Enemytype2
	 * ...and So on.
	 */
	//bu adam terraincell list döndürsün bari :(
	
	/*private String[] readFile(String fname){
		
	}*/
	
	
	public BattleMap startBattle(){
		TerrainCell [][]tCellList = new TerrainCell[6][6];
		TerrainCell tCell = null;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				tCell = new TerrainCell(false, null, new Point(i, j));
				tCellList[i][j] = tCell;
			}
			
		}
		EnemyFactory ef = EnemyFactory.getInstance();
		Enemy e1 = ef.getEnemy("o");
		Enemy e2 = ef.getEnemy("o");
		
		e1.settCell(tCellList[0][0]);
		tCellList[0][0].setGameObject(e1);
		
		e2.settCell(tCellList[3][0]);
		tCellList[3][0].setGameObject(e2);
		
		Player p = GameEngine.getInstance().getPlayer();
		p.setMapCell(tCellList[5][3]);
		tCellList[5][3].setGameObject(p);
		
		Enemy[] chrList = new Enemy[2];
		
		chrList[0] = e1;
		chrList[1] = e2;
		
		return createBattleMap(p, chrList, tCellList);
		
		
		
		
	}
	
	private BattleMap createBattleMap(Player p1,Enemy[] enemyList,TerrainCell[][] tCellList){
		//TODO: draw kismi.
		System.out.println("create battle");
		BattleMap bm = new BattleMap();
		try{
			bm.addCharacter(p1);
			bm.addCharacters(enemyList);
			bm.setTerrainCellList(tCellList);
		}
		catch(NullPointerException ex){
			ex.printStackTrace();
			bm = null;
		}
			return (BattleMap) bm;
		
		
	}
}
