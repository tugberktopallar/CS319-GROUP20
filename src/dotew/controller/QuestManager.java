package dotew.controller;
import dotew.model.Quest;
import dotew.model.Player;

public class QuestManager {

	private int totalQuests;
	private int totalQuestsFinished;
	private Quest currentQuest;
	private Quest[] ongoingQuests;
	
	public QuestManager(int totalQuests,  int totalQuestsFinished, Quest currentQuest,	Quest[] ongoingQuests){
		this.totalQuests = totalQuests;
		this.totalQuestsFinished = totalQuestsFinished;
		this.currentQuest = null;
		this.ongoingQuests = null;
		
	}
	
	public QuestManager() {
		// TODO Auto-generated constructor stub
	}
	
	public int getTotalQuests(){
		return ongoingQuests.length;
	}

	public void switchCurrentQuests(Player p){
		//
	}
	
	public void updateCurrentQuest(Player p){
		
	}
	
	public boolean checkQuestEnding(Player p){
		return true;
	}
	
	
	
	
	
	
	
}
