package dotew.model;

public class Ogre extends Enemy{

	private Ogre() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level i�ini nas�l hallederiz?
	}
	//@Override
	public static Enemy create(){
		return new Ogre();
	}

}
