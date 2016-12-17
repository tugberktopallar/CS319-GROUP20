package dotew.model;

import dotew.model.CCharacter;

public abstract class TemporaryEffects {
	private int duration; //Timer mý koysak buraya?
	
	abstract boolean applyEffect(CCharacter c1);
	
}