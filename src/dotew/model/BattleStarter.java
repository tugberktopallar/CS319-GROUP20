package dotew.model;

import java.awt.Point;
import java.util.ArrayList;

import dotew.controller.GameEngine;

/**
 * @author ilteber
 *
 */
public class BattleStarter extends GameObject{
	/**
	 * 
	 */
	private BattleMap battleMapReference;
	//private BattleFactory battlefact;
	/**
	 * 
	 */
	public BattleStarter(){
		super();
		this.setType("battlestarter");
		this.setIconName("OgreTexture.png");
		this.makeInteractible();
	}
	/*public BattleMap startBattle(Player p1){
		
	}*/
	

	
	
	/**
	 * @return battleMap, The map of battle, once player hits battlestarter object, a battle is started and a new 
	 * 6x6 battlemap is created. It contains player and the enemies of the player
	 */
	public BattleMap startBattle(){
		TerrainCell [][]tCellList = new TerrainCell[6][6];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				tCellList[i][j] = new TerrainCell(false, null, new Point(i, j));
			
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
	
	/**
	 * @param p1 : This is the player
	 * @param enemyList: This is the enemies that player will fight at that battle
	 * @param tCellList: This is the list of cells of the battleMap. Each battleMap contains cells and each cell contains 
	 * a gameObject like enemy,player etc.
	 * @return
	 */
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
			return  bm;
		
		
	}
}
