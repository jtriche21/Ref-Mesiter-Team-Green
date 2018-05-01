/**
 * 
 */
package views;

import java.util.ArrayList;

/**
 * @author Nick
 *
 */
public interface IGUIFactoryTypeA {
    public final static int SAVE = 1;
    public final static int DELETE = 2;
    public final static int SUBITEM = 3;
    public final static int EDIT = 4;
    public final static int BACK = 5;
    public final static int MAIN = 6;
    
    public void set(String type, String title, String description, ArrayList<String> subItems);
}
