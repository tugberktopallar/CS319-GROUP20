package dotew.model;

public class Warrior4Skill extends Skill {

	public Warrior4Skill() {
		setName("Berserker's Blood");
		setRestriction(0.0);
		setTempEffect(new BerserkAffect());
	}
	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 * 
	 * This skill consumes no mana, adds berserk affect
	 */
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		c1.addTemporaryEffect(getTempEffect());
		
		return true;
	}

}
