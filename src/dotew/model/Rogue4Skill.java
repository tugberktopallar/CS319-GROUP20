package dotew.model;

public class Rogue4Skill extends Skill {

	public Rogue4Skill() {
		setName("Invisibility");
		setRestriction(0.0);
		setTempEffect(new InvisibilityAffect());
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getStamina() < 20){
			return false;
		}
		
		
		c2.addTemporaryEffect(getTempEffect());
		c1.increaseOrDecreaseStamina(-20);
		
		return true;
	}

}
