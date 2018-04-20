package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.NoteController;
import interfaces.INoteModel;
import interfaces.INoteView;
import models.NoteModel;

/**
 * A view class for the viewing and printing of Note objects.
 * 
 * @author Nick Ruby
 * @version 4/18/18
 */
public class NoteView implements INoteView{
    
    /**The note object.*/
    private INoteModel note;
    /**The scanner object to get user input.*/
    private Scanner scanIn;
    
    /**
     * The default constructor.
     * 
     * @param note The new note object.
     */
    public NoteView(INoteModel note) {
        this.note = note;
        scanIn = new Scanner(System.in);
    }
    
    /**
     * Prints out a certain Note.
     * 
     * @param note The note to print.
     */
    public void printNote(NoteModel note) {
        System.out.println(note.toString());
    }
    
    /**
     * Prints out all of the notes.
     * 
     * @param noteList The ArrayList of all notes to print.
     */
    public void printNotes(ArrayList<NoteModel> noteList) {
        String printString = "";
        
        //Adds the title of each note to printString.
        for(NoteModel note : noteList) {
            //Adds a newline to each line except the last.
            if(noteList.indexOf(note) != noteList.size() - 1)
                printString += note.getTitle() + "\n";
            else
                printString += note.getTitle();
        }
        
        System.out.println(printString);
    }

    /**
     * Gets user input and set the notes fields.
     */
    @Override
    public void getInputNote() {
        System.out.println("Note Title: ");
        String title = scanIn.nextLine();
        
        System.out.println("Note Description: ");
        String description = scanIn.nextLine();
        
        note.set(title, description);
    }

    /**
     * Returns the note object.
     * 
     * @return The note object.
     */
    @Override
    public INoteModel getData() {
        return note;
    }

    /**
     * Sets the note object.
     * 
     * @param note The new note object.
     */
    @Override
    public void setData(INoteModel note) {
        this.note = note;
    }
}
