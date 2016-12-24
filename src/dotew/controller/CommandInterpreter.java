package dotew.controller;

import javax.swing.JTextField;

import dotew.model.CCharacter;

import dotew.model.NPC;
import dotew.model.*;
import dotew.model.Skill;

import java.io.IOException;
import java.awt.TextArea;
import java.util.*;


public class CommandInterpreter {

	private Hashtable<String, Integer> commandLibrary;
	private JTextField textBox;
	private String currentCommand;
	private GameEngine game;
	private NPC npc;
	private JTextField textBoxCommand;
		
	//constructor
	CommandInterpreter(Hashtable<String, Integer> commandLibrary, JTextField textBox, String currentCommand, NPC npc){
		this.commandLibrary = commandLibrary;
		this.textBox = textBox;
		this.currentCommand = currentCommand;
		this.npc = npc;
	}
		
	public CommandInterpreter(JTextField textBoxCommand) {

		this.textBoxCommand = textBoxCommand;
		this.currentCommand = null;
		//TODO hashtable
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("movenorth", 1);
		ht.put("movesouth", 2);
		ht.put("moveeast", 3);
		ht.put("movewest", 4);
		
		ht.put("attack", 5);
		
		ht.put("applyskill", 6);
		
		this.commandLibrary = ht;
		game = GameEngine.getInstance();
				
		
		

	}

	public void checkSyntax(String command){
		
	String chName = "";
	String[] text ;
	command = command.toLowerCase();

	System.out.println(command);
		//for attack method determines the enemy index
	if(command.length()> 7){
		if(command.substring(0 , 7).equals("attack")){
			chName = command.substring(7, command.length());

			matchCommand("attack", game.getBattleManager().getCharacterList().indexOf(chName),null);
		}
	}
	
		
		//applyskill method, determines enemy index, skill name
		if(command.length() > 10){
			if(command.substring(0 , 10).equals("applyskill")){
				text = command.split(" ");
				String c2name = text[1];
				String skillName = "";
				for(int i = 2; i< text.length; i++){
					skillName = skillName+text[i];
				}
				
				matchCommand("applyskill", game.getBattleManager().getCharacterList().indexOf(c2name), skillName);
			}
		}
			
			
		//for other methods
		System.out.println(command.replaceAll("\\s+",""));
		matchCommand(command.replaceAll("\\s+",""), -1, null);			
	}
		
	public void matchCommand(String str, int index, String skill){
  

		   Integer n = commandLibrary.get(str);
		   if (n != null) { 
				switch(n){
					case 1:
						GameEngine.getInstance().move("north");
						break;
					case 2:
						GameEngine.getInstance().move("south");
				    	break;
					case 3:
						GameEngine.getInstance().move("east");
				    	break;
					case 4:
						GameEngine.getInstance().move("west");
				    	break;
					case 5:
						GameEngine.getInstance().getBattleManager().attack(GameEngine.getInstance().getPlayer(), (CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index));
				    	break;
				    	
				    //use skill(skill name, on ch)
					case 6:
					   switch(skill){
						
					   //mages
						case "fireball":
							Mage1Skill m1 = new Mage1Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), m1);
							break;
							
						case "icespike":
							Mage2Skill m2 = new Mage2Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), m2);
							break;
							
						case "deflect":
							Mage3Skill m3 = new Mage3Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), m3);
							break;
							
						case "cosmiclight":
							Mage4Skill1 m4 = new Mage4Skill1();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), m4);
							break;
							
						//rogues	
						case "invisibility":
							Rogue4Skill r4 = new Rogue4Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), r4);
							break;
							
						case "knifethrow":
							Rogue3Skill r3 = new Rogue3Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), r3);
							break;
						
						case "pisonknife":
							Rogue2Skill r2 = new Rogue2Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), r2);
							break;
	
						case "backstab":
							Rogue1Skill r1 = new Rogue1Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), r1);
							break;
							
						//warriors
						case "chargee!!":
							Warrior1Skill w1 = new Warrior1Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), w1);
							break;
						
						case "ravage":
							Warrior2Skill w2 = new Warrior2Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), w2);
							break;
						
						case "block":
							Warrior3Skill w3 = new Warrior3Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), w3);
							break;
						
						case "berserker'sblood":
							Warrior4Skill w4 = new Warrior4Skill();
							GameEngine.getInstance().getPlayer().useSkill((CCharacter) GameEngine.getInstance().getBattleManager().getCharacterList().get(index), w4);
							break;
													
						}						
						break;
						
					//is there anything i can help you with
					case 7:
						//npc give quest
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
		public void setTextBox(JTextField jTextField){
			this.textBox = jTextField;
		}
		public void setCurrentCommand(String currentCommand){
			this.currentCommand = currentCommand;
		}
	}

