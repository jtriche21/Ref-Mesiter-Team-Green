/**
 * 
 */
package controllers;

/**
 * @author Nick
 *
 */
public interface IControllerListenerTypeA {
    /**
     * The GUI notifies the Controller of a change.
     * 
     * @param button The int reference to the button that is clicked.
     * @param subItem The corresponding index to an item that is clicked in the list.
     */
    public void inputNotify(int button, int subItem);
}
