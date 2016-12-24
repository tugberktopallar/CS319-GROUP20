package dotew.controller;

import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import dotew.model.BattleMap;
import dotew.model.Player;
import dotew.model.Zone;

public class GameEngine {
	private static GameEngine gameEngine = null;
	
	
	private ArrayList<Zone> zoneList;
	private Player player;
	private Zone currentZone;
	//private SettingsManager settingsManager; TODO
	//private FileManager fileManager; TODO
	private QuestManager questManager;
	private CommandInterpreter commandInterpreter;
	private MapManager mapManager;
	private CollisionHandler collisionHandler;
	private BattleManager battleManager;
	private ConsoleResponder consoleResponder;
	

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
	
	public static GameEngine getInstance(boolean newGame, JTextArea textBoxConsole, JTextField textBoxCommand){
		if(gameEngine == null){
			gameEngine = new GameEngine(newGame, textBoxConsole, textBoxCommand);
		}
		
		return gameEngine;
	}
	
	public static GameEngine getInstance(){
		return gameEngine;
	}

	public ArrayList<Zone> getZoneList() {
		return zoneList;
	}

	public void setZoneList(ArrayList<Zone> zoneList) {
		this.zoneList = zoneList;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Zone getCurrentZone() {
		return currentZone;
	}

	public void setCurrentZone(Zone currentZone) {
		this.currentZone = currentZone;
	}

	public QuestManager getQuestManager() {
		return questManager;
	}

	public void setQuestManager(QuestManager questManager) {
		this.questManager = questManager;
	}

	public CommandInterpreter getCommandInterpreter() {
		return commandInterpreter;
	}

	public void setCommandInterpreter(CommandInterpreter commandInterpreter) {
		this.commandInterpreter = commandInterpreter;
	}

	public MapManager getMapManager() {
		return mapManager;
	}

	public void setMapManager(MapManager mapManager) {
		this.mapManager = mapManager;
	}

	public CollisionHandler getCollisionHandler() {
		return collisionHandler;
	}

	public void setCollisionHandler(CollisionHandler collisionHandler) {
		this.collisionHandler = collisionHandler;
	}

	public BattleManager getBattleManager() {
		return battleManager;
	}

	public void setBattleManager(BattleManager battleManager) {
		this.battleManager = battleManager;
	}

	public ConsoleResponder getConsoleResponder() {
		return consoleResponder;
	}

	public void setConsoleResponder(ConsoleResponder consoleResponder) {
		this.consoleResponder = consoleResponder;
	}
	
	
	
	//Methods
	
	
	public void endGame(){
		//TODO
	}
	
	public void move(String direction){
		//this.mapManager.move(direction,this.player);
			
	}
	
	public void changeZone(){
		//TODO
	}
	
	public void drawMap(){
		//this.mapManager.drawMap();
	}
	
	
	public BattleManager createBattleManager(BattleMap battleMap){
		BattleManager battleManager = new BattleManager(battleMap);
		return battleManager;
	}
	public void startBattle(BattleMap battleMap){
		this.battleManager = createBattleManager(battleMap);
		this.player.setMapCell(battleMap.getTerrainCellList()[5][3]);
	}
	
	public void changeToMapView(){
		//TODO
	}
	
	public void changeToInventoryView(){
		//TODO
	}
	public void changeToIntroductionView(){
		//TODO
	}
	public void showStatistics(){
		
	}
	
	
	

}
