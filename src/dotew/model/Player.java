package dotew.model;
import java.util.ArrayList;
import dotew.model.Inventory;
import dotew.controller.QuestManager;
import dotew.controller.GameEngine;
/**
 *
 */
public class Player extends CCharacter{
	/**
	 * inventory of the player
	 */
	private Inventory inventory;
	/**
	 * level of the player
	 */
	private int level;
	/**
	 * experience points of the player
	 */
	private int expPoints;
	/**
	 * the list of items that player equipped
	 */
	private ArrayList<Item> equipments;
	/**
	 * the list of unfinished quests 
	 */
	private ArrayList<Quest> unfinishedQuests;
	/**
	 * list of active quests(not finished but taken)
	 */
	private ArrayList<Quest> activeQuests;
	/**
	 * list of finished quests
	 */
	private ArrayList<Quest> finishedQuests;
	/**
	 * total kill count of the player
	 */
	private int enemyKillCount;
	/**
	 * player instance
	 */
	private static Player player;
	/**
	 * exp requirements for each level
	 */
	private int [] expRequirements;
	
	/**
	 * constructor creates empty inventory, equipments,questslist,expRequirements array. Makes level = 1 and sets weight limit to str*10
	 */
	private Player(){
		super();
		//TODO: Class'i parametre alsak sonra onu set etsek ona göre startUp() methodu çaðýrsak?
		//this.makeInteractible();
		this.setIconName("WarriorTexture.png");
		inventory = new Inventory();
		level=1;
		expPoints = 0;
		equipments = new ArrayList<Item>();
		
		unfinishedQuests = new ArrayList<Quest>();
//		for(Quest q : GameEngine.getInstance().getQuestManager().getAllQuestsInTheGame()){
//			unfinishedQuests.add(q);
//		}
		
		activeQuests = new ArrayList<Quest>();
		finishedQuests = new ArrayList<Quest>();
		
		expRequirements= new int[2]; //2 level olsun?
		// playerx
		this.inventory.setWeightLimit(this.getStr()*10);
	}
	
	
	/**
	 * clears all temporary effects of the player
	 */
	public void clearAllStatusEffects(){
		getTempEffectList().clear();
	}
	/**
	 * @param stat : stat to be changed
	 * @param amount : amount of stat to change
	 */
	public void changeTemporaryStat(String stat, int amount){
		if(stat.equalsIgnoreCase("Strength"))
		{
			super.increaseOrDecreaseHealth(amount);
		}
		else if(stat.equalsIgnoreCase("Intelligence")){
			super.increaseOrDecreaseIntelligence(amount);
		}
		else if(stat.equalsIgnoreCase("Dexterity")){
			super.increaseOrDecreaseDexterity(amount);
		}
		else if(stat.equalsIgnoreCase("Intelligence")){
			super.increaseOrDecreaseConstitution(amount);
		}
		//burada bilmemkaï¿½ turn sonra nasï¿½l adamï¿½n statï¿½nï¿½ eski hale koyacaï¿½ï¿½z?
	}
	/**
	 * increments level and makes exp points = 0 and increases stats by 10
	 */
	public void levelUp(){
		if(level <=3){
			level++;
			expPoints = 0;
		}
		this.increaseOrDecreaseStrength(2);
		this.increaseOrDecreaseDexterity(2);
		this.increaseOrDecreaseIntelligence(2);
		this.increaseOrDecreaseConstitution(2);
		this.inventory.setWeightLimit(this.getStr()*10);
	}
	
	/**
	 * @param exp : experience point to be added
	 */
	public void addExp(int exp){
		if(exp>=0){
			expPoints += exp;
			if(expPoints >expRequirements[level-1]){
				int extra = expPoints - expRequirements[level-1];
				levelUp();
				expPoints = extra;
			}
		}
	}
	
	/**
	 * Equips item if it is on the inventory and it is not equipped yet. 
	 * @param toBeEquipped : Item to be equipped 
	 * @return result of equipping item
	 */
	public boolean equipItem(Item toBeEquipped){
		String typeToBe,typeCurrently;
		boolean equipped = false;
		//if the given item is on inventory
		if(inventory.getItemList().contains(toBeEquipped)){
			typeToBe = toBeEquipped.getType();
			//checking if player has equipment with given type. If so we'll remove the old item and add the new item
			//from inventory
			for(int i = 0; i < equipments.size()&& !equipped; i++){
				Item eq = equipments.get(i);
				typeCurrently = eq.getType();
				if(typeCurrently.equalsIgnoreCase(typeToBe)){
					equipments.remove(eq);
					equipments.add(toBeEquipped);
					equipped = true;
				}
			}
			// Player has no equipment with the given type
			if(!equipped){
				equipments.add(toBeEquipped);
				return true;
			}
			return false;
		}
		else{
			//System.out.println("Item" + toBeEquipped.name()+" is not on your inventory")
			return false;
		}
	
			
	}
	/**
	 * displays inventory
	 */
	public void displayInventory(){
		//		System.out.println(inventory);
		//TODO o konsol bu konsol degil abi. compilerin konsolunu kullanmiyoruz!!!!
		//oke
	}
	/**
	 * finds item on inventory
	 * @param itemName: item to be found
	 * @return
	 */
	public Item findItem(String itemName){
		for(Item it : inventory.getItemList()){
			if(it.getName().equalsIgnoreCase(itemName))
				return it;
		}
		return null;
	}
	//type = Weapon,Armor
	//
	/**
	 * updates Attack and armor values, used after each equipment operation
	 */
	public void updateAttackArmorValue(){
		double baseDamageSum = 0,baseArmorProtectionSum = 0;
		int baseStrengthSum = 0;
		for(Item it: equipments){
			if(it.getType().equalsIgnoreCase("Weapon")){
				baseDamageSum += ((Weapon)it).getBaseDamage();
			}
			else if (it.getType().equalsIgnoreCase("Armor")){
				baseArmorProtectionSum += ((Armor)it).getBaseProtection();
				baseStrengthSum += ((Armor)it).getBaseStrength();
			}
		}
		super.setArmorValue(baseArmorProtectionSum);
		super.setAttackDamage(baseDamageSum);
		
	}
	
	/**
	 * this class is singleton
	 * @return player object.
	 */
	public static Player getInstance(){
		if(player == null){
			player = new Player();
			return player;
		}
		else
			return player;
	}
	
	//getter-setters
	/**
	 * @return
	 */
	public ArrayList<Quest> getUnfinishedQuests() {
		return unfinishedQuests;
	}
	/**
	 * @param unfinishedQuests
	 */
	public void setUnfinishedQuests(ArrayList<Quest> unfinishedQuests) {
		this.unfinishedQuests = unfinishedQuests;
	}
	/**
	 * @return
	 */
	public ArrayList<Quest> getActiveQuests() {
		return activeQuests;
	}
	/**
	 * @param activeQuests
	 */
	public void setActiveQuests(ArrayList<Quest> activeQuests) {
		this.activeQuests = activeQuests;
	}
	/**
	 * @return
	 */
	public ArrayList<Quest> getFinishedQuests() {
		return finishedQuests;
	}
	/**
	 * @param finishedQuests
	 */
	public void setFinishedQuests(ArrayList<Quest> finishedQuests) {
		this.finishedQuests = finishedQuests;
	}


	/**
	 * @return
	 */
	public Inventory getInventory() {
		return inventory;
	}


	/**
	 * @param inventory
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}


	/**
	 * @return
	 */
	public int getLevel() {
		return level;
	}


	/**
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}


	/**
	 * @return
	 */
	public int getExpPoints() {
		return expPoints;
	}


	/**
	 * @param expPoints
	 */
	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}


	/**
	 * @return
	 */
	public ArrayList<Item> getEquipments() {
		return equipments;
	}


	/**
	 * @param equipments
	 */
	public void setEquipments(ArrayList<Item> equipments) {
		this.equipments = equipments;
	}


	/**
	 * @return
	 */
	public int getEnemyKillCount() {
		return enemyKillCount;
	}


	/**
	 * @param enemyKillCount
	 */
	public void setEnemyKillCount(int enemyKillCount) {
		this.enemyKillCount = enemyKillCount;
	}


	/**
	 * @return
	 */
	public int[] getExpRequirements() {
		return expRequirements;
	}


	/**
	 * @param expRequirements
	 */
	public void setExpRequirements(int[] expRequirements) {
		this.expRequirements = expRequirements;
	}
}




