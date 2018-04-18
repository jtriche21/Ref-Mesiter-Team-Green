package interfaces;

import java.util.List;
import models.ArgumentRatingModel;

public interface IArgumentModel {
	
	public void addReference(ArgumentRatingModel reference);
	
	public void removeReference(ArgumentRatingModel reference);
	
	public void set(String title, String description);
	
	public String getTitle();
	
	public String getDescription();
	
	public List<ArgumentRatingModel> getReferenceList();
	
}
