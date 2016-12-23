package dotew.model;
import java.util.ArrayList;
//Enemy yaratmayacaðýz, ghoul ogre filan yaratacaðýz diye assume edildi.
public class Enemy extends CCharacter {
	private ArrayList<String> scriptedDialogues;
	private ArrayList<Item> droppableItems;
	private int expPointValue;
	public Enemy()
	{
		scriptedDialogues = new ArrayList<String>();
		droppableItems = new ArrayList<Item>();
		expPointValue = 0;
		this.setType("enemy");
		this.makeInteractible();
	}
	public boolean addItem(Item it){
		if(droppableItems.contains(it)){
			//TODO "item already exists" olduðu için exception verdir..
			return false;
		}
		else{
			boolean added = droppableItems.add(it) ? true : false;
			return added;
					
		}
	}
	public boolean addDialogue(String dialogue){
		if(scriptedDialogues.contains(dialogue)){
			//TODO "dialog already exists" olduðu için exception verdir.
			return false;
		}
		else{
			boolean added = scriptedDialogues.add(dialogue) ? true : false;
			return added;
		}
	}
	public void talk (){
		//TODO : random mu seçeceðiz, belirli mi seçeceðiz dialoglarý
	}
	
	public static Enemy create(String s){
		//to be overwritten
		return null;
	};
	
	public ArrayList<String> getScriptedDialogues() {
		return scriptedDialogues;
	}
	public void setScriptedDialogues(ArrayList<String> scriptedDialogues) {
		this.scriptedDialogues = scriptedDialogues;
	}
	public ArrayList<Item> getDroppableItems() {
		return droppableItems;
	}
	public void setDroppableItems(ArrayList<Item> droppableItems) {
		this.droppableItems = droppableItems;
	}
	public int getExpPointValue() {
		return expPointValue;
	}
	public void setExpPointValue(int expPointValue) {
		this.expPointValue = expPointValue;
	}
	
	
}
