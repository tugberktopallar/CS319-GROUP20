package dotew.model;

public class EnemyFactory {
	private static EnemyFactory instance;
	private EnemyFactory(){
		
	}
	public static EnemyFactory getInstance(){
		if(instance == null){
			instance = new EnemyFactory();
			return instance;
		}
		else{
			return instance;
		}
	}
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
