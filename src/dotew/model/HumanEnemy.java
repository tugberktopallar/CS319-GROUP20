package dotew.model;

public class HumanEnemy extends Enemy{

	private HumanEnemy() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	public static Enemy create(){
		return new HumanEnemy();
	}

}
