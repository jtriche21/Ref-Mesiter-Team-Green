package models;
import java.util.List;

public class Topic {
	private List<Theme> ThemeList;
	private Library owner;
	private String title;
	private Theme description;
	
	public Library getOwner() {
		return owner;
	}
	public void setOwner(Library owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Theme getDescription() {
		return description;
	}
	public void setDescription(Theme description) {
		this.description = description;
	}
	public List<Theme> getThemeList() {
		return ThemeList;
	}
	public void setThemeList(List<Theme> themeList) {
		ThemeList = themeList;
	}
 
}
