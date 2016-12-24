package dotew.model;

import java.util.ArrayList;

/**
 * @author ilteber
 * this class is the map where player wanders around when he/she is out of battle. Contains NPC/BattleStarter/Player objects
 */
public class Zone extends Map {
	/**
	 * 
	 */
	private NPC[] NPCList;	//npc class not defined yet
	
	//constructor
	/**
	 * @param terrainCellList : Since each Zone is a Map, it contains Terrain Cell
	 * @param characterList : The list of  Characters( NPC-Enemies-Player) in the Zone
	 * @param NPCList
	 */
	public Zone(TerrainCell[][] terrainCellList, ArrayList <CCharacter> characterList, NPC[] NPCList){
		super(terrainCellList, characterList);
		this.NPCList = NPCList;
	}
	
	//getset
	/**
	 * @return
	 */
	public NPC[] getNPCList(){
		return NPCList;
	}
	
	/**
	 * @param NPCList
	 */
	public void setNPCList(NPC[] NPCList){
		this.NPCList = NPCList;
	}
	
	/* (non-Javadoc)
	 * @see dotew.model.Map#draw()
	 */
	@Override
	public void draw(){
		super.draw();
		//gui
	}
}
