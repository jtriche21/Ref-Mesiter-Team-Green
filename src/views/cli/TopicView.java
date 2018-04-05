package views.cli;
import java.util.List;

import models.ThemeModel;

public class TopicView {
	public void printAllThemes(List<ThemeModel> themeList) {
		System.out.println("Themes: ");
		for(int i=0; i<themeList.size(); i++) {
			System.out.print(themeList.get(i).getTitle() + " ");
		}
	}
	
	
	public void printTheme(List<ThemeModel> themeList, int index) {
		System.out.println(themeList.get(index).getTitle());
	}
}
