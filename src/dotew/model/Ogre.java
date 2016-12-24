package dotew.model;

public class Ogre extends Enemy{

	private Ogre() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
		/**
		 * @return This method creates a new ogre Enemy , sets the type of Gameobject to enemy and name of the Gameobject to ogre  
		 */
	public static Enemy create(){
		Ogre o = new Ogre();
		o.setType("Enemy");
		o.setName("Ogre");
		o.setIconName("OgreTexture.png");
		return o;
	}

}
