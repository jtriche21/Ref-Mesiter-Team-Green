package models;

import java.util.List;

import topic_classes.TopicModel;

public class ThemeModel {
	private String description;
	private String title;
	private TopicModel owner;
	private TopicModel topic;
	private List<Reference> referenceList;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public TopicModel getOwner() {
		return owner;
	}
	public void setOwner(TopicModel owner) {
		this.owner = owner;
	}
	public TopicModel getTopic() {
		return topic;
	}
	public void setTopic(TopicModel topic) {
		this.topic = topic;
	}
	public List<Reference> getReferenceList() {
		return referenceList;
	}
	public void setReferenceList(List<Reference> referenceList) {
		this.referenceList = referenceList;
	}
}
