package views.cli;

import java.util.List;

import models.TopicModel;
import models.ReferenceModel;

/**
 * A method to print out the values of the fields of the Theme
 * passed into it.
 * @author Jeremy
 * @param String description - The description the user entered for the Theme
 * @param String title - The title set for the theme
 * @param TopicModel owner - The Topic that this Theme is under
 * @param TopicModel topic - The Topic hat this Theme is a part of
 * @param List<Reference> referenceList - The list of References associated with this Theme
 */
public class ThemeView {
	public void printThemeInformation(String description, String title, TopicModel owner,
											TopicModel topic, List<ReferenceModel> referenceList) {
		System.out.println("Theme: " + title + " is under " + owner);
		System.out.println("Description: " + description);
		System.out.println("Current references: " + referenceList.toString());
	}
}
