/**
 * 
 */
package views;

import java.io.IOException;
import java.util.ArrayList;

import controllers.IControllerListenerTypeA;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author Nick
 *
 */
public class GUIFactoryTypeB extends GUIFactoryTypeA implements IGUIFactory {
    
    public final static int ARGS = 0;
    public final static int IDEAS = 1;
    public final static int NOTES = 2;
    
    private ArrayList<String> subArgs;
    private ArrayList<String> subIdeas;
    private ArrayList<String> subNotes;
    
    private RadioButton radArgs;
    private RadioButton radIdeas;
    private RadioButton radNotes;
    
    private int currentSubList;
    

    private GUIFactoryTypeB(IControllerListenerTypeA listener, String type, 
            String title, String description, ArrayList<String> subItems) {
        super(listener, type, title, description, subItems);
    }
    
    public GUIFactoryTypeB(IControllerListenerTypeA listener, String type, 
            String title, String description, ArrayList<String> subArgs, 
            ArrayList<String> subIdeas, ArrayList<String> subNotes) {
        this(listener, type, title, description, subArgs);
        this.subArgs = subArgs;
        this.subIdeas = subIdeas;
        this.subNotes = subNotes;
        currentSubList = ARGS;
        
        for(Button b : buttons)
            b.setOnAction(buttonHandlerB);
    }
    
    @Override
    protected ArrayList<Node> makeCenterList() {
        ArrayList<Node> nodeList = super.makeCenterList();
        
        HBox radBox = new HBox();
        radBox.setAlignment(Pos.CENTER);
        radBox.setSpacing(20);
        
        radArgs = new RadioButton("Arguments");
        radIdeas = new RadioButton("Ideas");
        radNotes = new RadioButton("Notes");
        
        radArgs.setUserData(ARGS);
        radIdeas.setUserData(IDEAS);
        radNotes.setUserData(NOTES);
        
        final ToggleGroup group = new ToggleGroup();
        radArgs.setToggleGroup(group);
        radIdeas.setToggleGroup(group);
        radNotes.setToggleGroup(group);
        
        radArgs.setSelected(true);
        radioHandler(group);
        
        radBox.getChildren().addAll(radArgs, radIdeas, radNotes);
        nodeList.add(radBox);
        
        return nodeList;
    }
    
    private void radioHandler(ToggleGroup group) {
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){

            @Override
            public void changed(ObservableValue<? extends Toggle> ov, 
                    Toggle old_toggle, Toggle new_toggle) {
                if(new_toggle != null) {
                    ObservableList<String> obsItems = null;
                    
                    switch((int) new_toggle.getUserData()) {
                        case ARGS:
                            obsItems = FXCollections.observableArrayList(subArgs);
                            currentSubList = ARGS;
                            break;
                        case IDEAS:
                            obsItems = FXCollections.observableArrayList(subIdeas);
                            currentSubList = IDEAS;
                            break;
                        case NOTES:
                            obsItems = FXCollections.observableArrayList(subNotes);
                            currentSubList = NOTES;
                            break;
                    }
                    
                    subList.setItems(obsItems);
                }
            }
            
        });
    }
    
    EventHandler<ActionEvent> buttonHandlerB = new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent arg0) {
            Object o = arg0.getSource();
            
            if(o == back) {
                listener.inputNotify(IControllerListenerTypeA.BACK);
            } else if(o == main) {
                listener.inputNotify(IControllerListenerTypeA.MAIN);
            } else if(o == add) {
                listener.inputNotifySub(currentSubList, 
                        IControllerListenerTypeA.ADD_LIST_ITEM);
            } else if(o == delete) {
                listener.inputNotify(IControllerListenerTypeA.DELETE);
            } else if(o == edit) {
                listener.inputNotify(IControllerListenerTypeA.EDIT);
            } else if(o == save) {
                listener.inputNotify(IControllerListenerTypeA.SAVE);
            }
        }
        
    };

}






















