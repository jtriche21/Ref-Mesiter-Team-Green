package controllers;

import java.util.List;
import models.ThemeModel;
import models.TopicModel;
import views.cli.ThemeView;
import models.Reference;

public class ThemeController {
	ThemeModel model;
	ThemeView view;
	
	public ThemeController(ThemeModel model, ThemeView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getThemeTitle() {
		return model.getTitle();
	}
	public void setThemeTitle(String title){
		model.setTitle(title);
	}
	public String getThemeDescription() {
		return model.getDescription();
	}
	public void setThemeDescription(String description) {
		model.setDescription(description);
	}
	public TopicModel getThemeTopic() {
		return model.getTopic();
	}
	public void setThemeTopic(TopicModel topic) {
		model.setTopic(topic);
	}
	public TopicModel getThemeOwner() {
		return model.getOwner();
	}
	public void setThemeOwner(TopicModel owner) {
		model.setOwner(owner);
	}
	public List<Reference> getThemeReferenceList() {
		return model.getReferenceList();
	}
	public void setThemeReferenceList(List<Reference> referenceList) {
		model.setReferenceList(referenceList);
	}
	public void printThemeInformation() {
		view.printThemeInformation(model.getDescription(), model.getTitle(), model.getOwner(), 
										model.getOwner(), model.getReferenceList());
	}
}
