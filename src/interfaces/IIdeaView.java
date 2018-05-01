package interfaces;

public interface IIdeaView {
	
	/**Gets user input*/
	public void getInputIdea();
	
	/**gets data returned by the user*/
	public IIdeaModel getData();
	
	/**Sets data entered by the user*/
	public void setData(IIdeaModel newIdea);

	public void printIdea();
}
