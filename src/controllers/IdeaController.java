package controllers;

import java.util.List;
import interfaces.IIdeaModel;
import interfaces.IIdeaView;
import interfaces.IReferenceModel;
import models.ReferenceModel;
import views.IdeaView;

/**
 * 
 * @author Tyler McVeigh
 *
 */
public class IdeaController {
	
	private IIdeaModel model;
	private IIdeaView view;
	
	public IdeaController(IIdeaModel model) {
		this.model = model;
		this.view = new IdeaView();
	}
	
	public List<ReferenceModel> getReferences(){
		return model.getAssociatedReferences();
	}
	
	public IIdeaModel getIdea() {
		return this.model;
	}
	
	public void addReference(IReferenceModel reference) {
		this.model.addReference(reference);
	}
	
	public void viewIdea() {
		this.view.printIdea();
	}
	
	public void editIdea() {
		this.model = this.view.edit()
	}

}
