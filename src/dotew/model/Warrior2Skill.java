package dotew.model;

public class Warrior2Skill extends Skill {

	public Warrior2Skill() {
		setName("Ravage");
		setRestriction(1.0);
		setTempEffect(null);
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		int damage = (int) (c1.getAttackDamage() * 3) ;
		c2.increaseOrDecreaseHealth(damage);
		c1.increaseOrDecreaseStamina(20);
		return false;
	}

}
