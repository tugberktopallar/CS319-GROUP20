package dotew.utilities;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UIUtil {

	public static void showMsgBox(JFrame frame,String title,String msg){
	
		JOptionPane.showMessageDialog(frame, msg, title, JOptionPane.INFORMATION_MESSAGE);
		
	}
}
