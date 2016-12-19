package dotew.model;

import java.awt.Point;

public class TerrainCell {
	private boolean isBlocked;
	private GameObject gameObject;
	private Point position;
	
	TerrainCell(boolean isBlocked, GameObject gameObject, Point position){
		this.isBlocked = isBlocked;
		this.gameObject = gameObject;
		this.position = position;
	}

	//getset
	public boolean getIsBlocked(){
		return isBlocked;
	}
	
	public GameObject getGameObject(){
		return gameObject;
	}
	
	public Point getPosition(){
		return position;
	}
	
	public void setIsBlocked(boolean isBlocked){
		this.isBlocked = isBlocked;
	}
	
	public void setGameObject(GameObject gameObject){
		this.gameObject = gameObject;
	}
	
	public void setPosition(Point position){
		this.position = position;
	}
	
	public void draw(){
		//GUI implementation
	}
	
	public boolean isBlocked(){
		return this.isBlocked;
	}
	
	public void move(GameObject o1){
		//move method
	}

}
