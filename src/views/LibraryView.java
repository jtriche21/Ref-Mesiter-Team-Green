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
package topic_classes;

public class LibraryView{
    public void veiwLibrary(String libraryTitle, String LibraryDescription,
                            List<TopicList> topicList);
        System.out.println("Library: " + libraryTitle);
        System.out.println("Library Description: " + libraryDescription);
        System.out.println("Current topic: " + topicList.toString());
        
    }
}
