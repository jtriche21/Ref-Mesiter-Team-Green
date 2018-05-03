package controllers;

import java.util.List;
import interfaces.*;
import models.*;
import views.*;
import controllers.*;

/**
 * @author Tyler McVeigh
 */
public class ReferenceController {
	public IReferenceModel reference;
	
	public IReferenceView view;
	
	private int noteCommand;
	
	private int ideaCommand;
	
	private int argumentCommand;

	private int menuCommand;

	ArgumentController arg;
	
	IdeaController idea;

	NoteController note;
	
	/** Cameron C.
	 *
	 * @param choice
	 */
	public void refSelection(int choice) {
		if(subList == 0) {
			if(choice == -1) {
				IdeaController idea = new IdeaController();
				ideaCommand = idea.menuSelection();
				idea.ideaSelection(ideaCommand);
		}
		else if(subList == 1) {
			if(choice == -1) {
				NoteController note = new NoteController();
				noteCommand = note.menuSelection();
				note.noteSelection(noteCommand);
			}
		}
		else if(subList == 2) {
			if (choice == -1) {
				ArgumentController arg = new ArgumentController();
				argumentCommand = arg.menuSelection();
				arg.argSelection(argumentCommand);
			}
		else if(choice == 7) { 
			System.exit(1);
		}
	}
	
	/** CameronC: this will call the topic menu*/
	public int menuSelection() {
		IReferenceMenu refMenu = IReferenceMenu.getMenu(IReferenceMenu.MENU_TYPE_CLI);
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
	
	public ReferenceController() {
		this.reference = null;
		this.view = null;
		this.idea = null;
		this.note = null;
		this.arg = null;
	}
	
	public ReferenceController(IReferenceModel reference, IReferenceView view) {
		this.reference = reference;
		this.view = view;
		
	}
	
	public IReferenceModel createReference(List<String> authors, String sourceTitle, 
										   String publicationDate, IThemeModel owner) {
		IReferenceModel newReference = new ReferenceModel(authors,sourceTitle,publicationDate,owner);
		return newReference;
	}
	
	public void createReferenceView() {
		this.view.getData();
	}
}
