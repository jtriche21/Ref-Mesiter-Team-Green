package interfaces;


public interface IArgumentView {
    /**
     * Gets user input and sets the arguments fields.
     */
    public void getInputArgument();
    
    /**
     * Returns the argument object.
     * 
     * @return The argument object.
     */
    public IArgumentModel getData();
    
    /**
     * Sets the argument object.
     * 
     * @param arg The new argument.
     */
    public void setData(IArgumentModel arg);
}
