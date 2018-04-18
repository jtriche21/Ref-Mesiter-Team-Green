package interfaces;

public interface IThemeView {
	/** Prompt the user for the input about the*/
	public void promptForThemeInput();
	/** Return an instance of the Theme the user created*/
	public IThemeModel getThemeData();
	/** Set the ThemeModel*/
	public void setThemeData(IThemeModel newTheme);
}
