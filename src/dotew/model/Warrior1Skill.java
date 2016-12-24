package dotew.model;

public class Warrior1Skill extends Skill {

	public Warrior1Skill() {
		setName("Chargee!!");
		setRestriction(4.0);
		setTempEffect(new StunAffect());
	}
	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 * 
	 * This skill consumes 15 stamina, hits with (weapondamage+str*1.5+dexterity) amount of damage
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		// TODO Auto-generated method stub
		if(c1.getStamina() < 15){
			return false;
		}
		//Move c1 to c2
		
		int damage = (int) (c1.getWeaponDamage() + (c1.getStr() * 1.5) + (c1.getDex()));
		c2.increaseOrDecreaseHealth(-damage);
		c1.increaseOrDecreaseStamina(-15);
		return true;
	}

}
