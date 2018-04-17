/**
 *@author: Green Team
 *@version: 3/21/18 
 *This class is the controller class for our library.
 */
package controllers;

import java.util.List;
import models.LibraryModel;
import models.Topic;
import views.cli.LibraryView;

public class LibraryController {
    LibraryModel model;
    LibraryView view;

    public LibraryController(LibraryModel model,  LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public String getLibraryTitle(){
        return model.getLibraryTitle();
    }

    public void setLibraryTitle(String title){
        model.setLibraryTitle(title);
    }
    
    public String getLibraryDescription(){
        return model.getLibraryDescription();
    }
   
    public void setLibraryDescription(String description){
        model.setLibraryDescription(description);
    }

    public List<Topic> getLibraryTopicList(){
        return model.getTopicList();
    }

    public void setLibraryTopicList(List<Topic> topicList){
        model.setTopicList(topicList);
    }
}


