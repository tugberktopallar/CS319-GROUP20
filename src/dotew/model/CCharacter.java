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
		/**
		 * @return true if character is Dead( Health <= 0 ) , false if he is alive.
		 */
		public boolean isDead(){
			if(health <= 0){
				return true;
			}
			return false;
		}
		/**
		 * this method changes the strength by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases
		 * @param n : amount of strength decreased/increased 
		 */
		public void increaseOrDecreaseStrength(int n){
	 		stats[0] += n;
		}
		/**
		 * this method changes the intelligence by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases
		 * @param n : amount of intelligence decreased/increased 
		 */
		public void increaseOrDecreaseIntelligence(int n){
			stats[1] += n;
		}
		/**
		 * this method changes the dexterity by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases
		 * @param n : amount of dexterity decreased/increased 
		 */
		public void increaseOrDecreaseDexterity(int n){
			stats[2] += n;
		}
		/**
		 * this method changes the constitution by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases
		 * @param n : amount of constitution decreased/increased 
		 */
		public void increaseOrDecreaseConstitution(int n){
			stats[3] += n;
		}
		/**
		 * This method adds a temporary effect to character's temporary Effect Arraylist.
		 * @param temp : effect to be added
		 */
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
		/**
		 * This method deletes the passed temporary effect from character's temporary Effect Arraylist.
		 * @param tempy : effect to be deleted
		 */
		public void deleteTemporaryEffect(TemporaryEffect tempy){
			if(tempEffectList.contains(tempy))
				tempEffectList.remove(tempy);
			else
				System.out.println("The temporary Effect to be deleted does not exists");
		}
		/**
		 * this method changes the health by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases. 
		 * If the resulting summation is less than zero, it will be set to zero. 
		 * @param n : amount of health decreased/increased 
		 */
		public void increaseOrDecreaseHealth(int n){
			health += n;
			if(health< 0)
				health = 0;
			/* else if(health>0)
				health = */
		}
		/**
		 * this method changes the mana by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases. 
		 * If the resulting summation is less than zero, it will be set to zero. 
		 * @param n : amount of mana decreased/increased 
		 */
		public void increaseOrDecreaseMana(int n){
			mana += n;
			if(mana< 0)
				mana = 0;
			/* else if(health>0)
				health = */
		}
		/**
		 * this method changes the stamina by adding the value passed as parameter. 
		 * If it is negative it reduces, if it is positive it increases. 
		 * If the resulting summation is less than zero, it will be set to zero. 
		 * @param n : amount of stamina decreased/increased 
		 */
		public void increaseOrDecreaseStamina(int n){
			stamina += n;
			if(stamina< 0)
				stamina = 0;
			/* else if(health>0)
				health = */
		}
		/**
		 * This method applies the passed skill to the passed character
		 * @param c2 : The character that skill is applied to.
		 * @param s1 : The skill to be applied.
		 */
		public void useSkill(CCharacter c2, Skill s1)
		{
			s1.applySkill(this, c2);
		}
		/**
		 * 	This method applies all the temporary effects on his/her list to the character.
		 *  Used at the start of each turn.
		 * @return true if all the temporary effects are applied successfully.
		 */
		public boolean applyTemporaryEffects(){
			//TODO
			for (TemporaryEffect temporaryEffects : tempEffectList) {
				temporaryEffects.applyEffect(this);
			}
			return true;
		}
		/**
		 * Attacks to the character that passed as parameter. This is not a skill attack. 
		 * c1's health is decreased after attack, the amount to decrease is (attackDamage of attacker - armorvalue of receiver)
		 * @param c1 : character that is attacked. 
		 */
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
		/**
		 *  Health point is calculated with Constitiution * 10 formula 
		 * @return calculated health point
		 */
		public int calculateMaxHP(){
			return this.stats[3] * 10;
		}
		/**
		 * sets the maximum health point to strength*10.
		 */
		public void setMaxHP(){
			setHealth(calculateMaxHP());
		}
		
		/**
		 *  stamina point is calculated with dexterity * 10 formula 
		 * @return calculated stamina point
		 */
		public int calculateMaxStamina(){
			return this.stats[2] * 10;
		}
		/**
		 * sets the maximum stamina point to dexterity*10.
		 */
		public void setMaxStamina(){
			setStamina(calculateMaxStamina());
		}
		
		/**
		 *  mana point is calculated with intelligence * 10 formula 
		 * @return calculated mana point
		 */
		public int calculateMaxMana(){
			return this.stats[3] * 10;
		}
		/**
		 * sets the maximum mana point to intelligence*10.
		 */
		public void setMaxMana(){
			setMana(calculateMaxMana());
		}
		
		/**
		 *  With given amounts, character regenerates health,mana,stamina at the beginning of each turn.
		 */
		public void updateRegenValues(){
			setRegenHp(getConst()/5);
			setRegenMana(getInt()/2);
			setRegenStamina(getDex()/2);
		}
		
		/**
		 *  With the given amounts, character regenerates health,mana,stamina at the beginning of each turn.
		 */
		public void endTurnRegen(){
			increaseOrDecreaseHealth(this.regenHp);
			increaseOrDecreaseMana(this.regenMana);
			increaseOrDecreaseStamina(this.regenStamina);
		}
		
		
		
		//Getters and Setters
		
		/**
		 * @return regeneration rate of health points
		 */
		public int getRegenHp() {
			return regenHp;
		}
		/**
		 * @param regenHp : amount of regeneration rate of health points
		 */
		public void setRegenHp(int regenHp) {
			this.regenHp = regenHp;
		}
		/**
		 * @return regeneration rate of mana points
		 */
		public int getRegenMana() {
			return regenMana;
		}
		/**
		 * @param regenHp : amount of regeneration rate of mana points
		 */
		public void setRegenMana(int regenMana) {
			this.regenMana = regenMana;
		}
		/**
		 * @return regeneration rate of stamina points
		 */
		public int getRegenStamina() {
			return regenStamina;
		}
		/**
		 * @param regenHp : amount of regeneration rate of stamina points
		 */
		public void setRegenStamina(int regenStamina) {
			this.regenStamina = regenStamina;
		}
		
		/**
		 * @return strength
		 */
		public int getStr(){
			return stats[0];
		}
		
		/**
		 * @return intelligence
		 */
		public int getInt(){
			return stats[1];
		}
		
		/**
		 * @return dexterity 
		 */
		public int getDex(){
			return stats[2];
		}
		
		/**
		 * @return constitution
		 */
		public int getConst(){
			return stats[3];
		}
		
		/**
		 * @return all stats
		 */
		public int[] getStats() {
			return stats;
		}
		/**
		 * @param stats
		 */
		public void setStats(int[] stats) {
			this.stats = stats;
		}
		/**
		 * @return Health points
		 */
		public int getHealth() {
			return health;
		}
		/**
		 * @param health
		 */
		public void setHealth(int health) {
			this.health = health;
		}
		/**
		 * @return stamina of the character
		 */
		public int getStamina() {
			return stamina;
		}
		/**
		 * @param stamina of the character
		 */
		public void setStamina(int stamina) {
			this.stamina = stamina;
		}
		/**
		 * @return mana of the character
		 */
		public int getMana() {
			return mana;
		}
		/**
		 * @param mana of the character
		 */
		public void setMana(int mana) {
			this.mana = mana;
		}
		/**
		 * @return the cell that character is on
		 */
		public TerrainCell getMapCell() {
			return mapCell;
		}
		/**
		 * @param mapCell is the  cell that character is on
		 */
		public void setMapCell(TerrainCell mapCell) {
			this.mapCell = mapCell;
		}
		/**
		 * @return the class of character
		 */
		public ClassGame getClassOfCharacter() {
			return classOfCharacter;
		}
		/**
		 * @param classOfCharacter
		 */
		public void setClassOfCharacter(ClassGame classOfCharacter) {
			this.classOfCharacter = classOfCharacter;
		}
		/**
		 * @return
		 */
		public ArrayList<TemporaryEffect> getTempEffectList() {
			return tempEffectList;
		}
		/**
		 * @param tempEffectList
		 */
		public void setTempEffectList(ArrayList<TemporaryEffect> tempEffectList) {
			this.tempEffectList = tempEffectList;
		}
		/**
		 * @return
		 */
		public Zone getCurrentZone() {
			return currentZone;
		}
		/**
		 * @param currentZone
		 */
		public void setCurrentZone(Zone currentZone) {
			this.currentZone = currentZone;
		}
		/**
		 * @return
		 */
		public double getArmorValue() {
			return armorValue;
		}
		/**
		 * @param armorValue
		 */
		public void setArmorValue(double armorValue) {
			this.armorValue = armorValue;
		}
		/**
		 * @return
		 */
		public double getAttackDamage() {
			return attackDamage;
		}
		/**
		 * @param attackDamage
		 */
		public void setAttackDamage(double attackDamage) {
			this.attackDamage = attackDamage;
		}
		/**
		 * @return
		 */
		public double getWeaponDamage() {
			// TODO weapons damage need Item class
			return 0;
		}
	
		
	}


