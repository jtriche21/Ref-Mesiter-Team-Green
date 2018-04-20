package views;
import interfaces.*;
import java.util.Scanner;
/**
 * 
 * @author Jeremy Triche & Cameron Cagle
 * A class showing a menu and returning the command input.
 */
public class TopicMenuCLInput implements ITopicMenu {
	
	Scanner kB = new Scanner(System.in);
	
	/**
	 * prints a menu and returns a command 
	 * @return 1: Create Topic
	 * @return 2: View Topic 
	 * @return 3: Exit Program
	 */
	public int getChoice() {
		System.out.println("Topic Menu\n Please enter a command: ");
		System.out.println("1: Create New Topic\n 2: View Topic\n"
						   + "3: Exit Program");
		
		while(true) {
			if (kB.nextInt() == 1)
				return 1;
			else if(kB.nextInt() == 2)
				return 2;
			else if(kB.nextInt() == 3)
				return 3;
			System.out.println("ERROR: Please input a command listed");
		}// end while
	}// end getChoice
}
