package dotew.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	public static GameScreen theGameScreen ;
	
	
	
	
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
		
		theGameScreen = new GameScreen();
		addListenersTochrSelect(cardContainer, chrSelectionScreen);
		gameEngine = GameEngine.getInstance();//(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
		addListenersToGame(theGameScreen);
		
		cardContainer.add(mainMenu, "MainMenu");
		cardContainer.add(chrSelectionScreen,"CharacterSelect");
		cardContainer.add(theGameScreen, "TheGameScreen");
		
		
		cardLayout.show(cardContainer, "MainMenu");
		
		
	
		frame.add(cardContainer);
		
		
		frame.setVisible(true);
		

	}
	
	public static void setTextBoxex(GameScreen gameScreen, GameEngine gameEngine){
		gameEngine.getConsoleResponder().setTextBox(gameScreen.getTxtBoxConsole());
		gameEngine.getCommandInterpreter().setTextBox(gameScreen.getTxtBoxCommand());
	}
	
	public static void addListenersToGame(GameScreen gs){
//		gs.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyCode() == KeyEvent.VK_ENTER){
//					GameEngine.getInstance().getCommandInterpreter().checkSyntax(gs.getTxtBoxCommand().getText());
//					GameEngine.getInstance().getConsoleResponder().giveResponse("> " + gs.getTxtBoxCommand().getText());
//					gs.getTxtBoxCommand().setText("");
//					gs.repaint();
//				}
//				
//			}
//		});
		
		gs.getBtnEnter().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GameEngine.getInstance().getCommandInterpreter().checkSyntax(gs.getTxtBoxCommand().getText());
				GameEngine.getInstance().getConsoleResponder().giveResponse("> " + gs.getTxtBoxCommand().getText());
				
				gs.getTxtBoxCommand().setText("");
				gs.repaint();
				
			}
		});
	}
	
	
	public static void addListenersTochrSelect(JPanel parent, ChrSelection chrSelectionScreen){
		
		chrSelectionScreen.getSlctWarrior().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("warrior");
				//gameEngine = GameEngine.getInstance(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
				player = gameEngine.getPlayer();
				player.setClassOfCharacter(new ClassGame("Warrior"));
				player.setIconName("WarriorTexture.png");
				((CardLayout)parent.getLayout()).show(parent, "TheGameScreen");
				
			}
		});
		
		chrSelectionScreen.getSlctRogue().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Rogue");
				//gameEngine = GameEngine.getInstance(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
				player = gameEngine.getPlayer();
				player.setClassOfCharacter(new ClassGame("Rogue"));
				player.setIconName("RogueTexture.png");
				((CardLayout)parent.getLayout()).show(parent, "TheGameScreen");
				
			}
		});
		
		chrSelectionScreen.getSlctMage().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Mage");
				//gameEngine = GameEngine.getInstance(true, theGameScreen.getTxtBoxConsole(), theGameScreen.getTxtBoxCommand());
				player = gameEngine.getPlayer();
				player.setClassOfCharacter(new ClassGame("Mage"));
				player.setIconName("MageTexture.png");
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
