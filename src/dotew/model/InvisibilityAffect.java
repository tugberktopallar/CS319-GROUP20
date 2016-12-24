package dotew.model;

public class InvisibilityAffect extends TemporaryEffect {

	
	public InvisibilityAffect() {
		super(3);
		
	}
	/**
	 * @param duration : duration of the effect in terms of turns
	 * this is the constructor of the invisibilty effect
	 */
	public InvisibilityAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see dotew.model.TemporaryEffect#applyEffect(dotew.model.CCharacter)
	 
	 *  This is the overriden applyEffect method of TemporaryEffects class
	 *  if the effect is applied its duration will be initialized with 3 in terms of turns.
	 *  so we make the character invisible for 3 turns.
	 */
	 
	@Override
	boolean applyEffect(CCharacter c1) {
		setDuration(getDuration()-1);
		return true;
	}

}
