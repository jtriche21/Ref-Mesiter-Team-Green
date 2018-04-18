package models;

/**
 * 
 *@author: Cameron Cagle 
 *@version: 3/22/18
 *This class is the Model for the libraryController class.
 */
import models.interfaces.*;

import java.util.List;

import interfaces.ILibraryModel;

public class LibraryModel implements ILibraryModel{
    private String libraryTitle;
    private String libraryDescription;
    private List<TopicModel> topicList;
    
    /** Default constructor for objects of class library*/
    public LibraryModel() {
    	this.libraryTitle = "";
    	this.libraryDescription = "";
    	this.topicList = null;
    }// end default constructor
    
    /**
     * Constructor a library with all fields. 
     * @param libraryTitle
     * @param libraryDescription
     * @param topicList
     */
    public LibraryModel(String libraryTitle, String libraryDescription,
    			   List<TopicModel> topicList) {
    	this.set(libraryTitle, libraryDescription);
    	this.topicList = topicList;
    }//end constructor
    
    /**
     * Constructs a library with all fields except topicList.
     * @param libraryTitle
     * @param libraryDescription
     */
    public LibraryModel(String libraryTitle, String libraryDescription) {
    	this.set(libraryTitle, libraryDescription);
    }//end constructor
    
    /**
     * Sets the title of the library.
     * @param libraryTitle
     */
    public void setLibraryTitle(String libraryTitle){
           this.libraryTitle = libraryTitle;
    }
    
    /**
     * Gets the title of the library.
     * @return libraryTitle
     */
    public String getLibraryTitle(){
        return this.libraryTitle;
    }
    
    /**
     * Sets the description of the library.
     * @param libraryDescription
     */
    public void setLibraryDescription(String libraryDescription){
        this.libraryDescription = libraryDescription;
    }
    
    /**
     * Gets the description of the library.
     * @return
     */
    public String getLibraryDescription(){
        return this.libraryDescription;
    }
    
    /**
     * Sets the Topic List. 
     * @param topicList
     */
    public void setTopicList(List<TopicModel> topicList){
       this.topicList = topicList;
    }
    
    /**
     * Gets the topic list.
     * @return topicList
     */
    public List<TopicModel> getTopicList(){
        return this.topicList;
    }
    
    /**
     * Set all the fields of library objects except topicList.
     * @param libraryTitle
     * @param libraryDescription
     */
	public void set(String libraryTitle, String libraryDescription) {
		this.libraryTitle = libraryTitle;
		this.libraryDescription = libraryDescription;
	}
	
}

