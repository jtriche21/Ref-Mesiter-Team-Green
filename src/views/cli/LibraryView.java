/**
 * @author: Green Team: Cameron Cagle
 * @version: 3/21/18 
 * This class views the library.
 * @param String libraryDescription - The description of the user entered
 * for the library.
 * @param String libraryTitle - the title set for the library.
 * @param List<TopicModel> topicList - The list of Topics associated with this
 * library. 
 */
package views.cli;

import java.util.*;
import views.ILibraryView;
import controllers.TopicController;
import models.interfaces.ILibraryModel;

public class LibraryView {
    /* the library data entered. */
    private ILibraryModel library;
    /** description of the library */
    String libraryDescription;
    /** title of the library */
    String libraryTitle;
    /* scanner for the UI*/
    Scanner kB = new Scanner(System.in);

    /**
     * construct an input field dialog.
     */
    public LibraryView(ILibraryModel library){
        this.library = library;
    }

    /**
     * show the input entry UI.
     */
    public void getInputLibrary(){
        /** gets the library title from UI */
        System.out.println("Library Title: ");
        libraryTitle = kB.nextLine();
        /** gets the library description from UI */
        System.out.println("Library Description: ");
        libraryDescription = kB.nextLine();
        
        library.set(libraryTitle, libraryDescription);
    }
    /**
     * set the IF_LibraryModel object that the program works with.
     * @param library
     */
    public void setData(ILibraryModel library){
        this.library = library;
    }

    /**
     * get the IF_LibraryModel object that this program works with.
     * @return library
     */
    public ILibraryModel getData(){
        return this.library;
    }
}//end of LibraryView	
	
	

