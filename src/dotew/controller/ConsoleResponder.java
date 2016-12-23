package dotew.controller;

import java.util.Hashtable;

import javax.swing.JTextArea;

import dotew.model.CCharacter;
import java.awt.TextArea;

public class ConsoleResponder {
	private Hashtable<Integer, String> readyResponse;
	private TextArea textBox;
	
	ConsoleResponder(Hashtable<Integer, String> readyResponse, TextArea textBox){
		this.readyResponse = readyResponse;
		this.textBox = textBox;
	}
	
	public ConsoleResponder(JTextArea textBox) {
		// TODO Auto-generated constructor stub
	}

	//getset
	public Hashtable<Integer, String> getReadyResponse(){
		return readyResponse;
	}
	public TextArea getTextBox(){
		return textBox;
	}
	
	public void setReadyResponse(Hashtable<Integer, String> readyResponse){
		this.readyResponse = readyResponse;
	}
	
	public void setTextBox(TextArea textBox){
		this.textBox = textBox;
	}
	
	public void giveResponseFrmLst(Integer tableKey){
		//TODO
	}
	
	public void giveAttackResponse(CCharacter c1, CCharacter c2, int amount){
		//TODO
	}
	
}