package dotew.controller;

import java.util.Hashtable;

import javax.swing.JTextArea;

import dotew.model.CCharacter;
import java.awt.TextArea;

public class ConsoleResponder {
	private Hashtable<Integer, String> readyResponse;
	private JTextArea textBox;
	
	ConsoleResponder(Hashtable<Integer, String> readyResponse, JTextArea textBox){
		this.readyResponse = readyResponse;
		this.textBox = textBox;
	}
	
	public ConsoleResponder(JTextArea textBox) {
		this.readyResponse = null;
		this.textBox = textBox;
	}

	//getset
	public Hashtable<Integer, String> getReadyResponse(){
		return readyResponse;
	}
	public JTextArea getTextBox(){
		return textBox;
	}
	
	public void setReadyResponse(Hashtable<Integer, String> readyResponse){
		this.readyResponse = readyResponse;
	}
	
	public void setTextBox(JTextArea jTextArea){
		this.textBox = jTextArea;
	}
	
	public void giveResponseFrmLst(Integer tableKey){
		this.textBox.append(this.readyResponse.get(tableKey) + "\n");
	}
	
	public void giveAttackResponse(CCharacter c1, CCharacter c2, int amount){
		this.textBox.append(c1.getName() + " caused " + amount+ " points of damage to "+c2.getName()+"\n");
	} 
	
	public void giveResponse(String response){
		this.textBox.append(response +"\n");
	}
	
}