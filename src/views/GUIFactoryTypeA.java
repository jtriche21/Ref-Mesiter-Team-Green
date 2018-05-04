/**
 * 
 */
package views;

import java.util.ArrayList;

import controllers.IControllerListenerTypeA;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author Nick
 *
 */
public class GUIFactoryTypeA implements IGUIFactory {

    protected String type;
    protected String title;
    protected String description;
    protected ArrayList<String> subItems;
    
    protected BorderPane root;
    protected HBox top, bottom;
    protected VBox center;
    
    protected Button back, main, add, delete, edit, save;
    protected Button[] buttons;
    protected ListView<String> subList;
    
    protected IControllerListenerTypeA listener;
    
    public GUIFactoryTypeA(IControllerListenerTypeA listener, String type, 
            String title, String description, ArrayList<String> subItems) {
        set(type, title, description, subItems);
        this.listener = listener;
        root = new BorderPane();
        
        top = new HBox();
        top.setId("Top");
        bottom = new HBox();
        bottom.setId("Bottom");
        center = new VBox();
        center.setId("Center");
        
        root.setTop(top);
        root.setBottom(bottom);
        root.setCenter(center);
        
        
        makeTop();
        makeBottom();
        makeCenter();
        
        buttons = new Button[] {back, main, add, delete, edit, save};
    }
    
    @Override
    public void set(String type, String title, String description, 
            ArrayList<String> subItems) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.subItems = subItems;
    }
    
    protected void makeTop() {
        top.setAlignment(Pos.CENTER);
        top.setSpacing(20);
        top.getStyleClass().add("Top");
        
        back = delete = buttonHelper("", "", "Back", top);
        
        Label titleLab = new Label(type + ": " + title);
        top.getChildren().add(titleLab);
        
        main = delete = buttonHelper("", "", "Delete", top);
    }
    
    protected void makeBottom() {
        bottom.setAlignment(Pos.CENTER);
        bottom.setSpacing(20);
        
        if(subItems != null) {
            add = buttonHelper("", "", "Add", bottom);
        }
        
        delete = buttonHelper("", "", "Delete", bottom);
        edit = buttonHelper("", "", "Edit", bottom);
        save = buttonHelper("", "", "Save", bottom);
    }
    
    protected void makeCenter() {
        center.setAlignment(Pos.TOP_CENTER);
        center.setSpacing(20);
        
        Label descLab = new Label(description);
        center.getChildren().add(descLab);
        
        center.getChildren().addAll(makeCenterList());
    }
    
    protected ArrayList<Node> makeCenterList() {
        ArrayList<Node> nodeList = new ArrayList<>();
        
        if(subItems != null) {
            ObservableList<String> obsItems = FXCollections.observableArrayList(subItems);
            subList = new ListView<>();
            
            subList.setItems(obsItems);
            
            nodeList.add(subList);
        }
        
        return nodeList;
    }
    
    /**
     * Builds a button with two classes and text.
     * @param class1 The style class
     * @param class2 The size class
     * @param text The button text
     * @param root The container the button goes in
     * @return The button object
     */
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
            
            if(o == back) {
                listener.inputNotify(IControllerListenerTypeA.BACK);
            } else if(o == main) {
                listener.inputNotify(IControllerListenerTypeA.MAIN);
            } else if(o == add) {
                listener.inputNotify(IControllerListenerTypeA.ADD);
            } else if(o == delete) {
                listener.inputNotify(IControllerListenerTypeA.DELETE);
            } else if(o == edit) {
                listener.inputNotify(IControllerListenerTypeA.EDIT);
            } else if(o == save) {
                listener.inputNotify(IControllerListenerTypeA.SAVE);
            }
        }
        
    };
    
    public Pane getRoot() {
        return root;
    }

}



















