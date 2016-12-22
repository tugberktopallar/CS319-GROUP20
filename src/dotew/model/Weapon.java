package dotew.model;

import java.awt.Image;

public class Weapon extends WearableItem{
    private int baseDamage;
	public Weapon(String description, String type, String name,double weight, Image icon, int baseDamage) {
		super(description, type, name, weight, icon);
		this.baseDamage = baseDamage;
		// TODO Auto-generated constructor stub
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	

}
