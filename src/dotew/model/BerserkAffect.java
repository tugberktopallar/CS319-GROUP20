package dotew.model;

public class BerserkAffect extends TemporaryEffect {

	
	public BerserkAffect() {
		super(5);
		
	}
	
	public BerserkAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

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
