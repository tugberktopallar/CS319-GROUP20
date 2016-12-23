package dotew.model;

public class HumanEnemy extends Enemy{

	private HumanEnemy() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	public static Enemy create(){
		HumanEnemy e = new HumanEnemy();
		e.setType("Enemy");
		e.setName("Human Enemy");
		return e;
	}

}
