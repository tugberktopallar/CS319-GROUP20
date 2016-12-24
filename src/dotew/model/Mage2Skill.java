package dotew.model;

/**
 * @author ilteber
 * Class of IceSpike skill
 */
public class Mage2Skill extends Skill {

	/**
	 * restriction is 4 cells, effect is freezeeffect
	 */
	public Mage2Skill() {
		setName("Ice spike");
		setRestriction(4.0);
		setTempEffect(new FreezeAffect());
	}

	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 * 
	 * This skill consumes 15 mana, hits with a damage : intelligence*3
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getMana() < 15){
			return false;
		}
		
		int damage = (int) (c1.getInt() * 3) ;
		c2.increaseOrDecreaseHealth(-damage);
		c2.addTemporaryEffect(getTempEffect());
		c1.increaseOrDecreaseMana(-15);
		
		return true;
	}

}
