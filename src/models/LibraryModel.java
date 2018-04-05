package models;

/**
 *@author: Green Team
 *@version: 3/22/18
 *This class is the Model for the libraryController class.
 */

import java.util.List;

public class LibraryModel implements IF_Library{
    private List<TopicModel> topicList;
    private String libraryTitle;
    private String libraryDescription;
    private TopicModel description;
    
    public LibraryModel(List<TopicModel> tl, String lt, String ld, TopicModel desc) {
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

    public void setTopicList(List<TopicModel> topicList){
        this.topicList = topicList;
    }

    public List<TopicModel> getTopicList(){
        return this.topicList;
    }

	@Override
	public void createLibrary(List<TopicModel> topicList, String libraryTitle, String libraryDescription,
			TopicModel description) {
		this.topicList = topicList;
		this.libraryTitle = libraryTitle;
		this.libraryDescription = libraryDescription;
		this.description = description;
		
	}
}

