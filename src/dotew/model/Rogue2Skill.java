package dotew.model;

public class Rogue2Skill extends Skill {

	public Rogue2Skill() {
		setName("Pison knife");
		setRestriction(0.0);
		setTempEffect(new PoisonWeaponAffect());
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getStamina() < 5){
			return false;
		}
	
		c2.addTemporaryEffect(getTempEffect());
		c1.increaseOrDecreaseStamina(-5);
		
		return true;
	}

}
