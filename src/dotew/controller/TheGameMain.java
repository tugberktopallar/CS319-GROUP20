package dotew.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dotew.model.ClassGame;
import dotew.model.Player;
import dotew.view.ChrSelection;
import dotew.view.GameScreen;
import dotew.view.MainMenu;

public class TheGameMain {
	
	public static GameEngine gameEngine;
	public static Player player;
	
	
	
	
	
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
		
		ChrSelection chrSelectionScreen = new ChrSelection();
		
		GameScreen theGameScreen = new GameScreen();
		addListenersTochrSelect(cardContainer, chrSelectionScreen, theGameScreen);
		
		cardContainer.add(mainMenu, "MainMenu");
		cardContainer.add(chrSelectionScreen,"CharacterSelect");
		cardContainer.add(theGameScreen, "TheGameScreen");
		
		
		cardLayout.show(cardContainer, "MainMenu");
		
		
	
		frame.add(cardContainer);
		
		
		frame.setVisible(true);
		

	}
	
	
	public static void addListenersTochrSelect(JPanel parent, ChrSelection chrSelectionScreen, GameScreen theGameScreen){
		chrSelectionScreen.getSlctWarrior().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("warrior");
				gameEngine = GameEngine.getInstance(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
				player = gameEngine.getPlayer();
				//player.setClassOfCharacter(new ClassGame("Warrior"));
				((CardLayout)parent.getLayout()).show(parent, "TheGameScreen");
				
			}
		});
		
		chrSelectionScreen.getSlctRogue().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Rogue");
				gameEngine = GameEngine.getInstance(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
				player = gameEngine.getPlayer();
				//player.setClassOfCharacter(new ClassGame("Rogue"));
				((CardLayout)parent.getLayout()).show(parent, "TheGameScreen");
				
			}
		});
		
		chrSelectionScreen.getSlctMage().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Mage");
				gameEngine = GameEngine.getInstance(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
				player = gameEngine.getPlayer();
				//player.setClassOfCharacter(new ClassGame("Mage"));
				((CardLayout)parent.getLayout()).show(parent, "TheGameScreen");
				
			}
		});
		
		
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
