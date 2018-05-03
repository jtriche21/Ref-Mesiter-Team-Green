package views;

import java.util.ArrayList;

/**
 * @author Nick
 *
 */
public interface IGUIFactory {
    
    public void set(String type, String title, String description, ArrayList<String> subItems);
}
