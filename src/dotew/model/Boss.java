package dotew.model;

/**
 * @author ilteber
 *
 */
public class Boss extends Enemy{

	/**
	 *  default constructor of the boss, it is private so that no one can instantiate it without using create method
	 */
	private Boss() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	//
	/** This method creates a new Boss Enemy , sets the type of Gameobject to enemy and name of the Gameobject to Boss 
	 * @return 
	 */
	public static Enemy create(){
		Boss b = new Boss();
		b.setType("Enemy");
		b.setName("Boss");
		return b;
	}

}
