package controllers;

import java.util.List;
import interfaces.*;
import models.*;
import views.*;
import controllers.*;


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
	/** holds the choice from the user input */
	private int menuCommand;

	/**Cameron C.
	 * 
	 * @param choice
	 */
	public void ideaSelection(int choice) {
		if(choice == 1) {
			//edit choice
		}
		else if(choice == 2) {
			//delete choice
		}
		else if(choice == 3) {
			System.exit(1);
		}
	}

	/**Cameron C.
	 * 
	 * @return
	 */
	public int menuSelection() {
		IIdeaMenu refMenu = IIdeaMenu.getMenu(IIdeaMenu.MENU_TYPE_CLI);
		menuCommand = refMenu.getChoice();
	
		if(menuCommand == 1) {
			return menuCommand;
		}
		else if(menuCommand == 2) {
			return menuCommand;
		}
		else if(menuCommand == 3) {
			return menuCommand;
		}
		return 0;
	}
	
	public IdeaController() {
		this.model = null;
		this.view = null;
	}
	
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
