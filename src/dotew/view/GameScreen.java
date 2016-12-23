package dotew.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameScreen extends JPanel {
	JTextArea txtBoxConsole;
	JTextField txtBoxCommand;
	JPanel multiPurpose;
	JButton btnEnter;
	

	

	public GameScreen() {
		GridBagLayout layoutMain = new GridBagLayout();
		GridBagConstraints gbcBtn = new GridBagConstraints();
		gbcBtn.fill = GridBagConstraints.NONE;
		gbcBtn.gridheight = 2;
		gbcBtn.gridwidth = 2;
		
		txtBoxConsole = new JTextArea();
		txtBoxConsole.setPreferredSize(new Dimension(550, 550));
		txtBoxCommand = new JTextField();
		txtBoxCommand.setPreferredSize(new Dimension(1000, 100));
		multiPurpose = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		multiPurpose.setPreferredSize(new Dimension(550, 550));
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

	public JPanel getMultiPurpose() {
		return multiPurpose;
	}

	public void setMultiPurpose(JPanel multiPurpose) {
		this.multiPurpose = multiPurpose;
	}

	

}
