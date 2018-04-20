package controllers;

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
	
	IMainMenu mainMenu = IMainMenu.getMenu(IMainMenu.MENU_TYPE_CLI);
	menuCommand = mainMenu.getChoice();
	
	// this will choose the correct command based off of user input.
	if (menuCommand == 1) { 
		//Create library
		LibraryController lib = new LibraryController();
	}
	else if (menuCommand == 2) {
		//Exit Program
		System.exit(1);
	}
	
}
