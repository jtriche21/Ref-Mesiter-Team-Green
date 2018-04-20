package interfaces;

import controllers.*;
import views.MainMenuCLInput;
/**
 * 
 * @author Cagle
 *
 */
public interface IMainMenu {
	
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	
	public int getChoice();
	
	
	public static IMainMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new MainMenuCLInput();
		return null;
		
	}
}
