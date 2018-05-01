package models;



import java.util.ArrayList;
import java.util.List;

import interfaces.IIdeaModel;
import interfaces.IReferenceModel;

/**
 * @author Tyler McVeigh
 * 
 *
 */
public class IdeaModel implements IIdeaModel{
	
	public String title;
	public String description;
	public List<IReferenceModel> references;
	
	/**
	 * The constructor for assigning a list of references to this idea
	 * 
	 * @param reference the list of associated references
	 * @param title the title of the idea object
	 * @param description the description of the idea object
	 */
	public IdeaModel(List<IReferenceModel> references, String title, String description) {
		this.references = references;
		this.title = title;
		this.description = description;
	}
	
	/**
	 * The constructor for assigning a single reference to this idea
	 * 
	 * @param reference the associated reference
	 * @param title the title of the idea object
	 * @param description the description of the idea object
	 */
	public IdeaModel(IReferenceModel reference, String title, String description) {
		this.references = new ArrayList<IReferenceModel>();
		this.references.add(reference);
		this.title = title;
		this.description = description;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * A method that allows the setters to be called quickly
	 * 
	 * @param title the new title
	 * @param description the new description
	 */
	@Override
	public void set(String title, String description) {
		this.setTitle(title);
		this.setDescription(description);
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public  List<IReferenceModel> getAssociatedReferences() {
		return this.references;
	}


	@Override
	public void addReference(IReferenceModel reference) {
		this.references.add(reference);
		
	}

	@Override
	public void removeReference(IReferenceModel reference) {

		this.references.remove(reference);
	}
}
