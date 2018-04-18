package models;

import java.util.ArrayList;
import java.util.List;
import models.interfaces.IArgumentModel;

public class ArgumentModel implements IArgumentModel {
	
	private List<ArgumentRatingModel> assocReferences;
	
	private String title;
	
	private String description;
	
	public ArgumentModel(List<ArgumentRatingModel> assocReferences, String title, String description) {
		this.assocReferences = assocReferences;
		this.title = title;
		this.description = description;
	}
	
	public ArgumentModel(ArgumentRatingModel assocReference, String title, String description) {
		this.assocReferences = new ArrayList<ArgumentRatingModel>();
		this.assocReferences.add(assocReference);
		this.title = title;
		this.description = description;
	}
	
	

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Adds a reference to the list of associated references
	 * 
	 * @param reference the reference to be added
	 */
	@Override
	public void addReference(ArgumentRatingModel reference) {
		this.assocReferences.add(reference);
	}
	
	/**
	 * Removes a reference from the list of associated references
	 * 
	 * @param reference the reference to be removed
	 */
	@Override
	public void removeReference(ArgumentRatingModel reference) {
		this.assocReferences.remove(reference);
	}
	
	/**
	 * The new title and description to be placed in
	 * 
	 * @param title the title to be set
	 * @param description the description to be set
	 */
	@Override
	public void set(String title, String description) {
		this.setTitle(title);
		this.setDescription(description);
	}

	@Override
	public List<ArgumentRatingModel> getReferenceList() {
		return this.assocReferences;
	}
}
