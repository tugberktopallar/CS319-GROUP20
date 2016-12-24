package dotew.model;

/**
 * @author Cabbar
 *
 */
public class HumanEnemy extends Enemy{

	/**
	 * 
	 */
	private HumanEnemy() {
		super();
		
	}
	//@Override
	/**
	 * @return This method creates a new ghoul Enemy , sets the type of Gameobject to enemy and name of the Gameobject to Ghoul 
	 */
	public static Enemy create(){
		HumanEnemy e = new HumanEnemy();
		e.setType("Enemy");
		e.setName("Human Enemy");
		return e;
	}

}
