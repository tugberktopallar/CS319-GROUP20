package dotew.utilities;

import javax.swing.JFrame;

public class ExceptionHandler {
	
	public static void handleException(JFrame frame,Exception e){
		String msg=e.getMessage();
		if(msg==null)
			msg="System Error";
		UIUtil.showMsgBox(frame, "Error", msg);
		
	}
}
