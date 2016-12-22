package dotew.model;

public class Ogre extends Enemy{

	private Ogre() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	public static Enemy create(){
		return new Ogre();
	}

}
