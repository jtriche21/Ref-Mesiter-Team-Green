/**
 *@author: Green Team
 *@version: 3/21/18 
 *This class is the controller class for our library.
 */
package controllers;

import java.util.List;
import models.*;
import controllers.TopicController;
import views.ILibraryView;

/**
 * 
 * @author Cagle
 *
 */
public class LibraryController {
	/** library model object */
	LibraryModel model;
	/** library view interface object */
    ILibraryView view;
    /** */
    TopicController t;
    
    /** instance of a LibraryController */
    private static LibraryController instance;
      
    public LibraryController() {
    	this.model = null;
    	this.view = null;
    	this.t = null;
    }
    
    public LibraryController(LibraryModel model,  ILibraryView view, TopicController t) {
        this.model = model;
        this.view = view;
        this.t = t;
    }
    
    public static LibraryController getInstance() {
    	if(instance == null) 
    		instance = new LibraryController();
    	return instance;
    }

    public LibraryModel getLibraryModel(){
        return model;
    }

    public void setLibraryModel(LibraryModel model){
        this.model = model;
    }
    
    public ILibraryView getLibraryView(){
        return view;
    }
   
    public void setLibraryView(ILibraryView view){
        this.view = view;
    }

    public List<TopicModel> getLibraryTopicList(){
        return model.getTopicList();
    }

    public void setLibraryTopicList(List<TopicModel> topicList){
        model.setTopicList(topicList);
    }
}


