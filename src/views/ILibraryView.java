package views;

import models.interfaces.ILibraryModel;

public interface ILibraryView {
	/** show entry form to the user for input. */
    public void getInputLibrary();

    /** get the data entered by the user. */
    public ILibraryModel getData();

    /** set the data entered by the user */
    public void setData(ILibraryModel newlibrary);

}