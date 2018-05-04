/**
 * 
 */
package views;

import controllers.IControllerListenerTypeA;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author Nick
 *
 */
public class GUIMain implements IGUIMain {
    
    protected BorderPane root;
    protected Button create, load, exit;
    protected HBox top;
    protected VBox center;
    
    protected IControllerListenerTypeA listener;

    public GUIMain(IControllerListenerTypeA listener) {
        this.listener = listener;
        
        root = new BorderPane();
        top = new HBox();
        center = new VBox();
        
        root.setTop(top);
        root.setCenter(center);
        
        top.setAlignment(Pos.CENTER);
        top.setSpacing(20);
        Label titleLab = new Label("Ref Meister");
        top.getChildren().add(titleLab);
        
        center.setAlignment(Pos.CENTER);
        center.setSpacing(20);
        create = buttonHelper(null, null, "Create Library", center);
        load = buttonHelper(null, null, "Load Library", center);
        exit = buttonHelper(null, null, "Exit Ref-Meister", center);
    }
    
    protected Button buttonHelper(String class1, String class2, 
            String text, Pane root) {

        Button b= new Button(text); 
        //b.getStyleClass().add(class1);
        //b.getStyleClass().add(class2);
        b.setOnAction(buttonHandler);
        root.getChildren().add(b); 
        
        return b;   
    }

    EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
    
        @Override
        public void handle(ActionEvent arg0) {
            Object o = arg0.getSource();
            
            if(o == create) {
                listener.inputNotify(IControllerListenerTypeA.CREATE);
            } else if(o == load) {
                listener.inputNotify(IControllerListenerTypeA.LOAD);
            } else if(o == exit) {
                listener.inputNotify(IControllerListenerTypeA.EXIT);
            }
        }
    };
    
    public Pane getRoot() {
        return root;
    } 
}











