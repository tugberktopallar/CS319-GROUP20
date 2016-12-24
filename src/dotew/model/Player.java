package dotew.model;
import java.util.ArrayList;
import dotew.model.Inventory;
import dotew.controller.QuestManager;
import dotew.controller.GameEngine;
public class Player extends CCharacter{
	private Inventory inventory;
	private int level;
	private int expPoints;
	private ArrayList<Item> equipments;
	private ArrayList<Quest> unfinishedQuests;
	private ArrayList<Quest> activeQuests;
	private ArrayList<Quest> finishedQuests;
	private int enemyKillCount;
	private static Player player;
	private int [] expRequirements;
	
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
	}
	
	
	public void clearAllStatusEffects(){
		getTempEffectList().clear();
	}
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
	public void levelUp(){
		if(level <=3){
			level++;
			expPoints = 0;
		}
	}
	
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
	//Item'a type ve name eklenecek
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
	public void displayInventory(){
		//		System.out.println(inventory);
		//TODO o konsol bu konsol degil abi. compilerin konsolunu kullanmiyoruz!!!!
		//oke
	}
	public Item findItem(String itemName){
		for(Item it : inventory.getItemList()){
			if(it.getName().equalsIgnoreCase(itemName))
				return it;
		}
		return null;
	}
	//type = Weapon,Armor
	//baseStrength yaptï¿½k, onun iï¿½in CCharacter'e strength setter'ï¿½ konacak.
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
	
	public static Player getInstance(){
		if(player == null){
			player = new Player();
			return player;
		}
		else
			return player;
	}
	
	//getter-setters
	public ArrayList<Quest> getUnfinishedQuests() {
		return unfinishedQuests;
	}
	public void setUnfinishedQuests(ArrayList<Quest> unfinishedQuests) {
		this.unfinishedQuests = unfinishedQuests;
	}
	public ArrayList<Quest> getActiveQuests() {
		return activeQuests;
	}
	public void setActiveQuests(ArrayList<Quest> activeQuests) {
		this.activeQuests = activeQuests;
	}
	public ArrayList<Quest> getFinishedQuests() {
		return finishedQuests;
	}
	public void setFinishedQuests(ArrayList<Quest> finishedQuests) {
		this.finishedQuests = finishedQuests;
	}


	public Inventory getInventory() {
		return inventory;
	}


	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getExpPoints() {
		return expPoints;
	}


	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}


	public ArrayList<Item> getEquipments() {
		return equipments;
	}


	public void setEquipments(ArrayList<Item> equipments) {
		this.equipments = equipments;
	}


	public int getEnemyKillCount() {
		return enemyKillCount;
	}


	public void setEnemyKillCount(int enemyKillCount) {
		this.enemyKillCount = enemyKillCount;
	}


	public int[] getExpRequirements() {
		return expRequirements;
	}


	public void setExpRequirements(int[] expRequirements) {
		this.expRequirements = expRequirements;
	}
}




