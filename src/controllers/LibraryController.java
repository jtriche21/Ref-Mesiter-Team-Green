/**
 *@author: Green Team
 *@version: 3/21/18 
 *This class is the controller class for our library.
 */
package controllers;

import java.util.List;

import models.*;
import controllers.TopicController;
import interfaces.*;
import views.*;

/**
 * 
 * @author Cagle
 * Controls the library view, edit, add, save, and delete functions
 */
public class LibraryController {
	/** library model object */
	LibraryModel model;
	/** library view interface object */
    ILibraryView view;
    /** has a topic controller */
    TopicController t;
    /** contains the menu command */
    private int menuCommand;
    
    ILibMenu libraryMenu = ILibMenu.getMenu(ILibMenu.MENU_TYPE_CLI);
    libraryMenu = libMenu.getChoice();
    
    
    /** instance of a LibraryController */
    private static LibraryController instance;
    
    /** creates a default constructor of the library controller. */
    public LibraryController() {
    	this.model = null;
    	this.view = null;
    	this.t = null;
    }
    
    /** creates a constructor that has all fields. */
    public LibraryController(LibraryModel model,  ILibraryView view, TopicController t) {
        this.model = model; 
        this.view = view; 
        this.t = t; 
    } 
     
    /** 
     * gets an instance of library controller.
     * @return
     */
    public static LibraryController getInstance() {
    	if(instance == null) 
    		instance = new LibraryController();
    	return instance;
    }
    
    /**
     * gets the library model.
     * @return model
     */
    public LibraryModel getLibraryModel(){
        return model;
    }
    
    /**
     * sets the library model.
     * @param model
     */
    public void setLibraryModel(LibraryModel model){
        this.model = model;
    }
   
    /**
     * gets the library view  
     * @return view
     */
    public ILibraryView getLibraryView(){
        return view;
    }
    
    /**
     * sets the library view
     * @param view
     */
    public void setLibraryView(ILibraryView view){
        this.view = view;
    }
    
    /**
     * gets the list of topics under the library 
     * @return the list of topics.
     */  
    public List<TopicModel> getLibraryTopicList(){
        return model.getTopicList();
    }
    
    /**
     * sets the topic list for the specific library
     * @param topicList
     */
    public void setLibraryTopicList(List<TopicModel> topicList){
        model.setTopicList(topicList);
    }
}


