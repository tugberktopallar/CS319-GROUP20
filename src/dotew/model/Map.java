package dotew.model;

import java.util.ArrayList;


public abstract class Map {
	private TerrainCell[][] terrainCellList;
	private ArrayList <CCharacter> characterList;
	
	public Map(TerrainCell[][] terrainCellList, ArrayList <CCharacter> characterList){
		this.terrainCellList = 	terrainCellList;
		this.characterList = characterList;
	}
	
	public void draw(){
		//GUI implementation
	}

	//gets
	public TerrainCell[][] getTerrainCellList(){
		return terrainCellList;
	}
	
	public ArrayList <CCharacter> getCharacterList(){
		return characterList;
	}
	
	//sets
	public void setCharacterList(TerrainCell[][] terrainCellList){
		this.terrainCellList = terrainCellList;
	}
	
	public void setTerrainCellList(ArrayList <CCharacter> characterList){
		this.characterList = characterList;
	}
}
