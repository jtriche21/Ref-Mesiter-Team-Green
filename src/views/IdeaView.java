package views;

import java.util.Scanner;

import interfaces.IIdeaModel;
import interfaces.IIdeaView;

public class IdeaView implements IIdeaView {

	/** The Idea model associated with this view*/
	private IIdeaModel idea;
	/** The Idea title */
	private String ideaTitle;
	/** The idea Description */
	private String ideaDescription;
	/** Scanner to bring in user input*/
	private Scanner kb;
	
	/**
	 * Constructor for the IdeaView
	 * 
	 * @param idea the idea to be associated with this view
	 */
	public IdeaView(IIdeaModel idea) {
		this.idea = idea;
		this.kb = new Scanner(System.in);
	}
	

	/**
	 * Gets the user input for setting the Idea
	 * 
	 */
	@Override	
	public void getInputIdea() {
		
		System.out.print("Idea Title: ");
		this.ideaTitle = kb.nextLine();
		
		System.out.print("Idea Description");
		this.ideaDescription = kb.nextLine();
		
		this.idea.set(this.ideaTitle, this.ideaDescription);
		
	}

	
	/**
	 * Gives the associated idea
	 * 
	 * @return the idea this view is associated with
	 */
	@Override
	public IIdeaModel getData() {
		return this.idea;
	}

	/**
	 * Associates a new ideaModel with this view
	 * 
	 * @param newIdea the new IdeaModel this view is to be associated with
	 */
	@Override
	public void setData(IIdeaModel newIdea) {
		this.idea = newIdea;
	}
	
	/**
	 * Prints the idea to the console
	 */
	@Override
	public void printIdea() {
		System.out.println(this.idea);
	}
}
