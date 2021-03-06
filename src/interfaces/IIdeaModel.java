package interfaces;

import java.util.List;
import models.ReferenceModel;

public interface IIdeaModel {
	
	public void set(String title, String description);
	
	public String getTitle();
	
	public String getDescription();

	public void setTitle(String title);
	
	public void setDescription(String description);
	
	public List<IReferenceModel> getAssociatedReferences();
	
	public void addReference(IReferenceModel reference);
	
	public void removeReference(IReferenceModel reference);
}
