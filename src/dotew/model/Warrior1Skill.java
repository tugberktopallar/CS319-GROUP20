package dotew.model;

public class Warrior1Skill extends Skill {

	public Warrior1Skill() {
		setName("Chargee!!");
		setRestriction(4.0);
		setTempEffect(new StunAffect());
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		// TODO Auto-generated method stub
		//Move c1 to c2
		
		int damage = c1.getWeaponDamage() + (c1.getStr() * 1.5) + (c1.getDex());
		c2.increaseOrDecreaseHealth(-damage);
		c1.increaseOrDecreaseStamina(-15);
		return false;
	}

}
