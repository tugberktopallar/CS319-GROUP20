package dotew.model;

public class Boss extends Enemy{

	private Boss() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level i�ini nas�l hallederiz?
	}
	//@Override
	public static Enemy create(){
		return new Boss();
	}

}
