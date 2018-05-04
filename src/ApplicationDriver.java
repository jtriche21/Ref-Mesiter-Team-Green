import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * @author Nick
 *
 */
public class ApplicationDriver extends Application {
    
    private static ApplicationDriver instance;
    
    private Stage primaryStage;
    
    private ApplicationDriver(String args[]) {
        launch(args);
    }
    
    public static ApplicationDriver getInstance(String args[]) {
        if(instance == null) {
            instance = new ApplicationDriver(args);
        }
        
        return instance;
    }
    
    public static ApplicationDriver getInstance() {
        return instance;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Ref-Meister");        
    }
    
    public Stage getStage() {
        return primaryStage;
    }
}
