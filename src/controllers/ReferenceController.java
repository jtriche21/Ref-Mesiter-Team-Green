package controllers;

import java.util.List;

import interfaces.IReferenceModel;
import interfaces.IReferenceView;
import interfaces.IThemeModel;
import models.ReferenceModel;
import models.ThemeModel;

/**
 * @author Tyler McVeigh
 */
public class ReferenceController {
	//TODO Make Reference Controller class
	
	public IReferenceModel reference;
	public IReferenceView view;
	
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
		this.view.createReference();
	}
}
