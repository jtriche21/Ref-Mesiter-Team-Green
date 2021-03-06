package views; 

/**
 * @author: Cameron Cagle
 * @version: 3/21/18 
 * This class views the library.
 * @param String libraryDescription - The description of the user entered
 * for the library.
 * @param String libraryTitle - the title set for the library.
 * @param List<TopicModel> topicList - The list of Topics associated with this
 * library. 
 */


import java.util.*;
import controllers.TopicController;
import interfaces.*;

public class LibraryView implements ILibraryView {
    /** the library data entered. */
    private ILibraryModel library;
    /** description of the library */
    String libraryDescription;
    /** title of the library */
    String libraryTitle;
    /** scanner for the UI*/
    Scanner kB = new Scanner(System.in);

    /**
     * construct an input field dialog.
     */
    public LibraryView(ILibraryModel library){
        this.library = library;
    }// end LibarayView

    /**
     * show the input entry UI.
     */
    public void getInputLib(){
        /** gets the library title from UI */
        System.out.println("Library Title: ");
        libraryTitle = kB.nextLine();
        /** gets the library description from UI */
        System.out.println("Library Description: ");
        libraryDescription = kB.nextLine();
        
        library.set(libraryTitle, libraryDescription);
    }// end getInputLib
    
    /**
     * set the IF_LibraryModel object that the program works with.
     * @param library
     */
    public void setData(ILibraryModel library){
        this.library = library;
    }// end setData

    /**
     * get the IF_LibraryModel object that this program works with.
     * @return library
     */
    public ILibraryModel getData(){
        return this.library;
    }// end getData
}//end of LibraryView	
	
	

