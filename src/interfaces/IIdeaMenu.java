package interfaces;

public interface IIdeaMenu {
	/** makes CLI and GUI menu types. */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu choice */
	public int getChoice();
	
	/**
	 * gets the type of menu
	 * @param menu_type
	 * @return IdeaMenuCLInput: a command line input for topic
	 */
	public static IIdeaMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new IdeaMenuCLInput();
		//else if(menu_type == MENU_TYPE_GUI)
		//	return new IdeaMenuGUI();
		return null;
		
	}
}
