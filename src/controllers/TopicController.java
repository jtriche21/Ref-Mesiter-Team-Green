package controllers;

import java.util.List;
import models.*;
import views.*;
import controllers.*;
import interfaces.*;
/**
 * 
 * @author Cameron Cagle & Jeremy Triche
 *
 */

public class TopicController {
	private TopicModel model;
	private TopicView view;
	private ThemeController theme;
	private int menuCommand;
	private int themeCommand;
	
	/** CameronC: a default constructor */
	public TopicController() {
		this.model = null;
		this.view = null;
		this.theme = null;
	}
	
	/**
	 * a method that creates or views a library, will also exit if needed.
	 * @param choice 1: create library, 2: view library, 3: exit
	 */
	public void topicSelection(int choice) {
		if(choice == 1) {
			ThemeController theme = new ThemeController();
			themeCommand = theme.menuSelection();
			theme.themeSelection(themeCommand);
		}
		else if(choice == 2) {
			
			
		}
		else if(choice == 3) {
			
			
		}
	}
	/** CameronC: this will call the topic menu*/
	public int menuSelection() {
		ITopicMenu topicMenu = ITopicMenu.getMenu(ITopicMenu.MENU_TYPE_CLI);
		menuCommand = topicMenu.getChoice();
	
		if(menuCommand == 1) {
			return menuCommand;
		}
		else if(menuCommand == 2) {
			return menuCommand;
		}
		else if(menuCommand == 3) {
			return menuCommand;
		}
		return 0;
	}
	
	public String getTopicTitle() {
		return model.getTitle();
	}
	public void setTopicTitle(String title) {
		model.setTitle(title);
	}
	public LibraryModel getTopicOwner() {
		return model.getOwner();
	}
	public void setTopicOwner(LibraryModel owner) {
		model.setOwner(owner);
	}
	public ThemeModel getTopicDescription() {
		return model.getDescription();
	}
	public void setTopicDescription(ThemeModel description) {
		model.setDescription(description);
	}
	public List<ThemeModel> getTopicThemeList(){
		return model.getThemeList();
	}
	public void setTopicThemeList(List<ThemeModel> themeList) {
		model.setThemeList(themeList);
	}
	
	/**
	 * A method to add the Theme object to the current Topic object.
	 * @param theme - The theme object that will be added
	 * @return true if the theme passed in exist, "Why would it?"
	 */
	public boolean addTheme(ThemeModel theme) {
		if(getTopicThemeList().add(theme)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * A method to remove the Theme object passed in from the current list of Themes
	 * @param theme - The Theme object that will be removed
	 * @return true if the Theme object was in the current list of Themes
	 */
	public boolean removeTheme(ThemeModel theme) {
		if(getTopicThemeList().remove(theme)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * A method that will print all the Theme objects in the current list of Themes
	 */
	public void viewThemes() {
		view.printAllThemes(getTopicThemeList());
	}
	
	public void viewTheme(int index) {
		view.printTheme(getTopicThemeList(), index);
	}
}
