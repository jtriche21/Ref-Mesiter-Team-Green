package controllers;

import java.util.List;
import interfaces.*;
import models.*;
import views.*;
import controllers.*;

/**
 * 
 * @author Tyler McVeigh
 *
 */
public class IdeaController {
	
	private IIdeaModel model;

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
	
	public IdeaController(IIdeaModel model) {
		this.model = model;
		this.view = new IdeaView();
	}
	
	public List<IReferenceModel> getReferences(){
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
