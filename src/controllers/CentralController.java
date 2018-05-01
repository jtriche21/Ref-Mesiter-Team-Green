package controllers;
import controllers.*;
import interfaces.*;
import views.MainMenuCLInput;
/**
 *  
 * @author Cameron Cagle
 * this class will start the program based off a menu of selections.
 */
public class CentralController {
	// holds the command choice.
	private int menuCommand; 
	private int libCommand;
	// I don't understand what the error I'm getting is?
	
	public void mainSelection(int choice) {
		if(choice == 1) {
			LibraryController lib = new LibraryController();
			libCommand = lib.menuSelection();
			lib.libSelection(libCommand);
		}
		else if (choice == 2) {
			//Exit Program
			System.exit(1);
		}
	}
	
	public int menuSelection() {
		IMainMenu mainMenu = IMainMenu.getMenu(IMainMenu.MENU_TYPE_CLI);
		menuCommand = mainMenu.getChoice();
		if(menuCommand == 1)
			return menuCommand;
		else if(menuCommand == 2)
			return menuCommand;
		else 
			return 0;
	}
}


