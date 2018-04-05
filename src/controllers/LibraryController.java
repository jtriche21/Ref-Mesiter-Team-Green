/**
 *@author: Green Team
 *@version: 3/21/18 
 *This class is the controller class for our library.
 */
package controllers;

import java.util.List;
import models.LibraryModel;
import views.LibraryView;

public class LibraryController {
    LibraryModel model;
    LibraryView view;

    public LibraryController(LibraryModel model,  LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public String getLibraryTitle(){
        return model.getTitle();
    }

    public void setLibraryTitle(String title){
        model.setTitle(title);
    }
    
    public String getLibraryDescription(){
        return model.getDescription();
    }
   
    public void setLibraryDescription(String description){
        model.setDescription();
    }

    public List<TopicModel> getLibraryTopicList(){
        return model.getTopicList();
    }

    public void setLibraryTopicList(List<TopicModel> topicList){
        model.setTopicList(topicList);
    }
}


