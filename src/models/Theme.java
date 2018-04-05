package models;

import java.util.List;

public class Theme {
	private String description;
	private String title;
	private Topic owner;
	private Topic topic;
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
	public Topic getOwner() {
		return owner;
	}
	public void setOwner(Topic owner) {
		this.owner = owner;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public List<Reference> getReferenceList() {
		return referenceList;
	}
	public void setReferenceList(List<Reference> referenceList) {
		this.referenceList = referenceList;
	}
}
