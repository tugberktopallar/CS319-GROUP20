package dotew.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
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
		
		Dimension dmBtn = new Dimension(125, 50);
		btnNewGame = new JButton("New Game");
		btnNewGame.setPreferredSize(dmBtn);
		
//		btnNewGame.setAlignmentX(CENTER_ALIGNMENT);
		
		btnLoadGame= new JButton("Load Game");
		btnLoadGame.setPreferredSize(dmBtn);
	//	btnLoadGame.setAlignmentX(CENTER_ALIGNMENT);
		btnSettings= new JButton("Settings");
		btnSettings.setPreferredSize(dmBtn);
		//btnSettings.setAlignmentX(CENTER_ALIGNMENT);
		btnCredits= new JButton("Credits");
		btnCredits.setPreferredSize(dmBtn);
		//btnCredits.setAlignmentX(CENTER_ALIGNMENT);
		btnExit= new JButton("Exit");
		btnExit.setPreferredSize(dmBtn);
	//	btnExit.setAlignmentX(CENTER_ALIGNMENT);
		
		
		
//		InputStream is=new Dummy().getClass().getResourceAsStream("MainLogo.jpg");
//		javafx.scene.image.Image logo = new javafx.scene.image.Image(is);
//		lblLogo = new JLabel();
//		lblLogo.add(logo);
		
		gbcBtn.gridx = GridBagConstraints.CENTER;
		gbcBtn.insets = new Insets(150, 0, 8, 0);
		
		this.add(btnNewGame,gbcBtn);
//		gbcBtn.gridy = GridBagConstraints.RELATIVE;
		gbcBtn.insets = new Insets(8, 0, 8, 0);
		
		this.add(btnLoadGame,gbcBtn);
		
		
		this.add(btnSettings,gbcBtn);
	
		this.add(btnCredits,gbcBtn);
		
		this.add(btnExit,gbcBtn);

		
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		Image img = null;
		try {
			img = ImageIO.read(new Dummy().getClass().getResource("MainBackGround.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(img != null){
			int h = img.getHeight(this);
			int w = img.getWidth(this);
			
			g.drawImage(img,0,0,this);
		}
			
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
	
	public JButton getBtnNewGame() {
		return btnNewGame;
	}



	public void setBtnNewGame(JButton btnNewGame) {
		this.btnNewGame = btnNewGame;
	}



	public JButton getBtnLoadGame() {
		return btnLoadGame;
	}



	public void setBtnLoadGame(JButton btnLoadGame) {
		this.btnLoadGame = btnLoadGame;
	}



	public JButton getBtnSettings() {
		return btnSettings;
	}



	public void setBtnSettings(JButton btnSettings) {
		this.btnSettings = btnSettings;
	}



	public JButton getBtnCredits() {
		return btnCredits;
	}



	public void setBtnCredits(JButton btnCredits) {
		this.btnCredits = btnCredits;
	}



	public JButton getBtnExit() {
		return btnExit;
	}



	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

}
