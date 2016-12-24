package dotew.controller;

import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import dotew.model.BattleMap;
import dotew.model.Player;
import dotew.model.Zone;

public class GameEngine {
	/**
	 * 
	 */
	private static GameEngine gameEngine = null;
	
	
	/**
	 * 
	 */
	private ArrayList<Zone> zoneList;
	/**
	 * 
	 */
	private Player player;
	/**
	 * 
	 */
	private Zone currentZone;
	//private SettingsManager settingsManager; TODO
	//private FileManager fileManager; TODO
	/**
	 * 
	 */
	private QuestManager questManager;
	/**
	 * 
	 */
	private CommandInterpreter commandInterpreter;
	/**
	 * 
	 */
	private MapManager mapManager;
	/**
	 * 
	 */
	private CollisionHandler collisionHandler;
	/**
	 * 
	 */
	private BattleManager battleManager;
	/**
	 * 
	 */
	private ConsoleResponder consoleResponder;
	

	/**
	 * @param newGame : a boolean value that checks whether it is anew game or not
	 * @param textBoxConsole : text box console on the game screen
	 * @param textBoxCommand : commands in the text box
	 */
	private GameEngine(boolean newGame, JTextArea textBoxConsole, JTextField textBoxCommand) {
		if(newGame){
			
			this.zoneList = new ArrayList<Zone>();
			// Zone list eklenecek
			this.currentZone = null; //this.zoneList.get(0);
			//Settings ve File Manager eklenecek
			this.questManager = new QuestManager();
			this.commandInterpreter = new CommandInterpreter(textBoxCommand);
			this.mapManager = new MapManager();
			this.collisionHandler = new CollisionHandler();
			this.battleManager = null;
			this.consoleResponder = new ConsoleResponder(textBoxConsole);
			this.player = Player.getInstance();
			
			
		}
	}
	
	/**
	 * creates a new game engine
	 * 
	 * @param newGame : boolean value that shows current game is a new game or not
	 * @param textBoxConsole : console on the game screen
	 * @param textBoxCommand : commands on the text boxes
	 * @return
	 */
	public static GameEngine getInstance(boolean newGame, JTextArea textBoxConsole, JTextField textBoxCommand){
		if(gameEngine == null){
			gameEngine = new GameEngine(newGame, textBoxConsole, textBoxCommand);
		}
		
		return gameEngine;
	}
	
	/**
	 * @return : returns game engine
	 */
	public static GameEngine getInstance(){
		return gameEngine;
	}

	/**
	 * @return : returns zone array list
	 */
	public ArrayList<Zone> getZoneList() {
		return zoneList;
	}

	/**
	 * @param zoneList
	 */
	public void setZoneList(ArrayList<Zone> zoneList) {
		this.zoneList = zoneList;
	}

	/**
	 * @return
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player : player that users can be set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return : return users current zone in the game
	 */
	public Zone getCurrentZone() {
		return currentZone;
	}

	/**
	 * @param currentZone
	 */
	public void setCurrentZone(Zone currentZone) {
		this.currentZone = currentZone;
	}

	/**
	 * @return
	 */
	public QuestManager getQuestManager() {
		return questManager;
	}

	/**
	 * @param questManager
	 */
	public void setQuestManager(QuestManager questManager) {
		this.questManager = questManager;
	}

	/**
	 * @return
	 */
	public CommandInterpreter getCommandInterpreter() {
		return commandInterpreter;
	}

	/**
	 * @param commandInterpreter
	 */
	public void setCommandInterpreter(CommandInterpreter commandInterpreter) {
		this.commandInterpreter = commandInterpreter;
	}

	/**
	 * @return
	 */
	public MapManager getMapManager() {
		return mapManager;
	}

	/**
	 * @param mapManager
	 */
	public void setMapManager(MapManager mapManager) {
		this.mapManager = mapManager;
	}

	/**
	 * @return
	 */
	public CollisionHandler getCollisionHandler() {
		return collisionHandler;
	}

	/**
	 * @param collisionHandler
	 */
	public void setCollisionHandler(CollisionHandler collisionHandler) {
		this.collisionHandler = collisionHandler;
	}

	/**
	 * @return
	 */
	public BattleManager getBattleManager() {
		return battleManager;
	}

	/**
	 * @param battleManager 
	 */
	public void setBattleManager(BattleManager battleManager) {
		this.battleManager = battleManager;
	}

	/**
	 * @return
	 */
	public ConsoleResponder getConsoleResponder() {
		return consoleResponder;
	}

	/**
	 * @param consoleResponder : console view on the game screen
	 */
	public void setConsoleResponder(ConsoleResponder consoleResponder) {
		this.consoleResponder = consoleResponder;
	}
	
	
	
	//Methods
	
	
	/**
	 * 
	 */
	public void endGame(){
		//TODO
	}
	
	/**
	 * moves the player accordingly
	 * @param direction : direction where users want to go
	 */
	public void move(String direction){
		this.mapManager.move(direction,this.player);
			
	}
	
	/**
	 * 
	 */
	public void changeZone(){
		//TODO
	}
	
	/**
	 * 
	 */
	public void drawMap(){
		//this.mapManager.drawMap();
	}
	
	
	/**
	 * @param battleMap : battlemap to create a battle view
	 * @return
	 */
	public BattleManager createBattleManager(BattleMap battleMap){
		BattleManager battleManager = new BattleManager(battleMap);
		return battleManager;
	}
	/**
	 * starts battle and arrange map views accordingly
	 * 
	 * @param battleMap : used for creating a battle map
	 */
	public void startBattle(BattleMap battleMap){
		this.battleManager = createBattleManager(battleMap);
		this.mapManager.startBattle(battleMap);
		TheGameMain.theGameScreen.getMultiPurpose().enterWar();
	}
	
	/**
	 * 
	 */
	public void changeToMapView(){
		//TODO
	}
	
	/**
	 * 
	 */
	public void changeToInventoryView(){
		//TODO
	}
	/**
	 * 
	 */
	public void changeToIntroductionView(){
		//TODO
	}
	/**
	 * 
	 */
	public void showStatistics(){
		
	}
	
	
	

}
