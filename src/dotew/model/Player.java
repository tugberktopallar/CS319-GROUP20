package dotew.model;
import java.util.ArrayList;
import dotew.model.Inventory;

public class Player extends CCharacter{
	private Inventory inventory;
	private int level;
	private int expPoints;
	private ArrayList<Item> equipments;
	private ArrayList<Quest> unfinishedQuests;
	private ArrayList<Quest> activeQuests;
	private ArrayList<Quest> finishedQuests;
	private int enemyKillCount;
	private Player playerx;
	private int [] expRequirements;
	
	private Player(){
		super();
		inventory = new Inventory();
		level=1;
		expPoints = 0;
		equipments = new ArrayList<Item>();
		unfinishedQuests = new ArrayList<Quest>();
		activeQuests = new ArrayList<Quest>();
		finishedQuests = new ArrayList<Quest>();
		//TODO : unfinished Quest'lere eklemeler yapýlacak(ilk baþta bütün questler unfinished)
		expRequirements= new int[4]; //4 level olsun?
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
		//burada bilmemkaç turn sonra nasýl adamýn statýný eski hale koyacaðýz?
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
		if(inventory.contains(toBeEquipped)){
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
			}
		}
		else{
			//System.out.println("Item" + toBeEquipped.name()+" is not on your inventory")
		}
	
			
	}
	public void displayInventory(){
		System.out.println(inventory);
	}
	public Item findItem(String itemName){
		for(Item it: inventory){
			if(it.getName().equalsIgnoreCase(itemName))
				return it;
		}
		return null;
	}
	//type = Weapon,Armor
	//baseStrength yaptýk, onun için CCharacter'e strength setter'ý konacak.
	public void updateAttackArmorValue(){
		double baseDamageSum = 0,baseArmorProtectionSum = 0;
		int baseStrengthSum = 0;
		for(Item it: equipments){
			if(it.getType().equalsIgnoreCase("Weapon")){
				baseDamageSum += it.getBaseDamage();
			}
			else if (item.getType().equalsIgnoreCase("Armor")){
				baseArmorProtectionSum += it.getBaseProtection();
				baseStrengthSum += it.getBaseStrength();
			}
		}
		super.setArmorValue(baseArmorProtectionSum);
		super.setAttackDamage(baseDamageSum);
		
	}
	public Player getInstance(){
		if(playerx == null){
			playerx = new Player();
			return playerx;
		}
		else
			return playerx;
	}
	
}


}
