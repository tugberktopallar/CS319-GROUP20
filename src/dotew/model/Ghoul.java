package dotew.model;

/**
 * @author ilteber
 *
 */
public class Ghoul extends Enemy{

	/**
	 *  private constructor of Ghoul.
	 */
	private Ghoul() {
		super();
		// TODO 
	}
	//@Override
	/**
	 * @return This method creates a new ghoul Enemy , sets the type of Gameobject to enemy and name of the Gameobject to Ghoul 
	 */
	public static Enemy create(){
		Ghoul g = new Ghoul();
		g.setType("Enemy");
		g.setName("Ghoul");
		return g;
	}

}
