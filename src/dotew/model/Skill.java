package dotew.model;

import dotew.model.CCharacter;
import dotew.model.TemporaryEffect;

public abstract class Skill {
	private String name;
	private TemporaryEffect tempEffect;
	private double Restriction;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TemporaryEffect getTempEffect() {
		return tempEffect;
	}

	public void setTempEffect(TemporaryEffect tempEffect) {
		this.tempEffect = tempEffect;
	}

	public double getRestriction() {
		return Restriction;
	}

	public void setRestriction(double restriction) {
		Restriction = restriction;
	}

	public abstract boolean applySkill(CCharacter c1,CCharacter c2);
}