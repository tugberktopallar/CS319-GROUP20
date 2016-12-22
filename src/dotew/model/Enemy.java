package dotew.model;
import java.util.ArrayList;
public class Enemy extends CCharacter {
	private ArrayList<String> scriptedDialogues;
	private ArrayList<Item> droppableItems;
	private int expPointValue;
	public Enemy()
	{
		scriptedDialogues = new ArrayList<String>();
		droppableItems = new ArrayList<Item>();
		expPointValue = 0;
	}
	public boolean addItem(Item it){
		if(droppableItems.contains(it)){
			//TODO "item already exists" oldu�u i�in exception verdir..
			return false;
		}
		else{
			boolean added = droppableItems.add(it) ? true : false;
			return added;
					
		}
	}
	public boolean addDialogue(String dialogue){
		if(scriptedDialogues.contains(dialogue)){
			//TODO "dialog already exists" oldu�u i�in exception verdir.
			return false;
		}
		else{
			boolean added = scriptedDialogues.add(dialogue) ? true : false;
			return added;
		}
	}
	public void talk (){
		//TODO : random mu se�ece�iz, belirli mi se�ece�iz dialoglar�
	}
	
	public Enemy create(String s){
		if(s != null||s.length()>0){
			char ch= s.toLowerCase().charAt(0);
			switch(ch){
			case 'o':
				return Ogre.create();
			case 'h':
				return HumanEnemy.create();
			case 'b':
				return Boss.create();
			case 'g':
				return Ghoul.create();
			default:
				return null;
			}
		}
		return null;
		
	}
	
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
