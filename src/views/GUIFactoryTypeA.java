/**
 * 
 */
package views;

import java.util.ArrayList;

/**
 * @author Nick
 *
 */
public class GUIFactoryTypeA implements IGUIFactoryTypeA {

    private String type;
    private String title;
    private String description;
    private ArrayList<String> subItems;
    
    public GUIFactoryTypeA(String type, String title, String description, ArrayList<String> subItems) {
        set(type, title, description, subItems);
    }
    
    @Override
    public void set(String type, String title, String description, ArrayList<String> subItems) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.subItems = subItems;
    }

}
