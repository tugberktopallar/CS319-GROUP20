package dotew.model;
import java.util.ArrayList;
public class NPC extends GameObject{
	private String name;
	private ArrayList<String> scriptDialog;
	private ArrayList<Quest> questList;
	private TerrainCell zoneCell;
	public NPC() {
		super();
	}
	/*Searches questList of ownself, if there is any quest that 
	  player hasn't done, adds the quest to the player's quest list 
	  //TODO: Eklesin mi listeye? yoksa listeye ekleyip set mi etsin? 
	*/
	public void giveQuest(Player p1,int choice){
		for(int i = 0; i< questList.size();i++){
			if(p1.getUnfinishedQuests().contains(questList.get(i))){
				Quest q = questList.get(i);
				ArrayList<Quest> playersActiveList = p1.getActiveQuests();
				playersActiveList.add(q);
				p1.setActiveQuests(playersActiveList);
			}
		}
	}
	public void talk(){
		//TODO: talk methodu rastgele bir þey mi söyletsin? yoksa interaktif bir þey mi?
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getScriptDialog() {
		return scriptDialog;
	}
	public void setScriptDialog(ArrayList<String> scriptDialog) {
		this.scriptDialog = scriptDialog;
	}
	public ArrayList<Quest> getQuestList() {
		return questList;
	}
	public void setQuestList(ArrayList<Quest> questList) {
		this.questList = questList;
	}
	public TerrainCell getZoneCell() {
		return zoneCell;
	}
	public void setZoneCell(TerrainCell zoneCell) {
		this.zoneCell = zoneCell;
	}
	
	
}
