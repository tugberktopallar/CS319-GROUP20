package dotew.model;


/**
 * @author Cabbar
 *
 */
public class PoisonedAffect extends TemporaryEffect {

	
	/**
	 *  duration is 3 turns
	 */
	public PoisonedAffect() {
		super(3);
		
	}
	
	
	/**
	 * @param duration
	 */
	public PoisonedAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see dotew.model.TemporaryEffect#applyEffect(dotew.model.CCharacter)
	 * decreases dexterity by 2. 
	 */
	@Override
	boolean applyEffect(CCharacter c1) {
		if(getDuration() == 3){
			c1.increaseOrDecreaseDexterity(-2);
		}
		else if(getDuration() == 1){
			c1.increaseOrDecreaseDexterity(2);
		}
		
		c1.increaseOrDecreaseHealth(-5);
		setDuration(getDuration()-1);
		return false;
	}

}
