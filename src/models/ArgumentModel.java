package models;

import java.util.ArrayList;

import interfaces.IArgumentModel;

/**
 * This class models an argument.
 * 
 * @author Nick
 * @version 4/17/18
 */
public class ArgumentModel implements IArgumentModel {
    
    /**The rating of the argument.*/
    private ArgumentRatingModel rating;
    
    /**The title of the argument.*/
    private String title;
    
    /**The statement of the argument.*/
    private String statement;
    
    /**A list of references the argument is associated with.*/
    private ArrayList<ReferenceModel> references;

    //Constructors#############################################################
    
    /**
     * The default constructor.
     * 
     * @param rating The rating of the argument.
     * @param title The title of the argument.
     * @param statement The statement of the argument.
     * @param references A list of references the argument is associated with.
     */
    public ArgumentModel(ArgumentRatingModel rating, String title, String statement, ArrayList<ReferenceModel> references) {
        set(rating, title, statement);
        this.references = references;
    }
    
    /**
     * The constructor that initializes references.
     * 
     * @param rating The rating of the argument.
     * @param title The title of the argument.
     * @param statement The statement of the argument.
     */
    public ArgumentModel(ArgumentRatingModel rating, String title, String statement) {
        this(rating, title, statement, new ArrayList<ReferenceModel>());
    }
    
    /**
     * The constructor without the rating.
     * 
     * @param title The title of the argument.
     * @param statement The statement of the argument.
     */
    public ArgumentModel(String title, String statement) {
        this(null, title, statement);
    }
    
    /**
     * The constructor to create an empty Argument.
     */
    public ArgumentModel() {
        this.rating = null;
        this.title = null;
        this.statement = null;
        references = new ArrayList<ReferenceModel>();
    }

    //Getters and Setters######################################################
    
    /**
     * Returns the rating.
     * @return the rating
     */
    public ArgumentRatingModel getRating() {
        return rating;
    }

    /**
     * Sets the rating.
     * @param rating the rating to set
     */
    public void setRating(ArgumentRatingModel rating) {
        this.rating = rating;
    }

    /**
     * Returns the title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the statement.
     * @return the statement
     */
    public String getStatement() {
        return statement;
    }

    /**
     * Sets the statement.
     * @param statement the statement to set
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * Returns the list of references.
     * @return the references
     */
    public ArrayList<ReferenceModel> getReferences() {
        return references;
    }
    
    
    //Methods##################################################################
    
    /**
     * Tries to associate a reference.
     * 
     * @param ref The reference.
     * @return Whether or not the add was successful.
     */
    public boolean addReference(ReferenceModel ref) {
        if(references.contains(ref))
            return false;
        
        references.add(ref);
        return true;
    }
    
    /**
     * Tries to dissociate a reference.
     * 
     * @param ref The reference.
     * @return Whether or not the remove was successful.
     */
    public boolean removeReference(ReferenceModel ref) {
        if(!references.contains(ref))
            return false;
        
        references.remove(ref);
        return true;
    }

    /**
     * Sets the fields of the object.
     * 
     * @param rating The new rating.
     * @param title The new title.
     * @param statement The new statement.
     */
    @Override
    public void set(ArgumentRatingModel rating, String title, String statement) {
        this.rating = rating;
        this.title = title;
        this.statement = statement;
    }
    
    /**
     * Builds the string version of the object.
     */
    @Override
    public String toString() {
        return "Title: " + title + "\nStatement: " + statement;
    }
    
}
