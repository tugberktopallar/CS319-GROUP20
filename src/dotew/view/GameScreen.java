package dotew.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameScreen extends JPanel {
	JTextArea txtBoxConsole;
	JTextField txtBoxCommand;
	JPanel multiPurpose;
	

	

	public GameScreen() {
		GridBagLayout layoutMain = new GridBagLayout();
		GridBagConstraints gbcBtn = new GridBagConstraints();
		gbcBtn.fill = GridBagConstraints.NONE;
		gbcBtn.gridheight = 2;
		gbcBtn.gridwidth = 2;
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
