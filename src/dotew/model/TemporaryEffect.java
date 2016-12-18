package dotew.model;

import dotew.model.CCharacter;

public abstract class TemporaryEffect {
	private int duration; //Timer mý koysak buraya? No :D
	
	public TemporaryEffect(int duration){
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	abstract boolean applyEffect(CCharacter c1);
	
}