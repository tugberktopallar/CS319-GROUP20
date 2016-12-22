package dotew.model;
import java.util.ArrayList;
public class Inventory {
	private double weightLimit;
	private ArrayList<Item> itemList;
	private double currentWeight;
	public Inventory(double weightLimit, ArrayList<Item> itemList, double currentWeight) {
		this.weightLimit = weightLimit;
		this.itemList = itemList;
		this.currentWeight = currentWeight;
	}
	public Inventory(){
		weightLimit = 0;
		itemList = new ArrayList<Item>();
		currentWeight = 0;
	}
	private void draw(){
		//TODO
	}
	private boolean deleteFromInventory(Item i){
		if(itemList.contains(i)){
			itemList.remove(i);
			return true;
		}
		else
			return false;
	}
	private boolean isFull(){
		return currentWeight == weightLimit;
	}
	private void addToTheInventory(Item it){
		if(!isFull())
		{
			double sum = it.getWeight()+currentWeight;
			if(sum<weightLimit){
				itemList.add(it);
				currentWeight += it.getWeight();
			}
			else{
				//TODO: User'ý bilgilendir envanter dolu diye
			}
		}
	}
	public double getWeightLimit() {
		return weightLimit;
	}
	public void setWeightLimit(double weightLimit) {
		this.weightLimit = weightLimit;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	public double getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}
	
}
