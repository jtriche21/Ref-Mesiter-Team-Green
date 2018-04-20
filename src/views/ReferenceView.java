package views;

import java.util.Scanner;
import interfaces.IReferenceModel;
import interfaces.IReferenceView;

public class ReferenceView implements IReferenceView {
	//TODO Write Documentation
	
	/**	 */
	private IReferenceModel reference;
	
	private Scanner kb = new Scanner(System.in);
	
	public ReferenceView(IReferenceModel reference) {
		this.reference = reference;
	}
	
	@Override
	/**
	 * 	 
	 */
	public void getInputReference() {
		
		System.out.print("Reference Source Title: ");
		String title = kb.nextLine();
		
		System.out.print("\nReference Author: ");
		String author = kb.nextLine();
		
		System.out.print("\nReference Publication Date: ");
		String date = kb.nextLine();
		
		System.out.print("\nReference Publisher: ");
		String publisher = kb.nextLine();
		
		System.out.print("\nReference Version");
		String version = kb.nextLine();
		
		System.out.print("\nReference Volume Number: ");
		String volumeNumber = kb.nextLine();
		
		System.out.print("\nReference Container Title");
		String containerTitle = kb.nextLine();
		
		System.out.print("\nReference Location: ");
		String location = kb.nextLine();
		
		this.reference.set(title, author, date, publisher, version, volumeNumber, 
						   containerTitle, location);
	}

	@Override
	/**	
	 * 
	 */
	public IReferenceModel getData() {
		return this.reference;
	}

	@Override
	/**
	 * 
	 */
	public void setData(IReferenceModel newReference) {
		this.reference = newReference;
		
	}

}
