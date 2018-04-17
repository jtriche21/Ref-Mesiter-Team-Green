package models.interfaces;

import java.util.List;
import models.ReferenceModel;

public interface IIdeaModel {
	
	public void set(String title, String description);
	
	public String getTitle();
	
	public String getDescription();
	
	public List<ReferenceModel> getAssociatedReferences();
	
	public void addReference(ReferenceModel reference);
	
	public void removeReference(ReferenceModel reference);
}
