package dotew.model;

public class Warrior3Skill extends Skill {

	public Warrior3Skill() {
		setName("Block");
		setRestriction(0.0);
		setTempEffect(null);
	}
	/* (non-Javadoc)
	 * @see dotew.model.Skill#applySkill(dotew.model.CCharacter, dotew.model.CCharacter)
	 * 
	 * This skill consumes no mana, doesn't do anything.
	 */
	
	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		// TODO reactive skill
		return false;
	}

}
