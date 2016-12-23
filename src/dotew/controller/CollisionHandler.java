package dotew.controller;

import dotew.model.CCharacter;
import dotew.model.TerrainCell;
import dotew.model.NPC;
import dotew.model.GameObject;
public class CollisionHandler {
	public static boolean isCollisionNPC(CCharacter c1, TerrainCell tCell){
		if(((GameObject) c1).getName().substring(0,3).equalsIgnoreCase("npc")){
			return handleCollisionNPC(c1,tCell);
		}
		else 
			return false;
	}
	
	public static boolean handleCollisionNPC(CCharacter charr1,TerrainCell tCell){
		((NPC)(tCell.getGameObject())).talk();
		return true;
	}
	public static boolean checkForCollision(CCharacter charr1,TerrainCell tCell){
		boolean flag = tCell.isBlocked();
		if(!flag){
			charr1.setMapCell(tCell);
			return false;
		}
		else{
			boolean f = isCollisionNPC(charr1,tCell);
			return true;
		}
	}
}
