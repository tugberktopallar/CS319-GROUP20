package dotew.model;

import java.awt.Image;

/**
 * @author ilteber
 *
 */
public class Weapon extends WearableItem{
    /**
     * 
     */
    private int baseDamage;
	/**
	 * @param description of weapon
	 * @param type of weapon
	 * @param name of weapon
	 * @param weight  of weapon
	 * @param icon: icon of weapon
	 * @param baseDamage : amount of the base damage of weapon
	 */
	public Weapon(String description, String type, String name,double weight, Image icon, int baseDamage) {
		super(description, type, name, weight, icon);
		this.baseDamage = baseDamage;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return baseDamage
	 */
	public int getBaseDamage() {
		return baseDamage;
	}
	/**
	 * @param baseDamage
	 */
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
}
