package dotew.model;
import java.awt.Image;
public class GameObject {
	//Designdaki "name " = type oldu
	//type of the object indicates whether it is npc,enemy,battlestarter,or simply a character.
	private String type;
	private String iconName;
	
	private String name;
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
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TerrainCell gettCell() {
		return tCell;
	}
	public void settCell(TerrainCell tCell) {
		this.tCell = tCell;
	}
	public boolean isInteractable(){
		return interactiveness;
	}
	public void makeInteractible(){
		interactiveness = true;
	}
	public void makeNonInteractible(){
		interactiveness = false;
	}
}
