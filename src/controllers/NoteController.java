package controllers;

import java.util.ArrayList;
import models.Note;
import models.Reference;
import views.cli.NoteView;

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
    private ArrayList<Note> noteList;
    /**The NoteView object.*/
    private NoteView noteView;
    
    //Constructors#############################################################
    
    public NoteController() {
        noteList = new ArrayList<Note>();
        noteView = new NoteView();
    }
    
    //Methods##################################################################
    
    /**
     * Checks for valid title, then creates the Note and adds it to noteList 
     * and the Reference.
     * 
     * @param title The title of the Note.
     * @param description The description of the Note.
     * @param ref The Reference to which this Note is attached.
     * @return False if adding the note fails; True otherwise.
     */
    public boolean addNote(String title, String description, Reference ref) {
        //If the title is empty.
        if(title.equals("")) {
            //TODO Notify user of error.
            return false;
        }
        
        //Checks the Reference for duplicate Note titles.
        /*if(false) { //TODO Check Reference for duplicate Note title.
            return false; //TODO Notify user of error.
        }*/
        
        Note newNote = new Note(title, description, ref);
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
    public boolean deleteNote(Note note) {
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
    public boolean editNote(Note note, String title, String description) {
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
    public boolean viewNote(Note note) {
        //Checks for the note in noteList.
        if(!noteList.contains(note)) {
            //TODO Notify user of error.
            return false;
        }
        
        noteView.printNote(note);
        
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
        
        noteView.printNotes(noteList);
        
        return true;
    }
}

















