package interfaces;

import models.ArgumentRatingModel;

public interface IArgumentModel {
    /**
     * Sets the fields of the object.
     * 
     * @param rating The new rating.
     * @param title The new title.
     * @param statement The new statement.
     */
    public void set(ArgumentRatingModel rating, String title, String statement);
}
