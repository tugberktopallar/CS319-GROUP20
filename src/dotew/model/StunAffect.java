package dotew.model;

public class StunAffect extends TemporaryEffect {

	public StunAffect(){
		super(1);
	}
	
	public StunAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean applyEffect(CCharacter c1) {
		// TODO Auto-generated method stub
		return false;
	}

}
