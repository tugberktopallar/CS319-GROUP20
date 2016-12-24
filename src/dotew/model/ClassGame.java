package dotew.model;

/**
 * @author ilteber
 *
 */
public class ClassGame {
	/**
	 * 	This is the class of character like mage/rogue/warrior
	 *  className is the name of the class
	 */
	private String className;

	/** constructor takes the name of the class.
	 * @param className
	 */
	public ClassGame(String className) {
		super();
		this.className = className;
	}

	/**
	 * @return
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
}
