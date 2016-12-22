package dotew.model;

import java.awt.Image;

public class Armor extends WearableItem {
	private int baseStrength;
	//TODO: baseStrength'i kullanmadýk daha.
	private double baseProtection;
	public Armor(String description,String type,String name, double weight, Image icon) {
		super(description, type, name, weight, icon);
		baseStrength = 0;
		baseProtection = 0;
	}
	public int getBaseStrength() {
		
		return baseStrength;
	}
	public void setBaseStrength(int baseStrength) {
		if(baseStrength > 0)
			this.baseStrength = baseStrength;
	}
	public double getBaseProtection() {
		return baseProtection;
	}
	public void setBaseProtection(double baseProtection) {
		if (baseProtection>0)
			this.baseProtection = baseProtection;
	}
	

}
