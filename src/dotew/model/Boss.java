package dotew.model;

public class Boss extends Enemy{

	private Boss() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level i�ini nas�l hallederiz?
	}
	//@Override
	public static Enemy create(){
		Boss b = new Boss();
		b.setType("Enemy");
		b.setName("Boss");
		return b;
	}

}
