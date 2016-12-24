package dotew.model;
import java.awt.Image;
/**
 * @author ilteber
 *
 */
public class Item {
	/**
	 *  type of the item like armor,weapon,quest,consumable etc.
	 */
	private String type;
	/**
	 * name of the item
	 */
	private String name;
	/**
	 * description of the item
	 */
	private String description;
	/**
	 * weight of the item
	 */
	private double weight;
	/**
	 * icon of the item
	 */
	private Image icon;
	/**
	 * @param name  of the item
	 * @param type of the item like armor,weapon,quest,consumable etc.
	 * @param description of the item
	 * @param weight of the item
	 * @param icon of the item
	 */
	public Item(String name,String type,String description, double weight, Image icon) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
		this.weight = weight;
		this.icon = icon;
	}
	/**
	 * default constructor initializes name type description to empty string , weight to zero, icon to null
	 */
	public Item(){
		name = "";
		type = "";
		description ="";
		weight =0.0;
		icon =null;
	}
	
	
	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return
	 */
	public Image getIcon() {
		return icon;
	}
	/**
	 * @param icon
	 */
	public void setIcon(Image icon) {
		this.icon = icon;
	}



	/**
	 * @return
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return
	 */
	public String getName() {
		
		return name;
	}
	
}
