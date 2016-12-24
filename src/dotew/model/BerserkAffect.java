package dotew.model;

/**
 * @author ilteber
 *
 */

public class BerserkAffect extends TemporaryEffect {

	
	/**
	 * duration of the Berserk Effect is 5 turns.
	 */
	public BerserkAffect() {
		super(5);
		
	}
	
	/**
	 * @param duration : duration of the effect in terms of turns
	 * this is the constructor of the berserk effect
	 */
	public BerserkAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see dotew.model.TemporaryEffect#applyEffect(dotew.model.CCharacter)
	 *  
	 *  
	 *  This is the overriden applyEffect method of TemporaryEffects class
	 *  if the effect is applied its duration will be initialized with 5 in terms of turns.
	 *  so we increase dexterity with 3 and strength with 4 for 4 turns. when the duration drops to 1, we set the changed stats
	 *  to the original numbers.
	 */
	@Override
	boolean applyEffect(CCharacter c1) {
		if(getDuration() == 5){
			c1.increaseOrDecreaseDexterity(3);
			c1.increaseOrDecreaseStrength(4);
		}
		else if(getDuration() == 1){
			c1.increaseOrDecreaseDexterity(-3);
			c1.increaseOrDecreaseStrength(-4);
		}
		setDuration(getDuration()-1);
		return true;
	}

}
