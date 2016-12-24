package dotew.controller;

import dotew.model.BattleStarter;
import dotew.model.CCharacter;
import dotew.model.TerrainCell;
import dotew.model.NPC;
import dotew.model.GameObject;
public class CollisionHandler {
	//TODO: is ve handle methodlarýný private yap
	public static boolean isCollisionNPC(CCharacter c1, TerrainCell tCell){
		if(tCell.getGameObject().getType().substring(0,3).equalsIgnoreCase("npc")){
			return handleCollisionNPC(c1,tCell);
		}
		else 
			return false;
	}
	
	
	public static boolean checkForCollision(CCharacter charr1,TerrainCell tCell){
		boolean flag = tCell.isBlocked();
		if(!flag){
			//TODO : Move cagir?
			//charr1.setMapCell(tCell);
			//gameObjectin move methodu çaðýrýlacak ama gameEngine'dan
			return false;
		}
		//it means cell is blocked by 1)Block or 2)NPC or 3)BattleStarter(for Zone) or 4)Enemy(for BattleMap)
		else{
			if(tCell.getGameObject() !=null){
				System.out.println("game object exists");
				if(!(tCell.getGameObject().isInteractable()))
				{
					handleCollisionBlock(charr1,tCell);
				}
				
				else if(isCollisionNPC(charr1,tCell)){
					//TODO: "You have encountered " +((NPC)(tCell.getGameObject())).getName() yazdýr.
					handleCollisionNPC(charr1,tCell);
				
				}
				else if (isCollisionBattle(charr1,tCell)){
					
					handleCollisionBattle(charr1,tCell);
					
				}
				else if(isCollisionEnemy(charr1,tCell)){
					handleCollisionEnemy(charr1,tCell);
				}
				return true;
			}
			return false;
		
		}
	}
	//NPC ile nasýl bir talk sessionu oluþturacaðýz? talk methodu input alýp vermeli mi?
	private static boolean handleCollisionNPC(CCharacter charr1,TerrainCell tCell){
		((NPC)(tCell.getGameObject())).talk();
		return true;
	}
	private static void handleCollisionBlock(CCharacter charr1,TerrainCell tCell){
		//TODO: "Console'a this location is occupied by a " + ((block)(tCell.getGameObject())).getName() + ", you cannot move there" yazdýr.
	}
	private static boolean handleCollisionEnemy(CCharacter charr1,TerrainCell tCell){
		//TODO: Savasacaklar
		return true;
	}
	private static boolean isCollisionBlock(CCharacter c1,TerrainCell tCell){
			if (!(tCell.getGameObject().isInteractable())){
				return true;
			}
			return false;
	}
	private static boolean handleCollisionBattle(CCharacter c1,TerrainCell tCell){
		GameEngine.getInstance().startBattle(((BattleStarter) tCell.getGameObject()).startBattle());
		return true;
	}
	//This is for battleMap
	private static boolean isCollisionEnemy(CCharacter c1,TerrainCell tCell){
		if((tCell.getGameObject().getType().equalsIgnoreCase("enemy"))){
			return true;
		}
		return false;
	}
	//this is for zone
	private static boolean isCollisionBattle(CCharacter c1,TerrainCell tCell){
		if((tCell.getGameObject().getType().equalsIgnoreCase("battlestarter"))){
			System.out.println("Battle starter detected");
			return true;
		}
		return false;
	}
	
}
