package dotew.model;

import dotew.model.CCharacter;

public abstract class TemporaryEffect {
	/**
	 * 
	 */
	private int duration; //Timer mý koysak buraya? No :D
	
	/**
	 * @param duration : temporary effect duration
	 */
	public TemporaryEffect(int duration){
		this.duration = duration;
	}
	
	/**
	 * @return
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @param c1 : character that effect will be applied
	 * @return
	 */
	abstract boolean applyEffect(CCharacter c1);
	
}