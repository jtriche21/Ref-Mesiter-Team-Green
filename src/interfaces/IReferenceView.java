package interfaces;
/**
 * 
 * @author Tyler McVeigh
 *
 */
public interface IReferenceView {
	//TODO Write interface for view
	
	/**
	 * 
	 */
	public void getInputReference();
	
	/**
	 * 
	 * @return
	 */
	public IReferenceModel getData();
	
	/**
	 * 
	 * @param newReference
	 */
	public void setData(IReferenceModel newReference);
	
}
