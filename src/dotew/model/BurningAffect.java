package dotew.model;

/**
 * @author ilteber
 *
 */
public class BurningAffect extends TemporaryEffect {
	

	/**
	 *  duration of the Berserk Effect is 3 turns.
	 */
	public BurningAffect(){
		super(3);
	}
	/**
	 * @param duration : duration of the effect in terms of turns
	 * this is the constructor of the berserk effect
	 */
	public BurningAffect(int duration) {
		super(duration);
		
	}

	/* (non-Javadoc)
	 * @see dotew.model.TemporaryEffect#applyEffect(dotew.model.CCharacter)
	 
	 *  This is the overriden applyEffect method of TemporaryEffects class
	 *  if the effect is applied its duration will be initialized with 3 in terms of turns.
	 *  so we decrease the health of the character by 10 each turn.
	 */
	 */
	@Override
	boolean applyEffect(CCharacter c1) {
		c1.increaseOrDecreaseHealth(-10);
		
		
		
		setDuration(getDuration() -1);
		return true;
	}

}
