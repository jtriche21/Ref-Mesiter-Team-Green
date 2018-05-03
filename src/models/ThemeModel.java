package models;

import java.util.List;

import interfaces.IReferenceModel;
import interfaces.IThemeModel;
import interfaces.ITopicModel;

public class ThemeModel implements IThemeModel {
	
	private String description;
	private String title;
	private ITopicModel owner;
	private List<IReferenceModel> referenceList;
	
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
	public ITopicModel getOwner() {
		return owner;
	}
	public void setOwner(ITopicModel owner) {
		this.owner = owner;
	}
	public List<IReferenceModel> getReferenceList() {
		return referenceList;
	}
	public void setReferenceList(List<IReferenceModel> referenceList) {
		this.referenceList = referenceList;
	}
	@Override
	public void set(String title, String description) {
		
		this.setTitle(title);
		this.setDescription(description);
	}
}
