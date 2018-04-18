package views.cli;

import java.util.Scanner;
import models.interfaces.IThemeModel;

public class ThemeView {
	/** The theme model interface*/
	private IThemeModel theme;
	/** The theme description. */
	String themeDescription;
	/** The theme title. */
	String themeTitle;
	/** The scanner used for user input */
	Scanner scanner;
	
	/**
	 * Instantiates a new theme view.
	 * @param theme the theme
	 */
	public ThemeView(IThemeModel theme) {
		scanner = new Scanner(System.in);
		this.theme = theme;
	}
	
	/**
	 * Gets the user input.
	 * @return the user input
	 */
	public void getUserInput() {
		System.out.print("Theme title: ");
		themeTitle = scanner.next();
		System.out.println("Theme Description");
		themeDescription = scanner.next();
		
		theme.set(themeTitle, themeDescription);
	}
	
	/**
	 * Sets the theme model interface.
	 * @param theme sets the current instance to this one
	 */
	public void setThemeData(IThemeModel theme) {
		this.theme = theme;
	}
	
	/**
	 * Gets an instance of the theme model interface
	 * @return the instance of the theme model interface that should have been initialized
	 */
	public IThemeModel getThemeData() {
		return this.theme;
	}
}
