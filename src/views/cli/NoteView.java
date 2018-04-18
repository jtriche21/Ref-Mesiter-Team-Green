package views.cli;

import java.util.ArrayList;
import java.util.Scanner;

import views.IF_NoteView;
import controllers.NoteController;
import models.Note;
import models.interfaces.IF_Note;

//TODO Use controller instead of model

/**
 * A view class for the viewing and printing of Note objects.
 * 
 * @author Nick Ruby
 * @version 4/18/18
 */
public class NoteView implements IF_NoteView{
    
    private IF_Note note;
    
    private Scanner scanIn;
    
    public NoteView(IF_Note note) {
        this.note = note;
        scanIn = new Scanner(System.in);
    }
    
    /**
     * Prints out a certain Note.
     * 
     * @param note The note to print.
     */
    public void printNote(Note note) {
        System.out.println(note.toString());
    }
    
    /**
     * Prints out all of the notes.
     * 
     * @param noteList The ArrayList of all notes to print.
     */
    public void printNotes(ArrayList<Note> noteList) {
        String printString = "";
        
        //Adds the title of each note to printString.
        for(Note note : noteList) {
            //Adds a newline to each line except the last.
            if(noteList.indexOf(note) != noteList.size() - 1)
                printString += note.getTitle() + "\n";
            else
                printString += note.getTitle();
        }
        
        System.out.println(printString);
    }

    @Override
    public void getInputArgument() {
        System.out.println("Note Title: ");
        String title = scanIn.nextLine();
        
        System.out.println("Note Description: ");
        String description = scanIn.nextLine();
        
        note.set(title, description);
    }

    @Override
    public IF_Note getData() {
        return note;
    }

    @Override
    public void setData(IF_Note note) {
        this.note = note;
    }
}
