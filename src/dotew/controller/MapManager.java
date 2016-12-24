package dotew.controller;

import javax.swing.JPanel;

import dotew.model.BattleMap;
import dotew.model.CCharacter;
import dotew.model.Map;

public class MapManager {
	
	private Map currentMap;
	
	//getset
	public Map getCurrentMap(){
		return currentMap;
	}
	public void setCurrentMap(Map currentMap){
		this.currentMap = currentMap;
	}
	
	public void move(String direction, CCharacter player){
		int currentX=0, currentY=0, destinationX=0, destinationY=0;
		//find current coordinates
		for(int i =0; i<currentMap.getTerrainCellList().length; i++){
			for(int j =0; j<currentMap.getTerrainCellList()[i].length; j++){
				if(currentMap.getTerrainCellList()[i][j].getGameObject() == player){
					currentX = i;
					currentY= j;
				}
			}
		}
		//check possible 4 destinations
		if(direction.equalsIgnoreCase("north")){
			destinationX = currentX-1;
			destinationY = currentY;
		}
		
		if(direction.equalsIgnoreCase("west")){
			destinationX = currentX;
			destinationY = currentY+1;
		}
		
		if(direction.equalsIgnoreCase("south")){
			destinationX = currentX+1;
			destinationY = currentY;
		}
		
		if(direction.equalsIgnoreCase("east")){
			destinationX = currentX;
			destinationY = currentY-1;
		}
		
		//boundary check only works for N*N map configuration!
		if(destinationX <0 || destinationX > currentMap.getTerrainCellList()[0].length || destinationY <0 || destinationY>currentMap.getTerrainCellList()[0].length){
			GameEngine.getInstance(true,null,null).getConsoleResponder().giveResponse("You cannot go there!\n");
		}else{
			if(CollisionHandler.checkForCollision(player, currentMap.getTerrainCellList()[destinationX][destinationY])){
				//collisionHandler handles the collision
			}else{
				player.move(currentMap.getTerrainCellList()[destinationX][destinationY]);
			}
		}	
	}
	
	public void drawMap(JPanel panel){
		//TODO
	}
	
	public void startBattle(BattleMap currentBattle){
		this.currentMap = currentBattle;
		
	}
}
