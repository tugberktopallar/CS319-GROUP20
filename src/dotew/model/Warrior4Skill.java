package dotew.model;

public class Warrior4Skill extends Skill {

	public Warrior4Skill() {
		setName("Berserker's Blood");
		setRestriction(0.0);
		setTempEffect(new BerserkAffect());
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		c1.addTemporaryEffect(getTempEffect());
		
		return true;
	}

}
