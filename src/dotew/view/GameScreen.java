package dotew.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dotew.controller.GameEngine;

public class GameScreen extends JPanel {
	JTextArea txtBoxConsole;
	JTextField txtBoxCommand;
	MultiPurposePanel multiPurpose;
	JButton btnEnter;
	

	

	public GameScreen() {
		GridBagLayout layoutMain = new GridBagLayout();
		GridBagConstraints gbcBtn = new GridBagConstraints();
		gbcBtn.fill = GridBagConstraints.NONE;
		gbcBtn.gridheight = 2;
		gbcBtn.gridwidth = 2;
		
		txtBoxConsole = new JTextArea();
		txtBoxConsole.setEditable(false);
		txtBoxConsole.setPreferredSize(new Dimension(550, 550));
		txtBoxCommand = new JTextField();
		txtBoxCommand.setPreferredSize(new Dimension(1000, 100));
		GameEngine gameEngine = GameEngine.getInstance(true, this.getTxtBoxConsole(), this.getTxtBoxCommand());
		
		multiPurpose = new MultiPurposePanel(gameEngine.getMapManager().getCurrentMap().getTerrainCellList());
		
		
		
		btnEnter = new JButton("Enter");
		btnEnter.setPreferredSize(new Dimension(150, 50));
		
		this.add(txtBoxConsole);
		this.add(multiPurpose);
		this.add(txtBoxCommand);
		this.add(btnEnter);
		
		
		
	}

	

	public GameScreen(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public GameScreen(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public GameScreen(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	
	public JButton getBtnEnter() {
		return btnEnter;
	}

	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}
	public JTextArea getTxtBoxConsole() {
		return txtBoxConsole;
	}

	public void setTxtBoxConsole(JTextArea txtBoxConsole) {
		this.txtBoxConsole = txtBoxConsole;
	}

	public JTextField getTxtBoxCommand() {
		return txtBoxCommand;
	}

	public void setTxtBoxCommand(JTextField txtBoxCommand) {
		this.txtBoxCommand = txtBoxCommand;
	}



	public MultiPurposePanel getMultiPurpose() {
		return multiPurpose;
	}



	public void setMultiPurpose(MultiPurposePanel multiPurpose) {
		this.multiPurpose = multiPurpose;
	}

	

	

}
