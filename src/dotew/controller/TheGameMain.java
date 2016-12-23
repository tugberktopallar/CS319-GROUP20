package dotew.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
		
		JPanel cardContainer = new JPanel();
		CardLayout cardLayout = new CardLayout();
		cardContainer.setLayout(cardLayout);
		
		MainMenu mainMenu = new MainMenu();
		addListenersToMain(cardContainer,mainMenu);
		
		cardContainer.add(mainMenu, "MainMenu");
//		cardContainer.add(chrSelectionScreen,"CharacterSelect");
//		cardCOntainer.add(theGameScreen, "TheGameScreen");
		
		
		cardLayout.show(cardContainer, "MainMenu");
		
		
	
		frame.add(cardContainer);
		
		
		frame.setVisible(true);
		

	}
	
	public static void addListenersToMain(JPanel parent,MainMenu mainMenu){
		mainMenu.getBtnNewGame().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout)parent.getLayout()).show(parent, "CharacterSelect");
				
			}
		});
	
		mainMenu.getBtnLoadGame().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	
		mainMenu.getBtnSettings().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	
		mainMenu.getBtnCredits().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mainMenu.getBtnExit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		
	}
	
	

}
