package dotew.controller;

import java.util.ArrayList;
import javax.swing.JTextField;

import dotew.model.CCharacter;

import dotew.model.NPC;

import dotew.model.Skill;

import java.io.IOException;
import java.awt.TextArea;
import java.util.*;


public class CommandInterpreter {

	private Hashtable<String, Integer> commandLibrary;
	private TextArea textBox;
	private String currentCommand;
	private GameEngine game;
	private NPC npc;
	private JTextField textBoxCommand;
		
	//constructor
	CommandInterpreter(Hashtable<String, Integer> commandLibrary, TextArea textBox, String currentCommand, NPC npc){
		this.commandLibrary = commandLibrary;
		this.textBox = textBox;
		this.currentCommand = currentCommand;
		this.npc = npc;
	}
		
	public CommandInterpreter(JTextField textBoxCommand) {

		this.textBoxCommand = null;

	}

//	public void checkSyntax(String command){
//		
//		String chName = "";
//		command = command.toLowerCase();
//		String[] text; 
//		
//		//for attack method determines the enemy index
//		if(command.substring(0 , 7).equals("attack")){
//			chName = command.substring(7, command.length());
//
//			matchCommand("attack", game.getBattleManager().getCharacterList().indexOf(chName), null);
//		}
		
		//applyskill method, dteremines enemy index, skill name
//		if(command.substring(0 , 10).equals("applyskill")){
//			text = command.split(" ");
//			return matchCommand("applyskill", game.getBattleManager().getCharacterList().indexOf(text[1]), (Skill)text[2]);
//		}	
			
		//for other methods
//		matchCommand(command.replaceAll("\\s+",""), -1, null);			
//	}
//		
//	public void matchCommand(String str, int index, Skill s){
//
//		   
//
//			matchCommand("attack", game.getBattleManager().getCharacterList().indexOf(chName));
//		
//		
//		//applyskill method, dteremines enemy index, skill name
//		if(command.substring(0 , 10).equals("applyskill")){
//			text = command.split(" ");
//			matchCommand("applyskill", game.getBattleManager().getCharacterList().indexOf(text[1]));
//		}	
//			
//		//for other methods
//		matchCommand(command.replaceAll("\\s+",""), -1);			
//	}
		
	public void matchCommand(String str, int index){
  

		   Integer n = commandLibrary.get(str);
		   if (n != null) { 
				switch(n){
					case 1:
						game.move("north");
						break;
					case 2:
				    	game.move("south");
				    	break;
					case 3:
				    	game.move("east");
				    	break;
					case 4:
				    	game.move("west");
				    	break;
					case 5:
				    	game.getBattleManager().attack(game.getPlayer(), (CCharacter) game.getBattleManager().getCharacterList().get(index));
				    	break;
				    	
				    //use skill(skill name, on ch)
					case 6:
						//game.getBattleManager().applySkill(game.getPlayer(),  (CCharacter) game.getBattleManager().getCharacterList().get(index), );
						break;
						
					//is there anything i can help you with
					case 7:
						npc.giveQuest(game.getPlayer());
						break;
						   
				}
			}
		   
			   
		}

		
		public void getCommandFrmTextBox(){

			currentCommand = this.textBox.getText();
		
					
		}
		
		//getset
		
		public String GetCurrentCommand(){
			return currentCommand;
		}
		
		public void setCommandLibrary(Hashtable commandLibrary){
			this.commandLibrary = commandLibrary;
		}
		public void setTextBox(TextArea textBox){
			this.textBox = textBox;
		}
		public void setCurrentCommand(String currentCommand){
			this.currentCommand = currentCommand;
		}
	}

