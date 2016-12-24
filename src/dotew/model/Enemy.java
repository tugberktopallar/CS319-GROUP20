package dotew.model;
import java.util.ArrayList;

/**
 * @author ilteber
 * Enemy of the player .
 */
public class Enemy extends CCharacter {
	/**
	 *  Dialogues of the Enemy. Whenever Character encounters with enemy, enemy says something listed in scripted Dialogues
	 */
	private ArrayList<String> scriptedDialogues;
	/**
	 *  the Items that can drop from this Enemy
	 */
	private ArrayList<Item> droppableItems;
	/**
	 * Amount of experience points that can player get by killing monster
	 */
	private int expPointValue;
	/**
	 * default constructor initializes the lists to empty
	 * exp point value to zero, sets type to enemy and makes the enemy interactible.
	 */
	public Enemy()
	{
		scriptedDialogues = new ArrayList<String>();
		droppableItems = new ArrayList<Item>();
		expPointValue = 0;
		this.setType("enemy");
		this.makeInteractible();
	}
	/**
	 * adds passed item to droppable Items list of enemy 
	 * @param it : the item to be added
	 * @return result of addition( false if it already exists in list and cannot be added)
	 */
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
	/**
	 * @param dialogue: dialogue to be added
	 * @return the result of addition(false if it already exists in the list)
	 */
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
	/**
	 * 
	 */
	public void talk (){
		//TODO : random mu seçeceðiz, belirli mi seçeceðiz dialoglarý
	}
	
	/**
	 * This method will be overriden in ogre,ghoul,boss,humanenemy classes
	 * @param s
	 * @return
	 */
	public static Enemy create(String s){
		//to be override
		return null;
	};
	//getter setters
	/**
	 * @return
	 */
	public ArrayList<String> getScriptedDialogues() {
		return scriptedDialogues;
	}
	/**
	 * @param scriptedDialogues
	 */
	public void setScriptedDialogues(ArrayList<String> scriptedDialogues) {
		this.scriptedDialogues = scriptedDialogues;
	}
	/**
	 * @return
	 */
	public ArrayList<Item> getDroppableItems() {
		return droppableItems;
	}
	/**
	 * @param droppableItems
	 */
	public void setDroppableItems(ArrayList<Item> droppableItems) {
		this.droppableItems = droppableItems;
	}
	/**
	 * @return
	 */
	public int getExpPointValue() {
		return expPointValue;
	}
	/**
	 * @param expPointValue
	 */
	public void setExpPointValue(int expPointValue) {
		this.expPointValue = expPointValue;
	}
	
	
}
