package dotew.model;

public class Warrior2Skill extends Skill {

	public Warrior2Skill() {
		setName("Ravage");
		setRestriction(1.0);
		setTempEffect(null);
	}

	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 * 
	 * This skill consumes 20 stamina, hits with damage : attackDamage*3
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getStamina() < 20){
			return false;
		}
		
		int damage = (int) (c1.getAttackDamage() * 3) ;
		c2.increaseOrDecreaseHealth(-damage);
		c1.increaseOrDecreaseStamina(-20);
		return true;
	}

}
