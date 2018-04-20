package views;

import interfaces.*;
import java.util.Scanner;
import controllers.*;
/**
 * 
 * @author Cameron Cagle
 * 
 */
public class MainMenuCLInput implements IMainMenu {
	
	/** scanner to take the keyboard input */
	Scanner kB = new Scanner(System.in);
	
	/**
	 *	a function that prints a menu and returns a command.
	 * @return 1: Create Library
	 * @return 2: Exit Program 
	 */
	public int getChoice() {
		System.out.println("Welcome to Reference Meister!\n");
		System.out.println("Please enter a command\n1: Create Library\n"
						   + "2: Exit");
		while(true) { 
			if(kB.nextInt() == 1) { 
				return 1;
			}// end if
			else if(kB.nextInt() == 2) {
				return 2;
			}// end else if
			System.out.println("ERROR: Please input a command listed");
		}// end while
	}// end getChoice
}// end class
