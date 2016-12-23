package dotew.model;

import java.util.ArrayList;


public abstract class Map {
	private TerrainCell[][] terrainCellList;
	private ArrayList <CCharacter> characterList;
	
	public Map(TerrainCell[][] terrainCellList, ArrayList <CCharacter> characterList){
		this.terrainCellList = 	terrainCellList;
		this.characterList = characterList;
	}
	
	public Map(){
		
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
	public boolean addCharacter(CCharacter c1){
		return characterList.add(c1);
	}
	public boolean addCharacters(CCharacter[] cList){
		for(int i = 0 ; i < cList.length; i++){
			if(cList[i]!= null){
				characterList.add(cList[i]);
				
			}
			else{
				throw new NullPointerException("in addCharacters method of Map");
			}
		}
		return true;
	}
	//sets
	
	public void setTerrainCellList(TerrainCell[][] terrainCellList){
		this.terrainCellList = terrainCellList;
	}
	
	public void setCharacterList(ArrayList <CCharacter> characterList){
		this.characterList = characterList;
	}
}
