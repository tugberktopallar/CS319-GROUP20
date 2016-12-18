package dotew.model;

public class PoisonedAffect extends TemporaryEffect {

	
	public PoisonedAffect() {
		super(3);
		
	}
	
	
	public PoisonedAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

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
