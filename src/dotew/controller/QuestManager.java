package dotew.controller;
import dotew.model.Quest;
import dotew.model.Player;

public class QuestManager {

	/**
	 * 
	 */
	private int totalQuests;
	/**
	 * 
	 */
	private int totalQuestsFinished;
	/**
	 * 
	 */
	private Quest currentQuest;
	/**
	 * 
	 */
	private Quest[] ongoingQuests;
	//We need to put all the quests in the game in somewhere, so that once we instantiate player
	//he will start with all quests on his unfinishedQuests arraylist.
	/**
	 * 
	 */
	private Quest[] allQuestsInTheGame;
	
	/**
	 * @param totalQuests : total number of quests in the game
	 * @param totalQuestsFinished : # of total quests finished in the game
	 * @param currentQuest : current quest user has
	 * @param ongoingQuests : all the quests user has
	 */
	public QuestManager(int totalQuests,  int totalQuestsFinished, Quest currentQuest,	Quest[] ongoingQuests){
		this.totalQuests = totalQuests;
		this.totalQuestsFinished = totalQuestsFinished;
		this.currentQuest = null;
		this.ongoingQuests = null;
		
	}
	
	/**
	 * initializes the quest manager values
	 */
	public QuestManager() {
		this.totalQuests = 1;
		this.totalQuestsFinished = 0;
		this.currentQuest = null;
		this.ongoingQuests = null;
		this.allQuestsInTheGame = new Quest[1];
		this.allQuestsInTheGame[0] = new Quest();
	}

	

	/**
	 * switches one quests to another if exists
	 * @param p : current player
	 */
	public void switchCurrentQuests(Player p){
		int index = p.getActiveQuests().indexOf(currentQuest);
		if(index+1>=p.getActiveQuests().size())
			index = 0;
		else
			index = index+1;
		currentQuest = p.getActiveQuests().get(index+1);
	}
	/**
	 * sets the current quest to new quest
	 * @param newCurrent : new quest instance
	 */
	public void setCurrentQuest(Quest newCurrent){
		currentQuest = newCurrent;
	}
	/**
	 * @param p  
	 */
	public void updateCurrentQuest(Player p){
		
	}
	
	/**
	 * @param p : current player's instance
	 * @return
	 */
	public boolean checkQuestEnding(Player p){
		return true;
	}
	/**
	 * @return total # of quests
	 */
	public int getTotalQuests(){
		return totalQuests;
	}
	/**
	 * @return # of ongoing quests
	 */
	public int getNumberOfOngoingQuests(){
		return ongoingQuests.length;
	}

	/**
	 * @return all quests 
	 */
	public Quest[] getAllQuestsInTheGame() {
		return allQuestsInTheGame;
	}

	/**
	 * @param allQuestsInTheGame : all quests that are predefined in the game
	 */
	public void setAllQuestsInTheGame(Quest[] allQuestsInTheGame) {
		this.allQuestsInTheGame = allQuestsInTheGame;
	}
	
	
	
	
	
	
}
