package interfaces;

public interface IThemeMenu {
	/** makes CLI and GUI menu types */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu selection from the user */
	public int getChoice();
	
	/**
	 * gets the type of menu
	 * @param menu_type
	 * @return: MainMenuCLInput: a command line input for the main menu
	 */
	public static IThemeMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new ThemeMenuCLInput();
		//else if(menu_type == MENU_TYPE_GUI)
		//	  return new ThemeMenuGUI();
		return null;
		
	}// end getMenu
}
