package dotew.model;

public class PoisonWeaponAffect extends TemporaryEffect {

	
	public PoisonWeaponAffect() {
		super(3);
		
	}
	
	public PoisonWeaponAffect(int duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean applyEffect(CCharacter c1) {
		if(getDuration() == 3){
			c1.setAttackDamage(c1.getAttackDamage() + 5);
		}
		else if(getDuration() == 1){
			c1.setAttackDamage(c1.getAttackDamage() - 5);
		}
		setDuration(getDuration()-1);
		return true;
	}

}
