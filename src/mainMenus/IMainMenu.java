/**
 * @author: Cameron Cagle
 * 
 */

package mainMenus;

import Driver;

public interface IMainMenu {
	/** show the entry form to the user for input.*/
	public void getInputMenu();
	
	/** get the data entered by the user. */
	public Driver getData();
	
	/** set the data entered by the user. */
	public void setData(Driver menu);
	
	
	
}
