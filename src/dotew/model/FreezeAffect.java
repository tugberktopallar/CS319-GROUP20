package dotew.model;

public class FreezeAffect extends TemporaryEffect {

	/*
	 * duration is 3 turn
	 */
	public FreezeAffect() {
		super(3);
		
	}
	/**
	 * @param duration : duration of the effect in terms of turns
	 * this is the constructor of the freeze effect
	 */
	public FreezeAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see dotew.model.TemporaryEffect#applyEffect(dotew.model.CCharacter)
	 
	 *  This is the overriden applyEffect method of TemporaryEffects class
	 *  if the effect is applied its duration will be initialized with 3 in terms of turns.
	 *  so we increase dexterity with 4 for 3 turns.
	 */
	 
	@Override
	boolean applyEffect(CCharacter c1) {
		if(getDuration() == 3){
			c1.increaseOrDecreaseDexterity(-4);
		}
		else if(getDuration() == 1){
			c1.increaseOrDecreaseDexterity(4);
		}
		setDuration(getDuration()-1);
		return false;
	}

}
