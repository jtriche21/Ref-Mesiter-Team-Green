package models;
import java.util.List;

public class TopicModel {
	private List<ThemeModel> ThemeList;
	private LibraryModel owner;
	private String title;
	private ThemeModel description;
	
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
	public ThemeModel getDescription() {
		return description;
	}
	public void setDescription(ThemeModel description) {
		this.description = description;
	}
	public List<ThemeModel> getThemeList() {
		return ThemeList;
	}
	public void setThemeList(List<ThemeModel> themeList) {
		ThemeList = themeList;
	}
 
}
