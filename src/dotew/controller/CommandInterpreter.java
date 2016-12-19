package dotew.controller;

import java.util.ArrayList;
import java.awt.TextArea;


public class CommandInterpreter {

	private ArrayList<String> commandLibrary;
	private TextArea textBox;
	private String currentCommand;
	
	//constructor
	CommandInterpreter(ArrayList<String> commandLibrary, TextArea textBox, String currentCommand){
		this.commandLibrary = commandLibrary;
		this.textBox = textBox;
		this.currentCommand = currentCommand;
	}
	
	public boolean checkSyntax(String command){
		// TODO
	}
	
	public String matchCommand(String str){
		// TODO
	}
	
	public String getCommandFrmTextBox(){
		// TODO
		
	}
	
	//getset
	public ArrayList<String> getCommandLibrary(){
		return commandLibrary;
	}
	
	public TextArea getTextBox(){
		return textBox;
	}
	
	public String GetCurrentCommand(){
		return currentCommand;
	}
	
	public void setCommandLibrary(ArrayList <String> commandLibrary){
		this.commandLibrary = commandLibrary;
	}
	public void setTextBox(TextArea textBox){
		this.textBox = textBox;
	}
	public void setCurrentCommand(String currentCommand){
		this.currentCommand = currentCommand;
	}
}
