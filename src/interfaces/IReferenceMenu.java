package interfaces;

public interface IReferenceMenu {
	/** makes CLI and GUI menu types. */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu choice */
	public int getChoice();
	
	/**
	 * gets the type of menu
	 * @param menu_type
	 * @return ReferenceMenuCLInput: a command line input for topic
	 */
	public static IReferenceMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new ReferenceMenuCLInput();
		//else if(menu_type == MENU_TYPE_GUI)
		//	return new ReferenceMenuGUI();
		return null;
		
	}
}
