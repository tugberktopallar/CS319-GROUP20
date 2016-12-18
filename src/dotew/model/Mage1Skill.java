package dotew.model;

public class Mage1Skill extends Skill {

	public Mage1Skill() {
		setName("Fireball");
		setRestriction(4.0);
		setTempEffect(new BurningAffect());
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getMana() < 15){
			return false;
		}
		
		int damage = (int) (c1.getInt() * 3.5) ;
		c2.increaseOrDecreaseHealth(-damage);
		c2.addTemporaryEffect(getTempEffect());
		c1.increaseOrDecreaseMana(-15);
		
		return true;
	}

}
