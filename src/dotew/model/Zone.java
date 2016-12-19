package dotew.model;

public class Zone extends Map {
	private NPC[] NPCList;	//npc class not defined yet
	
	//constructor
	public Zone(TerrainCell[] terrainCellList, CCharacter[] characterList, NPC[] NPCList){
		super(terrainCellList, characterList);
		this.NPCList = NPCList;
	}
	
	//getset
	public NPC[] getNPCList(){
		return NPCList;
	}
	
	public void setNPCList(NPC[] NPCList){
		this.NPCList = NPCList;
	}
	
	@Override
	public void draw(){
		//gui
	}
}
