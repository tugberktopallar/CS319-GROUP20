package dotew.model;

public class InvisibilityAffect extends TemporaryEffect {

	
	public InvisibilityAffect() {
		super(3);
		
	}
	
	public InvisibilityAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean applyEffect(CCharacter c1) {
		setDuration(getDuration()-1);
		return true;
	}

}
