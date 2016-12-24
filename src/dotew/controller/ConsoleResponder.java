package dotew.controller;

import java.util.Hashtable;

import javax.swing.JTextArea;

import dotew.model.CCharacter;
import java.awt.TextArea;

public class ConsoleResponder {
	/**
	 * 
	 */
	private Hashtable<Integer, String> readyResponse;
	/**
	 * 
	 */
	private JTextArea textBox;
	
	/**
	 * @param readyResponse: hashtable values of previously defined responses
	 * @param textBox: text box for commands
	 */
	ConsoleResponder(Hashtable<Integer, String> readyResponse, JTextArea textBox){
		this.readyResponse = readyResponse;
		this.textBox = textBox;
	}
	
	/**
	 * @param textBox : text box of console
	 */
	public ConsoleResponder(JTextArea textBox) {
		this.readyResponse = null;
		this.textBox = textBox;
	}

	//getset
	/**
	 * @return
	 */
	public Hashtable<Integer, String> getReadyResponse(){
		return readyResponse;
	}
	/**
	 * @return
	 */
	public JTextArea getTextBox(){
		return textBox;
	}
	
	/**
	 * @param readyResponse
	 */
	public void setReadyResponse(Hashtable<Integer, String> readyResponse){
		this.readyResponse = readyResponse;
	}
	
	/**
	 * @param jTextArea
	 */
	public void setTextBox(JTextArea jTextArea){
		this.textBox = jTextArea;
	}
	
	/**
	 * give response to user from the ready response list
	 * @param tableKey: index of response
	 */
	public void giveResponseFrmLst(Integer tableKey){
		this.textBox.append(this.readyResponse.get(tableKey) + "\n");
	}
	
	/**
	 * after attack displays the damage number
	 * @param c1: player
	 * @param c2 : other character
	 * @param amount: damage number
	 */
	public void giveAttackResponse(CCharacter c1, CCharacter c2, int amount){
		this.textBox.append(c1.getName() + " caused " + amount+ " points of damage to "+c2.getName()+"\n");
	} 
	
	/**
	 * appends responses to the text box
	 * @param response : string
	 */
	public void giveResponse(String response){
		this.textBox.append(response +"\n");
	}
	
}