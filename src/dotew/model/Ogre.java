package dotew.model;

public class Ogre extends Enemy{

	private Ogre() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	public static Enemy create(){
		Ogre o = new Ogre();
		o.setType("Enemy");
		o.setName("Ogre");
		return o;
	}

}
