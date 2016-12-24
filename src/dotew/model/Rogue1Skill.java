package dotew.model;

public class Rogue1Skill extends Skill {

	/**
	 * backstab skill for rogue 1 
	 */
	public Rogue1Skill() {
		setName("Backstab");
		setRestriction(3.0);
		setTempEffect(null);
	}

	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getStamina() < 20){
			return false;
		}
		//Move character
		int damage = (int) (1.5 * (c1.getAttackDamage() + c1.getDex())) ;
		c2.increaseOrDecreaseHealth(-damage);
		//check if have pioson weapons TODO
		//c2.addTemporaryEffect(getTempEffect());
		c1.increaseOrDecreaseStamina(-20);
		
		return true;
	}

}
