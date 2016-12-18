package dotew.model;

public class FreezeAffect extends TemporaryEffect {

	
	public FreezeAffect() {
		super(3);
		
	}
	
	public FreezeAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

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
