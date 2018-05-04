/**
 * 
 * @author Cameron Cagle
 * This class will run our reference miester.
 */
import controllers.*;

public class Driver {
	
	private static int menuCommand;
	
	private static ApplicationDriver appDriver;
	
	public static void main(String[] args) {
		appDriver = ApplicationDriver.getInstance(args);
		
		CentralController ctrl = new CentralController();
		menuCommand = ctrl.menuSelection();
		ctrl.mainSelection(menuCommand);
	}
		

}
