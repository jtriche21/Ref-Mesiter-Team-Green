package views;

import models.TopicModel;

/**
 * A method to print out the values of the fields of the Theme
 * passed into it.
 * @author Jeremy
 * @param String description - The description the user entered for the Theme
 * @param String title - The title set for the theme
 * @param Topic owner - The Topic that this Theme is under
 * @param Topic topic - The Topic hat this Theme is a part of
 * @param List<Reference> referenceList - The list of References associated with this Theme
 */
public class ThemeView {
	public void printThemeInformation(String description, String title, TopicModel owner,
											Topic topic, List<Reference> referenceList) {
		System.out.println("Theme: " + title + " is under " + owner);
		System.out.println("Description: " + description);
		System.out.println("Current references: " + referenceList.toString());
	}
}
