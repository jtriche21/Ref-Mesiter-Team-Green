package views;

import models.interfaces.IThemeModel;

public interface IThemeView {
	/** Prompt the user for the input about the*/
	public void promptForThemeInput();
	/** Return an instance of the Theme the user created*/
	public IThemeModel getThemeData();
	/** Set the Thememodel*/
	public void setThemeData(IThemeModel newTheme);
}
