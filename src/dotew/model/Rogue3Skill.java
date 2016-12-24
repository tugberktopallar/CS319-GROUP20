package dotew.model;

public class Rogue3Skill extends Skill {

	/**
	 * knife throw for rogue 3
	 */
	public Rogue3Skill() {
		setName("Knife throw");
		setRestriction(5.0);
		setTempEffect(null);
	}

	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getStamina() < 10){
			return false;
		}
		//Move character
		int damage = (int) (c1.getAttackDamage() + c1.getDex()) ;
		c2.increaseOrDecreaseHealth(-damage);
		//check if have pioson weapons TODO
		//c2.addTemporaryEffect(getTempEffect());
		c1.increaseOrDecreaseStamina(-10);
		
		return true;
	}

}
