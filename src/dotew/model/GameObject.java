package dotew.model;
import java.awt.Image;
public class GameObject {
	private String name;
	private Image Icon;
	private TerrainCell tCell;
	private boolean interactiveness;
	public GameObject() {
		// TODO Auto-generated constructor stub
	}
	public boolean move(TerrainCell t){
		
		if(t!= null){
			this.tCell = t;
			return true;
		}
		return false;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
