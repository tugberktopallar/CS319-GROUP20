package dotew.model;

public class StunAffect extends TemporaryEffect {

	/**
	 * 
	 */
	public StunAffect(){
		super(1);
	}
	
	/**
	 * @param duration : duration of stun effect
	 */
	public StunAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see dotew.model.TemporaryEffect#applyEffect(dotew.model.CCharacter)
	 */
	@Override
	boolean applyEffect(CCharacter c1) {
		// TODO Auto-generated method stub
		return false;
	}

}
