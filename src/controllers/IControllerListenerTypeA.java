package controllers;

/**
 * @author Nick
 *
 */
public interface IControllerListenerTypeA {
    public final static int ADD = 1;
    public final static int EDIT = 2;
    public final static int DELETE = 3;
    public final static int SAVE = 4;
    public final static int BACK = 5;
    public final static int MAIN = 6;
    
    public final static int ADD_LIST_ITEM = -1;
    public final static int ARG_LIST = 0;
    public final static int IDEA_LIST = 1;
    public final static int NOTE_LIST = 2;
    
    /**
     * The GUI notifies the Controller of a change.
     * 
     * @param button The int reference to the button that is clicked.
     */
    public void inputNotify(int button);
    
    /**
     * The GUI notifies the Controller that a sub-item has been selected.
     * 
     * @param subList If Reference, the int representing the sub list that
     * is checked.
     * @param subItem The item in the list that has been selected.
     */
    public void inputNotifySub(int subList, int subItem);
    
    /**
     * The GUI notifies the Controller of info for the selected function.
     * 
     * @param info A String containing all info separated by semicolon.
     */
    public void inputNotifyInfo(String info);
}


















