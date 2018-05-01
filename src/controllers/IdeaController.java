package controllers;

import java.util.List;
import interfaces.IIdeaModel;
import interfaces.IIdeaView;
import interfaces.IReferenceModel;
import views.IdeaView;

/**
 * Controller for the Ideas
 * 
 * @author Tyler McVeigh
 *
 */
public class IdeaController {
	
	/** The Idea model that this controller is for */
	private IIdeaModel model;
	/** The view associated with this model */
	private IIdeaView view;
	
	/**
	 * 
	 * @param model the Idea model is to be associated with
	 */
	public IdeaController(IIdeaModel model) {
		this.model = model;
		this.view = new IdeaView(model);
	}
	/**
	 * 
	 * @return
	 */
	public List<IReferenceModel> getReferences(){
		return model.getAssociatedReferences();
	}
	
	/**
	 * 
	 * @return
	 */
	public IIdeaModel getIdea() {
		return this.model;
	}
	
	/**
	 * 
	 * @param reference
	 */
	public void addReference(IReferenceModel reference) {
		this.model.addReference(reference);
	}
	
	/**
	 * 
	 */
	public void viewIdea() {
		this.view.printIdea();
	}
	
	/**
	 * 
	 */
	public void editIdea() {
		this.model = this.view.getData();
	}

}
