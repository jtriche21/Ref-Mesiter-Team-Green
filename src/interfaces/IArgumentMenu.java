package interfaces;

public interface IArgumentMenu {
	/** makes CLI and GUI menu types. */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu choice */
	public int getChoice();
	
	/**
	 * gets the type of menu
	 * @param menu_type
	 * @return ArgumentMenuCLInput: a command line input for topic
	 */
	public static IArgumentMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new ArgumentMenuCLInput();
		//else if(menu_type == MENU_TYPE_GUI)
		//	return new ArgumentMenuGUI();
		return null;
		
	}
}
