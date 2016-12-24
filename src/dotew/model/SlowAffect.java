package dotew.model;

public class SlowAffect extends TemporaryEffect {

	
	/**
	 * 
	 */
	public SlowAffect() {
		super(2);
		
	}
	
	/**
	 * @param duration : duration that  charchter will be slow down
	 */
	public SlowAffect(int duration) {
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
