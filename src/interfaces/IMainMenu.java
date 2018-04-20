package interfaces;

import controllers.*;
import views.MainMenuCLInput;
/**
 * 
 * @author Cagle
 * A interface that gets the type of menu used for the program
 */
public interface IMainMenu {
	/** makes a CLI and GUI menu types */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu choice */
	public int getChoice();
	/**
	 * gets the type of menu
	 * @param menutype
	 * @return MainMenuCLInput: a command line input
	 */
	public static IMainMenu getMenu(int menutype) {
		if(menutype == MENU_TYPE_CLI)
			return new MainMenuCLInput();
		return null;
		
	}// end getMenu
}// end interface
