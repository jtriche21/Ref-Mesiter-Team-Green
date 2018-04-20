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
	
	Scanner kB = new Scanner(System.in);
	boolean correctInput = true;
	public int getChoice() {
		kB = new Scanner(System.in);
		System.out.println("Welcome to Reference Meister!\n");
		System.out.println("Please enter a command\n1: Create Library\n"
						   + "2: Exit");
		while(true) { 
			if(kB.nextInt() == 1) { 
				return 1;
			}
			else if(kB.nextInt() == 2) {
				return 2;
			}
				System.out.println("ERROR: Please input a command listed");
			
		
		}
	}
	
}
