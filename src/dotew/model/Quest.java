package dotew.model;

import java.util.ArrayList;

public class Quest {
	private String description;
	private ArrayList<String> goals;
	private String currentGoal;
	private int rewardExp;
	 
	public Quest(String desc,ArrayList<String> goals,int rewardExp){
		this.description = desc;
		this.goals = goals;
		this.rewardExp = rewardExp;
		
	}
	public Quest() {
		// TODO Auto-generated constructor stub
	}
	//
	public void switchGoal(){
		if(goals.indexOf(currentGoal)!= (goals.size()-1)){
			this.currentGoal = this.goals.get(goals.indexOf(currentGoal)+1);
		}
		else{
			//TODO: Give reward 
			this.currentGoal = "questCompleted";
		}
	}
	public String getCurrentGoal(){
		return currentGoal;
	}
}
