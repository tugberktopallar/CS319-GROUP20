package dotew.model;
import java.awt.Image;
/**
 * @author ilteber
 * Every object like block object,character,enemy,npc ..etc. are gameObject.
 *
 */
public class GameObject {
	
	
	/**
	 * type of the object indicates whether it is npc,enemy,battlestarter,or simply a character.
	 */
	private String type;
	/**
	 * name of the icon
	 */
	private String iconName;
	
	/**
	 * name of the gameObject 
	 */
	private String name;
	/**
	 * the cell of the gameobject
	 */
	private TerrainCell tCell;
	/**
	 * if it is block, then it is not interactible. If it is character,npc,battlestarter then it is interactable.
	 */
	private boolean interactiveness;
	/**
	 * default constructor of gameobject
	 */
	public GameObject() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * moves the game object to the given cell
	 * @param t: cell to be moved in
	 * @return result of changing position
	 */
	public boolean move(TerrainCell t){
		
		if(t!= null){
			this.tCell.setGameObject(null);
			this.tCell = t;
			t.setGameObject(this);
			System.out.println("player moved to: " + t.getPosition().getX() + t.getPosition().getY());
			return true;
		}
		return false;
	}
	/**
	 * @return
	 */
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	/**
	 * @param type
	 */
	public void setType(String type){
		this.type = type;
	}
	/**
	 * @return
	 */
	public String getIconName() {
		return iconName;
	}
	/**
	 * @param iconName
	 */
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	public TerrainCell gettCell() {
		return tCell;
	}
	/**
	 * @param tCell
	 */
	public void settCell(TerrainCell tCell) {
		this.tCell = tCell;
	}
	/**
	 * @return 
	 */
	public boolean isInteractable(){
		return interactiveness;
	}
	/**
	 * 
	 */
	public void makeInteractible(){
		interactiveness = true;
	}
	/**
	 * 
	 */
	public void makeNonInteractible(){
		interactiveness = false;
	}
}
