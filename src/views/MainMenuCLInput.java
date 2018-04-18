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
	private CentralController menuChoice;
	
	Integer menuCommand;
	
	Scanner kB = new Scanner(System.in);
	
	public MainMenuCLInput(CentralController menu) {
		this.menuChoice = menu;
	}
	
	public void setData(CentralController menu) {
		this.menuChoice = menu;
	}
	
	public void getInput() {
		kB = new Scanner(System.in);
		System.out.println("Welcome to Reference Meister!\n");
		System.out.println("Please enter a command\n1: Create Library\n"
						   + "2: View Library\n3: Exit");
		if(kB.nextInt() == 1) 
			menuCommand = 1;
		
		else if(kB.nextInt() == 2) 
			menuCommand = 2;
		
		else if(kB.nextInt() == 3)
			menuCommand = 3;
		else {
			System.out.println("ERROR: Please input a command listed");
		}
		menuChoice.set(menuCommand);
	}
	
	public CentralController getData() {
		return this.menuChoice;
	}
	
}
