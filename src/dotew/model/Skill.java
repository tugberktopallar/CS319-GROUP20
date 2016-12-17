package dotew.model;

import dotew.model.CCharacter;
import dotew.model.TemporaryEffects;

public abstract class Skill {
	String name;
	TemporaryEffects tempEffect;
	boolean coolDownStatus;
	//String [] Restrictions;
	public abstract boolean applySkill(CCharacter c1,CCharacter c2);
}