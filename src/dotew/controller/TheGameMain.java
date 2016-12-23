package dotew.controller;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dotew.view.MainMenu;

public class TheGameMain {
	
	
	
	
	
	
	
	//MAIN METHOD
	public static void main(String[] args) {
		System.out.println("Hello dotew!!");
		JFrame frame = new JFrame("Dread Of The Evil Wizard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		
		
		MainMenu mainMenu = new MainMenu();
		frame.add(mainMenu);
		
		
		frame.setVisible(true);
		

	}

}
