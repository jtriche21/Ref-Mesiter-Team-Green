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

import java.util.List;
import models.TopicModel;
import controllers.TopicController;

public class LibraryView implements CLIViewInterface{
	
	//TODO Loosely couple the view from the model using the controller
	//TODO Make command line capable
    public void veiwLibrary(String libraryTitle, String LibraryDescription,
                            List<TopicModel> topicList) {
        System.out.println("Library: " + libraryTitle);
        System.out.println("Library Description: " + LibraryDescription);
        System.out.println("Current topic: " + topicList.toString());
        
    }
}
