package dotew.model;

/**
 * @author ilteber
 * class of deflect skill,range restriction is 4 cells.
 */
public class Mage3Skill extends Skill {

	/**
	 * 
	 */
	public Mage3Skill() {
		setName("Deflect");
		setRestriction(4.0);
		setTempEffect(null);
	}

	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getMana() < 10){
			return false;
		}
		
//		int damage = (int) (c1.getInt() * 3.5) ;
//		c2.increaseOrDecreaseHealth(-damage);
//		c2.addTemporaryEffect(getTempEffect());
		//TODO reactive skill
		c1.increaseOrDecreaseMana(-15);
		
		return true;
	}

}
