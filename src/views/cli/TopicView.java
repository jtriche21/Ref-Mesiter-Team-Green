package views.cli;
import java.util.List;
import views.IF_TopicView;
import models.Theme;

public class TopicView implements IF_TopicView {
	public void printAllThemes(List<Theme> themeList) {
		System.out.println("Themes: ");
		for(int i=0; i<themeList.size(); i++) {
			System.out.print(themeList.get(i).getTitle() + " ");
		}
	}
	
	
	public void printTheme(List<Theme> themeList, int index) {
		System.out.println(themeList.get(index).getTitle());
	}
}
