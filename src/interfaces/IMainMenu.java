package interfaces;

import controllers.*;
import views.MainMenuCLInput;
/**
 * 
 * @author Cagle
 * A interface that selects the type of menu used for the program
 */
public interface IMainMenu {
	/** makes CLI and GUI menu types */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu selection from the user */
	public int getChoice();
	
	/**
	 * gets the type of menu
	 * @param menu_type
	 * @return: MainMenuCLInput: a command line input for the main menu
	 */
	public static IMainMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new MainMenuCLInput();
		return null;
		
	}
}
