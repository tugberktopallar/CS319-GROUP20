package dotew.model;

/**
 * @author ilteber
 *
 */
public class EnemyFactory {
	/**
	 * EnemyFactory creates an enemy according to the choice.
	 */
	private static EnemyFactory instance;
	/**
	 * default constructior
	 */
	private EnemyFactory(){
		
	}
	/** This is singleton class so getInstance method should be used to get an instance of EnemyFactory.
	 * @return
	 */
	public static EnemyFactory getInstance(){
		if(instance == null){
			instance = new EnemyFactory();
			return instance;
		}
		else{
			return instance;
		}
	}
	/**
	 * @param EnemyName: name of the Enemy to be returned. 
	 * @return The enemy according to the choice.
	 */
	public Enemy getEnemy(String EnemyName){
		if(EnemyName != null||EnemyName.length()>0){
			char ch= EnemyName.toLowerCase().charAt(0);
			switch(ch){
			case 'o':
				return Ogre.create();
			case 'h':
				return HumanEnemy.create();
			case 'b':
				return Boss.create();
			case 'g':
				return Ghoul.create();
			default:
				return null;
			}
		}
		return null;
	}
}
