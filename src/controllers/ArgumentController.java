package controllers;

import java.util.ArrayList;

import models.Reference;
import models.Argument;
import models.ArgumentRating;
import views.IF_ArgumentView;
import views.cli.ArgumentView;

/**
 * @author Nick
 *
 */
public class ArgumentController {
    
    private ArrayList<Argument> arguments;
    
    private IF_ArgumentView view;
    
    public ArgumentController() {
        arguments = new ArrayList<Argument>();
        view = new ArgumentView();
    }
    
    public Argument addArgument(ArgumentRating rating, String title, String statement) {
        for(Argument current : arguments) {
            if(current.getTitle().equals(title))
                return null;
        }
        
        Argument arg = new Argument(rating, title, statement);
        arguments.add(arg);
        
        return arg;
    }

    public Argument addArgument(ArgumentRating rating, String title, String statement, Reference reference) {
        Argument arg = addArgument(rating, title, statement);
        
        if(arg == null)
            return null;
        
        if(!arg.addReference(reference)) 
            return null;
        
        return arg;
    }
    
    public boolean deleteArgument(Argument arg) {
        if(!arguments.contains(arg))
            return false;
        
        arguments.remove(arg);
        return true;
    }
    
    public boolean updateRating(Argument arg, ArgumentRating rating) {
        if(!arguments.contains(arg)) 
            return false;
        
        arg.setRating(rating);
        return true;
    }
    
    
    public boolean editArgument(Argument arg, ArgumentRating rating, String title, String statement) {
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
    
    public boolean associateReference(Argument arg, Reference ref) {
        if(!arguments.contains(arg)) 
            return false;
        
        if(!arg.addReference(ref))
            return false;
        
        return true;
    }
    
    public boolean disassociateReference(Argument arg, Reference ref) {
        if(!arguments.contains(arg)) 
            return false;
        
        if(!arg.removeReference(ref))
            return false;
        
        return true;
    }
}