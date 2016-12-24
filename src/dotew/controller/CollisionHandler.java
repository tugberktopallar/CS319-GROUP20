package dotew.controller;

import dotew.model.BattleStarter;
import dotew.model.CCharacter;
import dotew.model.TerrainCell;
import dotew.model.NPC;
import dotew.model.GameObject;
public class CollisionHandler {
	//TODO: is ve handle methodlarýný private yap
	/**
	 * checks if collision occurs between npc and player
	 * @param c1 : player
	 * @param tCell : cell type 
	 * @return true or false
	 */
	public static boolean isCollisionNPC(CCharacter c1, TerrainCell tCell){
		if(tCell.getGameObject().getType().substring(0,3).equalsIgnoreCase("npc")){
			return handleCollisionNPC(c1,tCell);
		}
		else 
			return false;
	}
	
	
	/**
	 * checks if collision occurs between npc and player
	 * @param charr1 : player's character
	 * @param tCell : terrain
	 * @return
	 */
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
	/**
	 * talks with npc
	 * @param charr1 : player's character
	 * @param tCell: terrain cell
	 * @return
	 */
	private static boolean handleCollisionNPC(CCharacter charr1,TerrainCell tCell){
		((NPC)(tCell.getGameObject())).talk();
		return true;
	}
	/**
	 * warns player when collision ocuurs
	 * @param charr1: player's character
	 * @param tCell: terrain
	 */
	private static void handleCollisionBlock(CCharacter charr1,TerrainCell tCell){
		//TODO: "Console'a this location is occupied by a " + ((block)(tCell.getGameObject())).getName() + ", you cannot move there" yazdýr.
	}
	/**
	 * @param charr1
	 * @param tCell
	 * @return
	 */
	private static boolean handleCollisionEnemy(CCharacter charr1,TerrainCell tCell){
		//TODO: Savasacaklar
		return true;
	}
	/**
	 * @param c1
	 * @param tCell
	 * @return
	 */
	private static boolean isCollisionBlock(CCharacter c1,TerrainCell tCell){
			if (!(tCell.getGameObject().isInteractable())){
				return true;
			}
			return false;
	}
	/**
	 * handle collision in battle
	 * @param c1: player's character
	 * @param tCell: cell
	 * @return
	 */
	private static boolean handleCollisionBattle(CCharacter c1,TerrainCell tCell){
		GameEngine.getInstance().startBattle(((BattleStarter) tCell.getGameObject()).startBattle());
		return true;
	}
	//This is for battleMap
	/**
	 * checks collision for battle map
	 * @param c1
	 * @param tCell
	 * @return
	 */
	private static boolean isCollisionEnemy(CCharacter c1,TerrainCell tCell){
		if((tCell.getGameObject().getType().equalsIgnoreCase("enemy"))){
			return true;
		}
		return false;
	}
	//this is for zone
	/**
	 * checks collision for zone
	 * @param c1: player
	 * @param tCell
	 * @return
	 */
	private static boolean isCollisionBattle(CCharacter c1,TerrainCell tCell){
		if((tCell.getGameObject().getType().equalsIgnoreCase("battlestarter"))){
			System.out.println("Battle starter detected");
			return true;
		}
		return false;
	}
	
}
