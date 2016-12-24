package dotew.model;

import dotew.model.CCharacter;
import dotew.model.TemporaryEffect;

public abstract class Skill {
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private TemporaryEffect tempEffect;
	/**
	 * 
	 */
	private double Restriction;
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public TemporaryEffect getTempEffect() {
		return tempEffect;
	}

	/**
	 * @param tempEffect
	 */
	public void setTempEffect(TemporaryEffect tempEffect) {
		this.tempEffect = tempEffect;
	}

	/**
	 * @return
	 */
	public double getRestriction() {
		return Restriction;
	}

	/**
	 * @param restriction
	 */
	public void setRestriction(double restriction) {
		Restriction = restriction;
	}

	/**
	 * @param c1 : character who applies the skill
	 * @param c2 : character who is going to applied this skill
	 * @return
	 */
	public abstract boolean applySkill(CCharacter c1,CCharacter c2);
}