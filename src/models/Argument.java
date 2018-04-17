package models;

import models.interfaces.IF_Argument;
import java.util.ArrayList;

import models.Reference;

/**
 * @author Nick
 * @version 4/17/18
 */
public class Argument implements IF_Argument {
    
    /**The rating of the argument.*/
    private ArgumentRating rating;
    
    /**The title of the argument.*/
    private String title;
    
    /**The statement of the argument.*/
    private String statement;
    
    /**A list of references the argument is associated with.*/
    private ArrayList<Reference> references;

    //Constructors#############################################################
    
    /**
     * The default constructor.
     * 
     * @param rating The rating of the argument.
     * @param title The title of the argument.
     * @param statement The statement of the argument.
     * @param references A list of references the argument is associated with.
     */
    public Argument(ArgumentRating rating, String title, String statement, ArrayList<Reference> references) {
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
    public Argument(ArgumentRating rating, String title, String statement) {
        this(rating, title, statement, new ArrayList<Reference>());
    }
    
    /**
     * The constructor without the rating.
     * 
     * @param title The title of the argument.
     * @param statement The statement of the argument.
     */
    public Argument(String title, String statement) {
        this(null, title, statement);
    }

    //Getters and Setters######################################################
    
    /**
     * @return the rating
     */
    public ArgumentRating getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(ArgumentRating rating) {
        this.rating = rating;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the statement
     */
    public String getStatement() {
        return statement;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * @return the references
     */
    public ArrayList<Reference> getReferences() {
        return references;
    }
    
    
    //Methods##################################################################
    
    /**
     * Tries to associate a reference.
     * 
     * @param ref The reference.
     * @return Whether or not the add was successful.
     */
    public boolean addReference(Reference ref) {
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
    public boolean removeReference(Reference ref) {
        if(!references.contains(ref))
            return false;
        
        references.remove(ref);
        return true;
    }

    @Override
    public void set(ArgumentRating rating, String title, String statement) {
        this.rating = rating;
        this.title = title;
        this.statement = statement;
    }
    
}
























