package models;

/**
 * This class models the Note entities.
 * 
 * @author Nick
 * @version 3/25/18
 */
public class NoteModel {
    
    /**The title of the Note.*/
    protected String title;
    /**The description of the Note.*/
    protected String description;
    /**The Reference to which this Note is attached.*/
    private ReferenceModel reference;
    
    //Constructors#############################################################
    
    /**
     * The default constructor for the Note object.
     * 
     * @param title The title of the Note.
     * @param description The description of the Note.
     * @param reference The Reference to which this Note is attached.
     */
    public NoteModel(String title, String description, ReferenceModel reference) {
        this.title = title;
        this.description = description;
        this.reference = reference;
    }
    
    /**
     * The constructor for a Note object with no reference specified.
     * 
     * @param title The title of the Note.
     * @param description The description of the Note.
     */
    public NoteModel(String title, String description) {
        this(title, description, null);
    }
    
    //Getters and Setters######################################################
    
    /**
     * Returns the description.
     * 
     * @return The description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the title.
     * 
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param title The title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the reference.
     * 
     * @return The reference.
     */
    public ReferenceModel getReference() {
        return reference;
    }

    /**
     * Sets the reference.
     * 
     * @param reference The reference to set.
     */
    public void setReference(ReferenceModel reference) {
        this.reference = reference;
    }

    //Methods##################################################################
    
    @Override
    public String toString() {
        return title + "\n" + description;
    }
    
}
