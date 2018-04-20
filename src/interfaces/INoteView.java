package interfaces;

import interfaces.INoteModel;

public interface INoteView {
    /**
     * Gets user input and set the notes fields.
     */
    public void getInputNote();
    
    /**
     * Returns the note object.
     * 
     * @return The note object.
     */
    public INoteModel getData();
    
    /**
     * Sets the note object.
     * 
     * @param note The new note object.
     */
    public void setData(INoteModel note);
}
