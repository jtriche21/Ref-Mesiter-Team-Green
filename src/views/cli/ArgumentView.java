package views.cli;

import java.util.Scanner;

import models.ArgumentRating;
import models.interfaces.IF_Argument;
import views.IF_ArgumentView;

public class ArgumentView implements IF_ArgumentView {

    private IF_Argument arg;
    
    private ArgumentRating rating;
    
    private String title;
    
    private String statement;
    
    private Scanner scanIn;
    
    public ArgumentView(IF_Argument arg) {
        this.arg = arg;
        scanIn = new Scanner(System.in);
    }
    
    @Override
    public void getInputArgument() {
        System.out.println("Argument Title: ");
        title = scanIn.nextLine();
        
        System.out.println("Argument Statement: ");
        statement = scanIn.nextLine();
        
        int i = -1;
        for(boolean done = false; done; ) {
            System.out.println("Argument Rating (0 = Strongly Disagree -> 4 = Strongly Agree): ");
            i = scanIn.nextInt();
            switch(i) {
                case 0: 
                    rating = ArgumentRating.ZERO;
                    done = true;
                    break;
                case 1: 
                    rating = ArgumentRating.ONE;
                    done = true;
                    break;
                case 2:
                    rating = ArgumentRating.TWO;
                    done = true;
                    break;
                case 3:
                    rating = ArgumentRating.THREE;
                    done = true;
                    break;
                case 4:
                    rating = ArgumentRating.FOUR;
                    done = true;
                    break;
            }
        }
        
        arg.set(rating, title, statement);
    }

    @Override
    public IF_Argument getData() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setData(IF_Argument arg) {
        // TODO Auto-generated method stub
        
    }
}
