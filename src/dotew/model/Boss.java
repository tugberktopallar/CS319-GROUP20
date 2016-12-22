package dotew.model;

public class Boss extends Enemy{

	private Boss() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	public static Enemy create(){
		return new Boss();
	}

}
