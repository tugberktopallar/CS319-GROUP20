package dotew.model;

public class BattleStarter extends GameObject{
	private BattleMap battleMapReference;
	//private BattleFactory battlefact;
	public BattleStarter(){
		super();
		this.setType("battlestarter");
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
	
	private BattleMap createBattleMap(Player p1,Enemy[] enemyList,TerrainCell[][] tCellList){
		//TODO: draw kismi.
		Map bm = new BattleMap();
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
