package interfaces;
import views.*;
/** 
 * 
 * @author Jeremy Triche & Cameron Cagle
 * A interface that selects the type of menu used for the program.
 */
public interface ITopicMenu {
	/** makes CLI and GUI menu types. */
	public static int MENU_TYPE_CLI = 111, MENU_TYPE_GUI = 112;
	/** gets the menu choice */
	public int getChoice();
	
	/**
	 * gets the type of menu
	 * @param menu_type
	 * @return TopicMenuCLInput: a command line input for topic
	 */
	public static ITopicMenu getMenu(int menu_type) {
		if(menu_type == MENU_TYPE_CLI)
			return new TopicMenuCLInput();
		//else if(menu_type == MENU_TYPE_GUI)
		//	return new TopicMenuGUI();
		return null;
		
	}
}
