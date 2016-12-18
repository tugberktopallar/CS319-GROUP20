package dotew.model;

public class Mage4Skill1 extends Skill {

	public Mage4Skill1() {
		setName("Cosmic light");
		setRestriction(0.0);
		setTempEffect(null);
	}

	@Override
	public boolean applySkill(CCharacter c1, CCharacter c2) {
		if(c1.getMana() < 30){
			return false;
		}
		if(c1.equals(c2)){
			c2.setHealth(c2.calculateMaxHP());
		}
		else{
			int damage = (int) (c1.getInt() * 6) ;
			c2.increaseOrDecreaseHealth(-damage);
		}
		
		c1.increaseOrDecreaseMana(-30);
		
		return true;
	}

}
