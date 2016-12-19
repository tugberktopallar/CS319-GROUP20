package dotew.model;

public class BattleMap extends Map{
	
	private Player player;
	private Enemies[] enemies; //enemies class not implemented yet

	public BattleMap(TerrainCell[] terrainCellList, CCharacter[] characterList, Player player, Enemies[] enemies){
		super(terrainCellList, characterList);
		this.player = player;
		this.enemies = enemies;
	}
	//getset
	public Player getPlayer(){
		return player;
	}
	
	public Enemies[] getEnemies(){
		return enemies;
	}
	
	public void setPlayer(Player player){
		this.player = player;
	}
	
	public void setEnemies(Enemies[] enemies){
		this.enemies = enemies;
	}
	
	@Override
	public void draw(){
		//gui
	}

}
