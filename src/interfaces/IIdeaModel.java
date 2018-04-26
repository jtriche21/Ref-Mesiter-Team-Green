package interfaces;

import java.util.List;
import models.ReferenceModel;

public interface IIdeaModel {
	
	public void set(String title, String description);
	
	public String getTitle();
	
	public String getDescription();
	
	public List<ReferenceModel> getAssociatedReferences();
	
	public void addReference(IReferenceModel reference);
	
	public void removeReference(IReferenceModel reference);
}
