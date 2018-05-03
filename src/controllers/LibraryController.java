package controllers;

import java.util.List;

import models.*;
import controllers.*;
import interfaces.*;
import views.*;

/**
 * 
 * @author Cameron Cagle
 * A class that controls the library data, menu, and view
 */
public class LibraryController {
	/** library model object */
	LibraryModel model;
	/** library view interface object */
    ILibraryView view;
    /** a topic controller*/
    TopicController topic;
    /** command returned from menu selection */
    private int topicCommand;
    
    private int menuCommand;
    /** instance of a LibraryController */
    private static LibraryController instance;
    
    public void libSelection(int choice) {
    	if(choice == 1) {
    		TopicController topic = new TopicController();
    		topicCommand = topic.menuSelection();
    		topic.topicSelection(topicCommand);
    	}
    	else if (choice == 2) {
    		view.getInputLib();
    	}
    	else if (choice == 3) {
    		System.exit(1);
    	}
    }
    
    /** function that will return menu selection*/
    public int menuSelection() {
    	ILibMenu libMenu = ILibMenu.getMenu(IMainMenu.MENU_TYPE_CLI);
    	menuCommand = libMenu.getChoice();
    	if(menuCommand == 1) {
    		return menuCommand;
    	}
    	else if(menuCommand == 2) {
    		return menuCommand;
    	}
    	else if(menuCommand == 3) {
    		return menuCommand;
    	}
    	return 0;
	}
    
    /** creates a default constructor */

    public LibraryController() {
    	this.model = null;
    	this.view = null;
    	this.topic = null;
    }
    

    /**
     * a constructor that holds all of the fields of the library controller
     * @param model
     * @param view
     * @param t: topic controller object
     */
    public LibraryController(LibraryModel model,  ILibraryView view, TopicController t) {
        this.model = model;
        this.view = view;
        this.topic = t;
    }
    
    /**
     * gets one instance of a library controller 
     * @return instance: instance of a library controller
     */
    public static LibraryController getInstance() {
    	if(instance == null) 
    		instance = new LibraryController();
    	return instance;
    }
    
    /**
     * gets the library model
     * @return model
     */
    public LibraryModel getLibraryModel(){
        return model;
    }
    
    /**
     * sets the library model
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
     * gets the list of topics under a the current library object
     * @return list of topics
     */
    public List<TopicModel> getLibraryTopicList(){
        return model.getTopicList();
    }
    
    /**
     * sets the list of topics for the library
     * @param topicList
     */
    public void setLibraryTopicList(List<TopicModel> topicList){
        model.setTopicList(topicList);
    }
}



