package views;
import java.util.Scanner;

import interfaces.ITopicModel;
import interfaces.ITopicView;

public class TopicView implements ITopicView {
	
	/** The topic model interface*/
	private ITopicModel topic;
	
	/** The title of the topic */
	String title;
	
	/** The description of the topic */
	String description;
	
	/** The scanner used for user input */
	Scanner s;
	
	/**
	 * Instantiates a new topic view and creates a new scanner for the keyboard
	 *
	 * @param topic the interface we are going to set
	 */
	public TopicView(ITopicModel topic) {
		s = new Scanner(System.in);
		this.topic = topic;
		
	}
	
	/** 
	 * Used to get the user input for the topic and set the interface
	 */
	@Override
	public void getUserTopicInput() {
		System.out.print("Topic title: ");
		title = s.next();
		System.out.println("Topic Description: ");
		description = s.nextLine();
		
		topic.set(title, description);
		
		
	}

	/** 
	 * Sets the topic model interface
	 * @param topic sets the current instance to this one
	 */
	@Override
	public void setTopicData(ITopicModel topic) {
		this.topic = topic;
		
	}

	/** 
	 * Gets an instance of the topic model interface
	 * @return the instance of the topic model interface that should have been initialized
	 */
	@Override
	public ITopicModel getTopicData() {
		return this.topic;
	}
	
}
