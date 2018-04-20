package interfaces;
import views.*;
/**
 * 
 * @author Cameron Cagle
 * A interface that selects the type of menu used for the program
 */
public interface ILibMenu {
	/** makes CLI and GUI menu types */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112; 
	/** gets the menu choice */
	public int getChoice();
	
	/** 
	 * gets the type of menu 
	 * @param menuType
	 * @return LibMenuCLInput: a command line input
	 */
	public static ILibMenu getMenu(int menuType) {
		if(menuType == MENU_TYPE_CLI)
			return new LibMenuCLInput();
		return null;
	}
		
}
