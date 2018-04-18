package views;

import models.interfaces.ITopicModel;

public interface ITopicView {
	
	/**
	 * Gets the user topic input.
	 *
	 * @return the user topic input
	 */
	public void getUserTopicInput();
	
	/**
	 * Sets the topic data.
	 *
	 * @param topic the new topic data
	 */
	public void setTopicData(ITopicModel topic);
	
	/**
	 * Gets the topic data.
	 *
	 * @return the topic data
	 */
	public ITopicModel getTopicData();
}
