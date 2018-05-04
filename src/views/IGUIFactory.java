package views;

import java.util.ArrayList;

import javafx.scene.layout.Pane;

/**
 * @author Nick
 *
 */
public interface IGUIFactory {
    
    public void set(String type, String title, String description, ArrayList<String> subItems);
    public Pane getRoot();
}
