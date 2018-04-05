package models;

import java.util.List;

public interface IF_Library {
	public void createLibrary(List<TopicModel> topicList, String libraryTitle, 
								String libraryDescription, TopicModel description);
}
