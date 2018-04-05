package models.interfaces;

import java.util.List;

import models.Topic;

public interface IF_Library {
	public void createLibrary(List<Topic> topicList, String libraryTitle, 
								String libraryDescription, Topic description);
}
