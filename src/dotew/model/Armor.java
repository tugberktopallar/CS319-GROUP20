package dotew.model;

import java.awt.Image;

/**
 * @author ilteber
 *
 */
public class Armor extends WearableItem {
	/**
	 * 
	 */
	private int baseStrength;
	//TODO: baseStrength'i kullanmadýk daha.
	/**
	 * 
	 */
	private double baseProtection;
	/**
	 * @param description : description of the armor
	 * @param type : this is "armor"
	 * @param name: Name of the armor. Something like "Nightingale gloves" etc.
	 * @param weight : weight of the armor
	 * @param icon : this is the icon of the armor that user will see on the screen
	 */
	public Armor(String description,String type,String name, double weight, Image icon) {
		super(description, type, name, weight, icon);
		baseStrength = 0;
		baseProtection = 0;
	}
	/**
	 * @return baseStrength is the amount of strength stat this armor increases once it is equipped
	 */
	public int getBaseStrength() {
		
		return baseStrength;
	}
	/**
	 * @param baseStrength is the amount of strength stat this armor increases once it is equipped
	 */
	public void setBaseStrength(int baseStrength) {
		if(baseStrength > 0)
			this.baseStrength = baseStrength;
	}
	/**
	 * @return baseProtection : Amount of damage this armor omits when player is attacked.
	 */
	public double getBaseProtection() {
		return baseProtection;
	}
	/**
	 * @param baseProtection : Amount of damage this armor omits when player is attacked.
	 */
	public void setBaseProtection(double baseProtection) {
		if (baseProtection>0)
			this.baseProtection = baseProtection;
	}
	

}
