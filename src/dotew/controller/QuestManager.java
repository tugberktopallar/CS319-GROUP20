package dotew.controller;
import dotew.model.Quest;
import dotew.model.Player;

public class QuestManager {

	private int totalQuests;
	private int totalQuestsFinished;
	private Quest currentQuest;
	private Quest[] ongoingQuests;
	//We need to put all the quests in the game in somewhere, so that once we instantiate player
	//he will start with all quests on his unfinishedQuests arraylist.
	private Quest[] allQuestsInTheGame;
	
	public QuestManager(int totalQuests,  int totalQuestsFinished, Quest currentQuest,	Quest[] ongoingQuests){
		this.totalQuests = totalQuests;
		this.totalQuestsFinished = totalQuestsFinished;
		this.currentQuest = null;
		this.ongoingQuests = null;
		
	}
	
	public QuestManager() {
		this.totalQuests = 1;
		this.totalQuestsFinished = 0;
		this.currentQuest = null;
		this.ongoingQuests = null;
		this.allQuestsInTheGame = new Quest[1];
		this.allQuestsInTheGame[0] = new Quest();
	}

	

	public void switchCurrentQuests(Player p){
		int index = p.getActiveQuests().indexOf(currentQuest);
		if(index+1>=p.getActiveQuests().size())
			index = 0;
		else
			index = index+1;
		currentQuest = p.getActiveQuests().get(index+1);
	}
	public void setCurrentQuest(Quest newCurrent){
		currentQuest = newCurrent;
	}
	public void updateCurrentQuest(Player p){
		
	}
	
	public boolean checkQuestEnding(Player p){
		return true;
	}
	public int getTotalQuests(){
		return totalQuests;
	}
	public int getNumberOfOngoingQuests(){
		return ongoingQuests.length;
	}

	public Quest[] getAllQuestsInTheGame() {
		return allQuestsInTheGame;
	}

	public void setAllQuestsInTheGame(Quest[] allQuestsInTheGame) {
		this.allQuestsInTheGame = allQuestsInTheGame;
	}
	
	
	
	
	
	
}
