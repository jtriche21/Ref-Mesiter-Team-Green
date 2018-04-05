import java.util.ArrayList;

/**
 * A view class for the viewing and printing of Note objects.
 * 
 * @author Nick Ruby
 * @version 3/25/18
 */
public class NoteView {
    
    /**
     * Prints out one Note.
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
}
