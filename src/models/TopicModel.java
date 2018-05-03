package models;
import java.util.List;

import interfaces.ILibraryModel;
import interfaces.IThemeModel;

/**
 * 
 * @author Cagle
 *
 */
public class TopicModel {
	/** list of Themes. */
	private List<IThemeModel> ThemeList;
	/** owner of the topic. */
	private ILibraryModel owner;
	private String title;
	private String description;
	
	public ILibraryModel getOwner() {
		return owner;
	}
	public void setOwner(ILibraryModel owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<IThemeModel> getThemeList() {
		return ThemeList;
	}
	public void setThemeList(List<IThemeModel> themeList) {
		ThemeList = themeList;
	}
	public boolean addTheme(IThemeModel theme) {
		return ThemeList.add(theme);
	}
 
}
