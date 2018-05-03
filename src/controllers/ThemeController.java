package controllers;

import java.util.List;
import views.*;
import controllers.*;
import models.*;
import interfaces.*;
/**
 * 
 * @author Cameron Cagle & Jeremy Triche
 *
 */
public class ThemeController {
	ThemeModel model;
	ThemeView view;
	ReferenceController  ref;
	private int menuCommand;
	private int refCommand;
	
	/** Cameron C.*/
	public void themeSelection(int choice) {
		if(choice == 1) {
			ReferenceController ref = new ReferenceController();
			refCommand = ref.menuSelection();
			ref.refSelection(refCommand);
		}
		else if (choice == 2) {
			//view theme
		}
		else if(choice  == 3) {
			System.exit(1);
		}
	}
	
	/** Cameron C. */
	public int menuSelection() {
		IThemeMenu themeMenu = IThemeMenu.getMenu(IThemeMenu.MENU_TYPE_CLI);
		menuCommand = themeMenu.getChoice();
		if(menuCommand == 1)
			return menuCommand;
		else if(menuCommand == 2)
			return menuCommand;
		else 
			return 0;
	}
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
	public ITopicModel getThemeOwner() {
		return model.getOwner();
	}
	public void setThemeOwner(ITopicModel owner) {
		model.setOwner(owner);
	}
	public List<IReferenceModel> getThemeReferenceList() {
		return model.getReferenceList();
	}
	public void setThemeReferenceList(List<IReferenceModel> referenceList) {
		model.setReferenceList(referenceList);
	}
	public void printThemeInformation() {
		view.printThemeInformation(model.getDescription(), model.getTitle(), model.getOwner(), 
										model.getOwner(), model.getReferenceList());
	}
}
