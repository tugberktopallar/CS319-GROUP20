package dotew.model;
import java.util.ArrayList;
import dotew.controller.*;
/**
 * @author ilteber
 *
 */
public class NPC extends GameObject{
	/**
	 * name of npc
	 */
	private String name;
	/**
	 * dialogues of npc
	 */
	private ArrayList<String> scriptDialog;
	/**
	 * the list of quests that this npc can give
	 */
	private ArrayList<Quest> questList;
	/**
	 * the cell that NPC is on
	 */
	private TerrainCell zoneCell;
	/**
	 * constructor, makes npc interactable.
	 */
	public NPC() {
		super();
		this.makeInteractible();
	}
	/*Searches questList of ownself, if there is any quest that 
	  player hasn't done, adds the quest to the player's quest list 
	  //TODO: Eklesin mi listeye? yoksa listeye ekleyip set mi etsin? 
	*/
	/** 
	 * Iterates over all the quests of npc, if a quest is not on the player's unfinished list, gives the quest to the player
	 * @param p1: Player
	 */
	public void giveQuest(Player p1){
		for(int i = 0; i< questList.size();i++){
			if(p1.getUnfinishedQuests().contains(questList.get(i))){
				Quest q = questList.get(i);
				ArrayList<Quest> playersActiveList = p1.getActiveQuests();
				playersActiveList.add(q);
				p1.setActiveQuests(playersActiveList);
			}
		}
	}
	/**
	 * talks with the player
	 */
	public void talk(){
		GameEngine.getInstance(true, null,null).getConsoleResponder().giveResponse(scriptDialog.get(0));
	}
	/* (non-Javadoc)
	 * @see dotew.model.GameObject#getName()
	 */
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see dotew.model.GameObject#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	public ArrayList<String> getScriptDialog() {
		return scriptDialog;
	}
	/**
	 * @param scriptDialog
	 */
	public void setScriptDialog(ArrayList<String> scriptDialog) {
		this.scriptDialog = scriptDialog;
	}
	/**
	 * @return
	 */
	public ArrayList<Quest> getQuestList() {
		return questList;
	}
	/**
	 * @param questList
	 */
	public void setQuestList(ArrayList<Quest> questList) {
		this.questList = questList;
	}
	/**
	 * @return
	 */
	public TerrainCell getZoneCell() {
		return zoneCell;
	}
	/**
	 * @param zoneCell
	 */
	public void setZoneCell(TerrainCell zoneCell) {
		this.zoneCell = zoneCell;
	}
	
	
}
