package dotew.model;

public abstract class Map {
	private TerrainCell[] terrainCellList;
	private CCharacter[] characterList;
	
	public Map(TerrainCell[] terrainCellList, CCharacter[] characterList){
		this.terrainCellList = 	terrainCellList;
		this.characterList = characterList;
	}
	
	public void draw(){
		//GUI implementation
	}

	//gets
	public TerrainCell[] getTerrainCellList(){
		return terrainCellList;
	}
	
	public CCharacter[] getCharacterList(){
		return characterList;
	}
	
	//sets
	public void setCharacterList(TerrainCell[] terrainCellList){
		this.terrainCellList = terrainCellList;
	}
	
	public void setTerrainCellList(CCharacter[] characterList){
		this.characterList = characterList;
	}
}
