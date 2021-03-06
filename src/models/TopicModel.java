package models;
import java.util.List;
import interfaces.*;

/**
 * 
 * @author Cagle
 *
 */
public class TopicModel implements ITopicModel{
	/** list of Themes. */
	private List<ThemeModel> ThemeList;
	/** owner of the topic. */
	private LibraryModel owner;
	private String title;
	private String description;
	
	public LibraryModel getOwner() {
		return owner;
	}
	public void setOwner(LibraryModel owner) {
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
	public List<ThemeModel> getThemeList() {
		return ThemeList;
	}
	public void setThemeList(List<ThemeModel> themeList) {
		ThemeList = themeList;
	}
	public void set(String title, String description) {
		setTitle(title);
		setDescription(description);
	}
}
