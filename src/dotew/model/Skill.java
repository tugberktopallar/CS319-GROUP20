package dotew.model;

import dotew.model.CCharacter;
import dotew.model.TemporaryEffects;

public abstract class Skill {
	String name;
	TemporaryEffects tempEffect;
	double Restriction;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TemporaryEffects getTempEffect() {
		return tempEffect;
	}

	public void setTempEffect(TemporaryEffects tempEffect) {
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