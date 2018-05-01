package controllers;

import java.util.ArrayList;
import interfaces.*;
import models.*;
import views.*;
import controllers.*;


/**
 * A controller for the Argument class.
 * 
 * @author Nick
 * @version 4/20/18
 */
public class ArgumentController {
    
    /**List of all arguments.*/
    private ArrayList<ArgumentModel> arguments;
    /**Reference to the view object.*/
    private IArgumentView view;
    
    private int menuCommand;
    
    public int menuSelection() {
    	IArgumentMenu argMenu = IArgumentMenu.getMenu(IArgumentMenu.MENU_TYPE_CLI);
    	menuCommand = argMenu.getChoice();
    	
    	if(menuCommand == 1) {
			return menuCommand;
		}
		else if(menuCommand == 2) {
			return menuCommand;
		}
		else if(menuCommand == 3) {
			return menuCommand;
		}
		return 0;
    }
    
    
    /**
     * The default constructor.
     */
    public ArgumentController() {
        arguments = new ArrayList<ArgumentModel>();
        view = new ArgumentView(null);
    }
    
    /**
     * Adds an argument from user input.
     * 
     * @return The new argument.
     */
    public ArgumentModel addArgument() {
        ArgumentModel arg = new ArgumentModel();
        view.setData(arg);
        view.getInputArgument();
        arg = (ArgumentModel) view.getData();
        
        for(ArgumentModel current : arguments) {
            if(current.getTitle().equals(arg.getTitle()))
                return null;
        }
        
        arguments.add(arg);
        return arg;
    }
    
    /**
     * Builds then adds an argument with all fields except reference.
     * 
     * @param rating The new rating.
     * @param title The new title.
     * @param statement the new statement.
     * @return The new argument.
     */
    public ArgumentModel addArgument(ArgumentRatingModel rating, String title, String statement) {
        for(ArgumentModel current : arguments) {
            if(current.getTitle().equals(title))
                return null;
        }
        
        ArgumentModel arg = new ArgumentModel(rating, title, statement);
        arguments.add(arg);
        
        return arg;
    }

    /**
     * Builds then adds an argument with all fields and adds a reference.
     * 
     * @param rating The new rating.
     * @param title The new title.
     * @param statement the new statement.
     * @param reference The reference to associate.
     * @return The new argument.
     */
    public ArgumentModel addArgument(ArgumentRatingModel rating, String title, String statement, ReferenceModel reference) {
        ArgumentModel arg = addArgument(rating, title, statement);
        
        if(arg == null)
            return null;
        
        if(!arg.addReference(reference)) 
            return null;
        
        return arg;
    }
    
    /**
     * Deletes an argument.
     * 
     * @param arg The argument.
     * @return Whether or not the delete was successful.
     */
    public boolean deleteArgument(ArgumentModel arg) {
        if(!arguments.contains(arg))
            return false;
        
        arguments.remove(arg);
        return true;
    }
    
    /**
     * Updates the rating of an argument.
     * 
     * @param arg The argument.
     * @param rating The new rating.
     * @return Whether or not the update was successful.
     */
    public boolean updateRating(ArgumentModel arg, ArgumentRatingModel rating) {
        if(!arguments.contains(arg)) 
            return false;
        
        arg.setRating(rating);
        return true;
    }
    
    
    /**
     * Edits the fields of an argument.
     * 
     * @param arg The argument.
     * @param rating The new rating.
     * @param title The new title.
     * @param statement the new statement.
     * @return Whether or not the edit was successful.
     */
    public boolean editArgument(ArgumentModel arg, ArgumentRatingModel rating, String title, String statement) {
        if(!arguments.contains(arg)) 
            return false;
        
        if(rating != null)
            arg.setRating(rating);
        
        if(title != null)
            arg.setTitle(title);
        
        if(statement != null)
            arg.setStatement(statement);
        
        return true;
    }
    
    /**
     * Associates a reference with an argument.
     * 
     * @param arg The argument.
     * @param ref The new reference to associate.
     * @return Whether or not the associate was successful.
     */
    public boolean associateReference(ArgumentModel arg, ReferenceModel ref) {
        if(!arguments.contains(arg)) 
            return false;
        
        if(!arg.addReference(ref))
            return false;
        
        return true;
    }
    
    /**
     * Disassociates a reference with an argument.
     * @param arg The argument.
     * @param ref The reference to disassociate.
     * @return Whether or not the disassociate was successful.
     */
    public boolean disassociateReference(ArgumentModel arg, ReferenceModel ref) {
        if(!arguments.contains(arg)) 
            return false;
        
        if(!arg.removeReference(ref))
            return false;
        
        return true;
    }
}