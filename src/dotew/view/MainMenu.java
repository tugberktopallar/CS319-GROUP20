package dotew.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import dotew.resources.Dummy;

public class MainMenu extends JPanel {
	JButton btnNewGame;
	JButton btnLoadGame;
	JButton btnSettings;
	JButton btnCredits;
	JButton btnExit;
	
	JLabel lblLogo;
	
	public MainMenu() {
		GridBagLayout layoutMain = new GridBagLayout();
		GridBagConstraints gbcBtn = new GridBagConstraints();
		gbcBtn.fill = GridBagConstraints.NONE;
		gbcBtn.gridheight = 1;
		gbcBtn.gridwidth = 3;
		
		
		
		this.setLayout(layoutMain);
		this.setSize(new Dimension(1280,720));
		
		Dimension dmBtn = new Dimension(150, 100);
		btnNewGame = new JButton("New Game");
		btnNewGame.setSize(dmBtn);
		
//		btnNewGame.setAlignmentX(CENTER_ALIGNMENT);
		
		btnLoadGame= new JButton("Load Game");
		btnLoadGame.setSize(dmBtn);
	//	btnLoadGame.setAlignmentX(CENTER_ALIGNMENT);
		btnSettings= new JButton("Settings");
		btnSettings.setSize(dmBtn);
		//btnSettings.setAlignmentX(CENTER_ALIGNMENT);
		btnCredits= new JButton("Credits");
		btnCredits.setSize(dmBtn);
		//btnCredits.setAlignmentX(CENTER_ALIGNMENT);
		btnExit= new JButton("Exit");
		btnExit.setMinimumSize(dmBtn);
	//	btnExit.setAlignmentX(CENTER_ALIGNMENT);
		
		
		
//		InputStream is=new Dummy().getClass().getResourceAsStream("MainLogo.jpg");
//		javafx.scene.image.Image logo = new javafx.scene.image.Image(is);
//		lblLogo = new JLabel();
//		lblLogo.add(logo);
		
		gbcBtn.gridx = GridBagConstraints.CENTER;
		
		this.add(btnNewGame,gbcBtn);
//		gbcBtn.gridy = GridBagConstraints.RELATIVE;
		
		this.add(btnLoadGame,gbcBtn);
		
		
		this.add(btnSettings,gbcBtn);
	
		this.add(btnCredits,gbcBtn);
		
		this.add(btnExit,gbcBtn);

		
		
		
	}
	
	

	public MainMenu(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainMenu(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainMenu(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	

}
