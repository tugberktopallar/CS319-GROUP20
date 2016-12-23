package dotew.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dotew.resources.Dummy;

public class ChrSelection extends JPanel {
	JButton slctWarrior;
	JButton slctRogue;
	JButton slctMage;
	JLabel imgWarrior;
	JLabel imgRogue;
	JLabel imgMage;
	
	JPanel chr1;
	JPanel chr2;
	JPanel chr3;
	

	public ChrSelection() {
		GridBagLayout layoutMain = new GridBagLayout();
		GridBagConstraints gbcBtn = new GridBagConstraints();
		gbcBtn.fill = GridBagConstraints.NONE;
		gbcBtn.gridheight = 1;
		gbcBtn.gridwidth = 3;
		
		
		
		this.setLayout(layoutMain);
		this.setSize(new Dimension(1280,720));
		
		ImageIcon img = new ImageIcon(new Dummy().getClass().getResource("WarriorClass.jpg"));
		imgWarrior = new JLabel(img);
		imgWarrior.setPreferredSize(new Dimension(450, 550));
		img = new ImageIcon(new Dummy().getClass().getResource("RogueClass.png"));
		imgRogue = new JLabel(img);
		imgRogue.setPreferredSize(new Dimension(450, 550));
		img = new ImageIcon(new Dummy().getClass().getResource("MageClass.jpg"));
		imgMage = new JLabel(img);
		imgMage.setPreferredSize(new Dimension(450, 550));
		
		Dimension dmBtn = new Dimension(150, 50);
		slctWarrior = new JButton("Warrior");
		slctWarrior.setPreferredSize(dmBtn);
		
		slctRogue = new JButton("Rogue");
		slctRogue.setPreferredSize(dmBtn);
		
		slctMage = new JButton("Mage");
		slctMage.setPreferredSize(dmBtn);
		
		chr1 = new JPanel(layoutMain);
		chr2 = new JPanel(layoutMain);
		chr3 = new JPanel(layoutMain);
		
		gbcBtn.insets = new Insets(5, 20, 5, 20);
		chr1.add(imgWarrior,gbcBtn);
		chr1.add(slctWarrior,gbcBtn);
		
		chr2.add(imgRogue,gbcBtn);
		chr2.add(slctRogue,gbcBtn);
		
		chr3.add(imgMage,gbcBtn);
		chr3.add(slctMage,gbcBtn);
		
		gbcBtn.gridheight = 1;
		gbcBtn.gridwidth = 3;
		
		this.add(chr1,gbcBtn);
		this.add(chr2,gbcBtn);
		this.add(chr3,gbcBtn);
		
		
		
		
	
	}

	public JButton getSlctWarrior() {
		return slctWarrior;
	}

	public void setSlctWarrior(JButton slctWarrior) {
		this.slctWarrior = slctWarrior;
	}

	public JButton getSlctRogue() {
		return slctRogue;
	}

	public void setSlctRogue(JButton slctRogue) {
		this.slctRogue = slctRogue;
	}

	public JButton getSlctMage() {
		return slctMage;
	}

	public void setSlctMage(JButton slctMage) {
		this.slctMage = slctMage;
	}

	public JPanel getChr1() {
		return chr1;
	}

	public void setChr1(JPanel chr1) {
		this.chr1 = chr1;
	}

	public JPanel getChr2() {
		return chr2;
	}

	public void setChr2(JPanel chr2) {
		this.chr2 = chr2;
	}

	public JPanel getChr3() {
		return chr3;
	}

	public void setChr3(JPanel chr3) {
		this.chr3 = chr3;
	}

	public ChrSelection(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public ChrSelection(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public ChrSelection(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
