package dotew.model;
import java.util.ArrayList;
/**
 * @author Cabbar
 *
 */
public class Inventory {
	/**
	 * Inventory has a weight limit
	 */
	private double weightLimit;
	/**
	 * The list of items in the inventory
	 */
	private ArrayList<Item> itemList;
	/**
	 * current weight of the inventory
	 */
	private double currentWeight;
	/**
	 * @param weightLimit of the inventory
	 * @param itemList of the inventory
	 * @param currentWeight of the inventory
	 */
	public Inventory(double weightLimit, ArrayList<Item> itemList, double currentWeight) {
		this.weightLimit = weightLimit;
		this.itemList = itemList;
		this.currentWeight = currentWeight;
	}
	/**
	 * default constructor for inventory. initializes the weightlimit to zero, itemlist to empty, current weight to zero
	 */
	public Inventory(){
		weightLimit = 0;
		itemList = new ArrayList<Item>();
		currentWeight = 0;
	}
	/**
	 * draws the inventory -futurework-
	 */
	private void draw(){
		//TODO
	}
	/**
	 *  deletes an item from inventory if it exists.
	 * @param i: item to be deleted 
	 * @return result of deletion
	 */
	private boolean deleteFromInventory(Item i){
		if(itemList.contains(i)){
			itemList.remove(i);
			return true;
		}
		else
			return false;
	}
	/**
	 * @return if the inventory is full
	 */
	private boolean isFull(){
		return currentWeight == weightLimit;
	}
	/**
	 * adds passed item to the inventory
	 * if item's weight+currentweight> limit, then it is not added
	 * @param it: item to be added 
	 */
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
	/**
	 * @return
	 */
	public double getWeightLimit() {
		return weightLimit;
	}
	/**
	 * @param weightLimit
	 */
	public void setWeightLimit(double weightLimit) {
		this.weightLimit = weightLimit;
	}
	/**
	 * @return
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	/**
	 * @param itemList
	 */
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	/**
	 * @return
	 */
	public double getCurrentWeight() {
		return currentWeight;
	}
	/**
	 * @param currentWeight
	 */
	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}
	
}
