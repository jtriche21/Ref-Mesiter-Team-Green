package controllers;

import java.util.List;
import models.ThemeModel;
import models.TopicModel;
import views.ThemeView;
import models.ReferenceModel;
/**
 * 
 * @author Cameron Cagle & Jeremy Triche
 *
 */
public class ThemeController {
	ThemeModel model;
	ThemeView view;
	ReferenceController ref;
	
	/** Cameron Cagle: a default constructor */
	public ThemeController() {
		this.model = null;
		this.view = null;
		this.ref = null;
	}
	
	/**
	 * Cameron Cagle: a constructor that creates a theme with all fields.
	 * @param model
	 * @param view
	 * @param r
	 */
	public ThemeController(ThemeModel model, ThemeView view, ReferenceController r) {
		this.model = model;
		this.view = view;
		this.ref = r;
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
	public List<ReferenceModel> getThemeReferenceList() {
		return model.getReferenceList();
	}
	public void setThemeReferenceList(List<ReferenceModel> referenceList) {
		model.setReferenceList(referenceList);
	}
	public void printThemeInformation() {
		view.printThemeInformation(model.getDescription(), model.getTitle(), model.getOwner(), 
										model.getOwner(), model.getReferenceList());
	}
}
