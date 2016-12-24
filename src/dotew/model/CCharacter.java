package dotew.model;

import java.util.ArrayList;
import java.util.Iterator;

	public abstract class CCharacter extends GameObject {

	
		// stats[0] = Strength , stats[1] = Intelligence
		// stats[2] = Dexterity, stats[3] = Constitution
		//Class yok ClassGame var.
		private int []stats = new int[4];
		private int health,stamina,mana,regenHp,regenMana,regenStamina;
		private TerrainCell mapCell;
		private ClassGame classOfCharacter;
		private ArrayList<TemporaryEffect> tempEffectList;
		private Zone currentZone;
		private double armorValue,attackDamage;
		//this method initializes the starting stats of the character according to the class players chooses.
		private void startUp(){
			//base stats for everyone
			for(int i = 0; i < 4; i++){
				stats[i] = 5;
			}
			//TODO: const'u nasil yapcaz?
			if(classOfCharacter.getClassName().equalsIgnoreCase("warrior")){
				stats[0]+=2;
			}
			else if (classOfCharacter.getClassName().equalsIgnoreCase("mage")){
				stats[1]+=3;
			}
			else if (classOfCharacter.getClassName().equalsIgnoreCase("rogue")){
				stats[2] +=2;
				stats[0] +=1;
			}
		}
		
		//Methods
		public boolean isDead(){
			if(health <= 0){
				return true;
			}
			return false;
		}
		public void increaseOrDecreaseStrength(int n){
	 		stats[0] += n;
		}
		public void increaseOrDecreaseIntelligence(int n){
			stats[1] += n;
		}
		public void increaseOrDecreaseDexterity(int n){
			stats[2] += n;
		}
		public void increaseOrDecreaseConstitution(int n){
			stats[3] += n;
		}
		public void addTemporaryEffect(TemporaryEffect temp){
			if(tempEffectList != null)
			{
				tempEffectList.add(temp);
			}
			else{
				tempEffectList = new ArrayList<TemporaryEffect>();
				tempEffectList.add(temp);
			}
		}
		public void deleteTemporaryEffect(TemporaryEffect tempy){
			if(tempEffectList.contains(tempy))
				tempEffectList.remove(tempy);
			else
				System.out.println("The temporary Effect to be deleted does not exists");
		}
		public void increaseOrDecreaseHealth(int n){
			health += n;
			if(health< 0)
				health = 0;
			/* else if(health>0)
				health = */
		}
		public void increaseOrDecreaseMana(int n){
			mana += n;
			if(mana< 0)
				mana = 0;
			/* else if(health>0)
				health = */
		}
		public void increaseOrDecreaseStamina(int n){
			stamina += n;
			if(stamina< 0)
				stamina = 0;
			/* else if(health>0)
				health = */
		}
		public void useSkill(CCharacter c2, Skill s1)
		{
			s1.applySkill(this, c2);
		}
		public boolean applyTemporaryEffects(){
			//TODO
			for (TemporaryEffect temporaryEffects : tempEffectList) {
				temporaryEffects.applyEffect(this);
			}
			return true;
		}
		public void normalAttack(CCharacter c1)
		{
			int attackPoint = (int)(Math.round(this.attackDamage)-c1.getArmorValue());
			if(attackPoint>0)
				c1.increaseOrDecreaseHealth((-attackPoint));
			/*
			 * else 
			 * {
			 	System.out.println("It didn't even hurt the enemy");
			 * }
			 */
		}
		
		// Bunlarin katsayisi degisebilir ilerde *10 olmak zorunda degil
		//Calculate HP
		public int calculateMaxHP(){
			return this.stats[3] * 10;
		}
		public void setMaxHP(){
			setHealth(calculateMaxHP());
		}
		
		//Calculate Stamina
		public int calculateMaxStamina(){
			return this.stats[2] * 10;
		}
		public void setMaxStamina(){
			setStamina(calculateMaxStamina());
		}
		
		//Calculate Mana
		public int calculateMaxMana(){
			return this.stats[3] * 10;
		}
		public void setMaxMana(){
			setMana(calculateMaxMana());
		}
		
		public void updateRegenValues(){
			setRegenHp(getConst()/5);
			setRegenMana(getInt()/2);
			setRegenStamina(getDex()/2);
		}
		
		public void endTurnRegen(){
			increaseOrDecreaseHealth(this.regenHp);
			increaseOrDecreaseMana(this.regenMana);
			increaseOrDecreaseStamina(this.regenStamina);
		}
		
		
		
		//Getters and Setters
		
		public int getRegenHp() {
			return regenHp;
		}
		public void setRegenHp(int regenHp) {
			this.regenHp = regenHp;
		}
		public int getRegenMana() {
			return regenMana;
		}
		public void setRegenMana(int regenMana) {
			this.regenMana = regenMana;
		}
		public int getRegenStamina() {
			return regenStamina;
		}
		public void setRegenStamina(int regenStamina) {
			this.regenStamina = regenStamina;
		}
		
		public int getStr(){
			return stats[0];
		}
		
		public int getInt(){
			return stats[1];
		}
		
		public int getDex(){
			return stats[2];
		}
		
		public int getConst(){
			return stats[3];
		}
		
		public int[] getStats() {
			return stats;
		}
		public void setStats(int[] stats) {
			this.stats = stats;
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public int getStamina() {
			return stamina;
		}
		public void setStamina(int stamina) {
			this.stamina = stamina;
		}
		public int getMana() {
			return mana;
		}
		public void setMana(int mana) {
			this.mana = mana;
		}
		public TerrainCell getMapCell() {
			return mapCell;
		}
		public void setMapCell(TerrainCell mapCell) {
			this.mapCell = mapCell;
		}
		public ClassGame getClassOfCharacter() {
			return classOfCharacter;
		}
		public void setClassOfCharacter(ClassGame classOfCharacter) {
			this.classOfCharacter = classOfCharacter;
		}
		public ArrayList<TemporaryEffect> getTempEffectList() {
			return tempEffectList;
		}
		public void setTempEffectList(ArrayList<TemporaryEffect> tempEffectList) {
			this.tempEffectList = tempEffectList;
		}
		public Zone getCurrentZone() {
			return currentZone;
		}
		public void setCurrentZone(Zone currentZone) {
			this.currentZone = currentZone;
		}
		public double getArmorValue() {
			return armorValue;
		}
		public void setArmorValue(double armorValue) {
			this.armorValue = armorValue;
		}
		public double getAttackDamage() {
			return attackDamage;
		}
		public void setAttackDamage(double attackDamage) {
			this.attackDamage = attackDamage;
		}
		public double getWeaponDamage() {
			// TODO weapons damage need Item class
			return 0;
		}
	
		
	}


