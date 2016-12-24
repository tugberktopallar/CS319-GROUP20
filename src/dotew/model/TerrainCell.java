package dotew.model;

import java.awt.Point;

import javax.swing.JPanel;

public class TerrainCell {
	private boolean isBlocked;
	private GameObject gameObject;
	private Point position;
	private String iconName;
	
	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

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
		if(gameObject !=null){
			setIsBlocked(true);
		}
	}
	
	public void setPosition(Point position){
		this.position = position;
	}
	
	public void draw(JPanel panel){
		//panel.getGraphics().drawI
	}
	
	public boolean isBlocked(){
		return this.isBlocked;
	}
	
	public void move(GameObject o1){
		//move method
	}

}
