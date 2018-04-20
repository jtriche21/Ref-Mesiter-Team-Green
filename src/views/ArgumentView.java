package views;

import java.util.Scanner;

import interfaces.IArgumentModel;
import interfaces.IArgumentView;
import models.ArgumentRatingModel;

public class ArgumentView implements IArgumentView {

    /**The Argument object.*/
    private IArgumentModel arg;
    /**The Scanner object to get input.*/
    private Scanner scanIn;
    
    /**
     * The default constructor.
     * 
     * @param arg
     */
    public ArgumentView(IArgumentModel arg) {
        this.arg = arg;
        scanIn = new Scanner(System.in);
    }
    
    /**
     * Gets user input and sets the arguments fields.
     */
    @Override
    public void getInputArgument() {
        ArgumentRatingModel rating = null;
        
        System.out.println("Argument Title: ");
        String title = scanIn.nextLine();
        
        System.out.println("Argument Statement: ");
        String statement = scanIn.nextLine();
        
        int i = -1;
        for(boolean done = false; done; ) {
            System.out.println("Argument Rating (0 = Strongly Disagree -> 4 = Strongly Agree): ");
            i = scanIn.nextInt();
            switch(i) {
                case 0: 
                    rating = ArgumentRatingModel.ZERO;
                    done = true;
                    break;
                case 1: 
                    rating = ArgumentRatingModel.ONE;
                    done = true;
                    break;
                case 2:
                    rating = ArgumentRatingModel.TWO;
                    done = true;
                    break;
                case 3:
                    rating = ArgumentRatingModel.THREE;
                    done = true;
                    break;
                case 4:
                    rating = ArgumentRatingModel.FOUR;
                    done = true;
                    break;
            }
        }
        
        arg.set(rating, title, statement);
    }

    /**
     * Returns the argument object.
     * 
     * @return The argument object.
     */
    @Override
    public IArgumentModel getData() {
        return arg;
    }

    /**
     * Sets the argument object.
     * 
     * @param arg The new argument.
     */
    @Override
    public void setData(IArgumentModel arg) {
        this.arg = arg;
        
    }
}
