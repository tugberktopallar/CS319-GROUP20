package dotew.model;
import java.awt.Image;
public class Item {
	private String type;
	private String name;
	private String description;
	private double weight;
	private Image icon;
	public Item(String name,String type,String description, double weight, Image icon) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
		this.weight = weight;
		this.icon = icon;
	}
	public Item(){
		name = "";
		type = "";
		description ="";
		weight =0.0;
		icon =null;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Image getIcon() {
		return icon;
	}
	public void setIcon(Image icon) {
		this.icon = icon;
	}



	public String getType() {
		return type;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
