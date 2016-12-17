package dotew.model;

import java.util.ArrayList;

	public abstract class CCharacter {

	
		// stats[0] = Strength , stats[1] = Intelligence
		// stats[2] = Dexterity, stats[3] = Constitution
		//Class yok ClassGame var.
		private int []stats;
		private int health,stamina,mana;

		private TerrainCell mapCell;

		private ClassGame classOfCharacter;
		private ArrayList<TemporaryEffects> tempEffectList;
		private Zone currentZone;
		private double armorValue,attackDamage;
		
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
		public void addTemporaryEffect(TemporaryEffects temp){
			if(tempEffectList != null)
			{
				tempEffectList.add(temp);
			}
			else{
				tempEffectList = new ArrayList<TemporaryEffects>();
				tempEffectList.add(temp);
			}
		}
		public void deleteTemporaryEffect(TemporaryEffects tempy){
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
		public void useSkill(CCharacter c1, Skill s1)
		{
			//TODO
		}
		public void applyTemporaryEffects(){
			//TODO
		}
		public void normalAttack(CCharacter c1)
		{
			int attackPoint = (int)(Math.round(attackDamage)-c1.getArmorValue());
			if(attackPoint>0)
				c1.increaseOrDecreaseHealth((-attackPoint));
			/*
			 * else 
			 * {
			 	System.out.println("It didn't even hurt the enemy");
			 * }
			 */
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
		public ArrayList<TemporaryEffects> getTempEffectList() {
			return tempEffectList;
		}
		public void setTempEffectList(ArrayList<TemporaryEffects> tempEffectList) {
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
	
		
	}


