package dotew.model;

/**
 * @author ilteber
 * This is the class for FireBall skill
 */
public class Mage1Skill extends Skill {

	/**
	 *  default constructor, sets name to fireball, range restriction to 4 cells, temporary effect to burning effect.
	 */
	public Mage1Skill() {
		setName("Fireball");
		setRestriction(4.0);
		setTempEffect(new BurningAffect());
	}

	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 * 
	 * This skill consumes 15 mana, hits with damage intelligence*3.5
	 */
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
