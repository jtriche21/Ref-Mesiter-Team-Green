package controllers;

import java.util.ArrayList;
import models.*;
import views.*;
import interfaces.*;
import controllers.*;

/**
 * A controller for the Note class. Stores a list of Notes so we can add,
 * delete, edit, and view the Notes. Uses the NoteView class for viewing
 * all Notes or a single Note.
 * 
 * @author Nick
 * @version 3/25/18
 */
public class NoteController {
    
    /**A list of all Note objects.*/
    private ArrayList<NoteModel> noteList;
    /**The NoteView object.*/
    private INoteView noteView;
    
    private int menuCommand;
    
    public void noteSelection(int choice) {
    	if (choice == 1) { 
    		//edit
    	}
    	else if(choice == 2) {
    		//delete
    	}
    	else if(choice == 3) {
    		System.exit(1);
    	}
    }
    
    public int menuSelection() {
    	INoteMenu noteMenu = INoteMenu.getMenu(INoteMenu.MENU_TYPE_CLI);
    	menuCommand = noteMenu.getChoice();
    	
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
    
    //Constructors#############################################################
    
    /**
     * The default constructor.
     */
    public NoteController() {
        noteList = new ArrayList<NoteModel>();
        noteView = new NoteView(null);
    }
    
    //Methods##################################################################
    
    /**
     * Adds a Note from user input.
     * 
     * @return Whether or not the add was successful
     */
    public boolean addNote() {
        NoteModel note = new NoteModel();
        
        noteView.setData(note);
        noteView.getInputNote();
        note = (NoteModel) noteView.getData();
        
        if(note.getTitle().equals(""))
            return false;
        
        noteList.add(note);
        return true;
    }
    
    /**
     * Checks for valid title, then creates the Note and adds it to noteList 
     * and the Reference.
     * 
     * @param title The title of the Note.
     * @param description The description of the Note.
     * @param ref The Reference to which this Note is attached.
     * @return False if adding the note fails; True otherwise.
     */
    public boolean addNote(String title, String description, ReferenceModel ref) {
        //If the title is empty.
        if(title.equals("")) {
            //TODO Notify user of error.
            return false;
        }
        
        //Checks the Reference for duplicate Note titles.
        /*if(false) { //TODO Check Reference for duplicate Note title.
            return false; //TODO Notify user of error.
        }*/
        
        NoteModel newNote = new NoteModel(title, description, ref);
        noteList.add(newNote);
        //TODO Add newNote to Reference.
        
        return true;
    }
    
    /**
     * Checks for valid Note, then removes it from the Reference and noteList.
     * 
     * @param note The note to be deleted.
     * @return False if removing the note fails; True otherwise.
     */
    public boolean deleteNote(NoteModel note) {
        //Checks for the note in noteList.
        if(!noteList.contains(note)) {
            //TODO Notify user of error.
            return false;
        }
        
        //TODO Delete note from Reference.
        noteList.remove(note);
        
        return true;
    }
    
    /**
     * Checks for valid Note, then edits the title and/or the description of 
     * the Note.
     * 
     * @param note The note to edit.
     * @param title Either empty or the new title.
     * @param description Either empty or the new description.
     * @return False if editing the note fails; True otherwise.
     */
    public boolean editNote(NoteModel note, String title, String description) {
        //Checks for the note in noteList.
        if(!noteList.contains(note)) {
            //TODO Notify user of error.
            return false;
        }
        
        //If not empty, set the new title.
        if(!title.equals("")) {
            note.setTitle(title);
        }
        
        //If not empty set the new description.
        if(!description.equals("")) {
            note.setDescription(description);
        }
        
        return true;
    }
    
    /**
     * Checks for valid Note, then calls noteView to view the Note.
     * 
     * @param note The note to view.
     * @return False if viewing the note fails; True otherwise.
     */
    public boolean viewNote(NoteModel note) {
        //Checks for the note in noteList.
        if(!noteList.contains(note)) {
            //TODO Notify user of error.
            return false;
        }
        
        //noteView.printNote(note);
        
        return true;
    }
    
    /**
     * Checks if noteList is not empty, then calls noteView to print all notes.
     * 
     * @return False if viewing the notes fails; True otherwise.
     */
    public boolean viewNotes() {
        //Checks if noteList is empty.
        if(noteList.size() == 0) {
          //TODO Notify user of error.
            return false;
        }
        
        //noteView.printNotes(noteList);
        
        return true;
    }
}

















