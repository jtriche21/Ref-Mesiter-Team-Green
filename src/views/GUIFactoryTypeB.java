/**
 * 
 */
package views;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * @author Nick
 *
 */
public class GUIFactoryTypeB extends GUIFactoryTypeA implements IGUIFactory {
    
    private ArrayList<String> subArgs;
    private ArrayList<String> subIdeas;
    private ArrayList<String> subNotes;
    
    private RadioButton radArgs;
    private RadioButton radIdeas;
    private RadioButton radNotes;
    

    private GUIFactoryTypeB(String type, String title, String description, ArrayList<String> subItems) {
        super(type, title, description, subItems);
    }
    
    public GUIFactoryTypeB(String type, String title, String description, 
            ArrayList<String> subArgs, ArrayList<String> subIdeas, ArrayList<String> subNotes) {
        this(type, title, description, subArgs);
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
        
        final ToggleGroup group = new ToggleGroup();
        radArgs.setToggleGroup(group);
        radIdeas.setToggleGroup(group);
        radNotes.setToggleGroup(group);
        
        radArgs.setSelected(true);
        
        radBox.getChildren().addAll(radArgs, radIdeas, radNotes);
        nodeList.add(radBox);
        
        return nodeList;
    }

}






















