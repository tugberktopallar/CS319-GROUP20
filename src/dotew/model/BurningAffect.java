package dotew.model;

public class BurningAffect extends TemporaryEffect {
	

	public BurningAffect(){
		super(3);
	}
	public BurningAffect(int duration) {
		super(duration);
		
	}

	@Override
	boolean applyEffect(CCharacter c1) {
		c1.increaseOrDecreaseHealth(-10);
		
		
		
		setDuration(getDuration() -1);
		return true;
	}

}
