package models;

/**
 *@author: Green Team
 *@version: 3/22/18
 *This class is the Model for the libraryController class.
 */

import java.util.List;

import models.interfaces.IF_Library;

public class Library implements IF_Library{
    private List<Topic> topicList;
    private String libraryTitle;
    private String libraryDescription;
    private Topic description;
    
    public Library(List<Topic> tl, String lt, String ld, Topic desc) {
    	createLibrary(tl, lt, ld, desc);
    }
    
    public void setLibraryTitle(String libraryTitle){
           this.libraryTitle = libraryTitle;
    }
    
    public String getLibraryTitle(){
        return this.libraryTitle;
    }

    public void setLibraryDescription(String libraryDescription){
        this.libraryDescription = libraryDescription;
    }

    public String getLibraryDescription(){
        return this.libraryDescription;
    }

    public void setTopicList(List<Topic> topicList){
        this.topicList = topicList;
    }

    public List<Topic> getTopicList(){
        return this.topicList;
    }

	@Override
	public void createLibrary(List<Topic> topicList, String libraryTitle, String libraryDescription,
			Topic description) {
		this.topicList = topicList;
		this.libraryTitle = libraryTitle;
		this.libraryDescription = libraryDescription;
		this.description = description;
		
	}
}

