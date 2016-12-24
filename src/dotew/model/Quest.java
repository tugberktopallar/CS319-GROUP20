package dotew.model;

import java.util.ArrayList;

public class Quest {
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private ArrayList<String> goals;
	/**
	 * 
	 */
	private String currentGoal;
	/**
	 * 
	 */
	private int rewardExp;
	 
	/**
	 * @param desc : description of quest
	 * @param goals : goals in array list
	 * @param rewardExp : rewardwxpo
	 */
	public Quest(String desc,ArrayList<String> goals,int rewardExp){
		this.description = desc;
		this.goals = goals;
		this.rewardExp = rewardExp;
		
	}
	/**
	 * 
	 */
	public Quest() {
		// TODO Auto-generated constructor stub
	}
	//
	/**
	 * switches the current goal
	 */
	public void switchGoal(){
		if(goals.indexOf(currentGoal)!= (goals.size()-1)){
			this.currentGoal = this.goals.get(goals.indexOf(currentGoal)+1);
		}
		else{
			//TODO: Give reward 
			this.currentGoal = "questCompleted";
		}
	}
	/**
	 * @return
	 */
	public String getCurrentGoal(){
		return currentGoal;
	}
}
