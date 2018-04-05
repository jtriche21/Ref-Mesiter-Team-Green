package controllers;

import java.util.List;

import models.LibraryModel;
import models.ThemeModel;
import models.TopicModel;
import views.cli.CLIViewInterface;
import views.cli.TopicView;

public class TopicController implements CLIViewInterface {
	private TopicModel model;
	private TopicView view;
	
	public TopicController(TopicModel model) {
		this.model = model;
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
