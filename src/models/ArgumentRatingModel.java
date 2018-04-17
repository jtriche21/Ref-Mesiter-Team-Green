package models;

import models.interfaces.IArgumentModel;
import models.interfaces.IReferenceModel;

public class ArgumentRatingModel {


	private IArgumentModel argument;
	
	private IReferenceModel reference;
	
	private int rating;
	
	public ArgumentRatingModel(IArgumentModel argument, IReferenceModel reference, int rating) {
		
		this.argument = argument;
		this.reference = reference;
		this.rating = rating;
		
	}
	
		
	/**
	 * @return the argument
	 */
	public IArgumentModel getArgument() {
		return argument;
	}

	/**
	 * @param argument the argument to set
	 */
	public void setArgument(IArgumentModel argument) {
		this.argument = argument;
	}

	/**
	 * @return the reference
	 */
	public IReferenceModel getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(IReferenceModel reference) {
		this.reference = reference;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
