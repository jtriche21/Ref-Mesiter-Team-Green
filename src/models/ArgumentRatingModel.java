package models;

import interfaces.IArgumentModel;
import interfaces.IReferenceModel;

public enum ArgumentRatingModel {

    ZERO("Strongly Disagree", 0),
    ONE("Disagree", 1),
    TWO("Neutral", 2),
    THREE("Agree", 3),
    FOUR("Strongly Agree", 4);
    
    /**The string representation of the rating.*/
    private String term;
    
    /**The numerical representation (0-4) of the rating.*/
    private int rating;
    
    /**
     * The default constructor.
     * 
     * @param term The string representation of the rating.
     * @param rating The numerical representation (0-4) of the rating.
     */
    private ArgumentRatingModel(String term, int rating) {
        this.term = term;
        this.rating = rating;
    }

    /**
     * Returns the term.
     * 
     * @return the term.
     */
    public String getTerm() {
        return term;
    }

    /**
     * Returns the rating.
     * 
     * @return the rating.
     */
    public int getRating() {
        return rating;
    }
    
    
}

