package interfaces;
/**
 * 
 * @author Cameron Cagle
 * This is the view interface which can work with GUI or CLI.
 */
public interface ILibraryView {
	/** show entry form to the user for input. */
    public void getInputLib();

    /** get the data entered by the user. */
    public ILibraryModel getData();

    /** set the data entered by the user */
    public void setData(ILibraryModel newlibrary);

}