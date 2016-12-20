package dotew.model;
import java.awt.Image;
public class Item {
	private String description;
	private double weight;
	private Image icon;
	public Item(String description, double weight, Image icon) {
		super();
		this.description = description;
		this.weight = weight;
		this.icon = icon;
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
	
}
