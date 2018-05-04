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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author Nick
 *
 */
public class GUIInput implements IGUIInput {

    protected BorderPane root;
    protected Button accept;
    protected TextField inputTitle, inputDescription;
    protected HBox top, bottom;
    protected VBox center;
    
    protected IControllerListenerTypeA listener;
    
    public GUIInput(IControllerListenerTypeA listener) {
        this.listener = listener;
        
        root = new BorderPane();
        top = new HBox();
        center = new VBox();
        bottom = new HBox();
        
        root.setTop(top);
        root.setCenter(center);
        root.setBottom(bottom);
        
        top.setAlignment(Pos.CENTER);
        top.setSpacing(20);
        Label titleLab = new Label("Edit");
        top.getChildren().add(titleLab);
        
        bottom.setAlignment(Pos.CENTER);
        bottom.setSpacing(20);
        accept = new Button("Accept");
        accept.setOnAction(buttonHandler);
        bottom.getChildren().add(accept);
        
        center.setAlignment(Pos.CENTER);
        center.setSpacing(20);
        inputTitle = fieldHelper("Title:", center);
        inputDescription = fieldHelper("Description:", center);
    }
    
    /**
     * A helper method for building text fields with a title.
     * @param title The title of the label to go above the text field.
     * @param root The panel on to which to put the label and text field.
     * @return The text field.
     */
    private TextField fieldHelper(String title, Pane root) {    
        Label lab = new Label(title);//add text field
        //lab.getStyleClass().add("fieldTitle");
        root.getChildren().add(lab); 
        
        TextField tf = new TextField();//add text field
        //tf.getStyleClass().add("textField1");
        tf.setEditable(true);
        root.getChildren().add(tf);

        return tf;
    }
    
    EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
        
        @Override
        public void handle(ActionEvent arg0) {
            String info = "";
            if(arg0.getSource() == accept) {
                info = inputTitle.getText() + ";" + inputDescription.getText();
                listener.inputNotifyInfo(info);
            }
        }
    };
    
    @Override
    public Pane getRoot() {
        return root;
    }

}























