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
	private static TopicController instance;
	
	/** CameronC: a default constructor */
	public TopicController() {
		this.model = null;
		this.view = new TopicView();
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
			view.getUserTopicInput();
		}
		else if(choice == 3) {
			System.exit(1);
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
	
	public static TopicController getInstance() {
		if(instance == null)
			instance = new TopicController();
		return instance;
	}
	
	public TopicModel getTopicModel() {
		return model;
	}
	
	public void setTopicModel(TopicModel model) {
		this.model = model; 
	}
	
	public TopicView getTopicView() {
		return view;
	}
	
	public void setTopicView(TopicView view) {
		this.view = view;
	}
	
	public List<ThemeModel> getTopicThemList(){
		return model.getThemeList();
	}
	public void setTopicThemeLIst(List<ThemeModel> themeList) {
		model.setThemeList(themeList);
	}
}	
