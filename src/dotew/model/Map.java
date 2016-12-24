package dotew.model;

import java.util.ArrayList;


/**
 * @author ilteber
 *
 */
public abstract class Map {
	/**
	 * total terrainCells in the map.
	 */
	private TerrainCell[][] terrainCellList;
	/**
	 * total characters in the cell
	 */
	private ArrayList <CCharacter> characterList;
	
	/**
	 * constructor of map. 
	 * @param terrainCellList
	 * @param characterList
	 */
	public Map(TerrainCell[][] terrainCellList, ArrayList <CCharacter> characterList){
		this.terrainCellList = 	terrainCellList;
		this.characterList = characterList;
	}
	
	/**
	 * default constructor of map
	 */
	public Map(){
		this.terrainCellList = 	null;
		this.characterList = new ArrayList<CCharacter>();
	}
	/**
	 * used for gui implementation
	 */
	public void draw(){
		//GUI implementation
	}

	//gets
	/**
	 * @return
	 */
	public TerrainCell[][] getTerrainCellList(){
		return terrainCellList;
	}
	
	/**
	 * @return
	 */
	public ArrayList <CCharacter> getCharacterList(){
		return characterList;
	}
	/**
	 * @param c1: Character to be added to the map
	 * @return result of addition.
	 */
	public boolean addCharacter(CCharacter c1){
		return characterList.add(c1);
	}
	/**
	 * @param cList: array of Characters to be added to the map
	 * @return result of addition
	 */
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
	
	/**
	 * @param terrainCellList
	 */
	public void setTerrainCellList(TerrainCell[][] terrainCellList){
		this.terrainCellList = terrainCellList;
	}
	
	/**
	 * @param characterList
	 */
	public void setCharacterList(ArrayList <CCharacter> characterList){
		this.characterList = characterList;
	}
}
