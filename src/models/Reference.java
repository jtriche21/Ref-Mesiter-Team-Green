/**
 * Model class for References
 *
 * @author Tyler McVeigh
 * @version 1
 * @date 3/26/2018
 */

package RefMiesterModels;

import java.util.List;
import java.util.ArrayList;

public class Reference {

    private List<String> authors;
    private String sourceTitle;
    private String containerTitle;
    private String version;
    private String volumeNumber;
    private String publisher;
    private String publicationDate;
    private String location;
    private List<Idea> ideaList;
    private List<ArgumentRating> argumentList;
    private List<Note> noteList;
    private ThemeModel owner;

    /**
     * Creates a reference instance from an array of authors, the source title,
     * the publication date and the theme the instance is a member of
     *
     * @param authors The array containing the authors
     * @param sourceTitle The title of the reference
     * @param publicationDate When the reference was published
     * @param owner The theme object that this reference instance is a member of
     */
    public Reference(List<String> authors, String sourceTitle, String publicationDate, Theme owner) {
        this.authors = authors;
        this.sourceTitle = sourceTitle;
        this.publicationDate = publicationDate;
        this.owner = owner;
        this.containerTitle = "";
        this.version = "";
        this.volumeNumber = "";
        this.publisher = "";
        this.location = "";
        this.ideaList = new ArrayList<Idea>();
        this.argumentList = new ArrayList<ArgumentRating>();
        this.noteList = new ArrayList<Note>();

    }

    /**
     * Default Constructor for the Reference Class
     *
     * @param owner The Theme object that this reference instance is a member of
     */
    public Reference(Theme owner) {
        this.authors = new ArrayList<String>();
        this.sourceTitle = "";
        this.publicationDate = "";
        this.owner = owner;
        this.containerTitle = "";
        this.version = "";
        this.volumeNumber = "";
        this.publisher = "";
        this.location = "";
        this.ideaList = new ArrayList<Idea>();
        this.argumentList = new ArrayList<ArgumentRating>();
        this.noteList = new ArrayList<Note>();
    }

    /**
     * Adds Idea to the reference instance's list of ideas
     *
     * @param item the idea to be added
     */
    public void addIdea(Idea item){
        this.ideaList.add(item);
    }

    /**
     * Removes and Idea from the
     *
     * @param item The Idea to be removed
     */
    public void removeIdea(Idea item){
        this.ideaList.remove(item);
    }

    /**
     * Adds an argument to the reference instance's list of arguments
     *
     * @param ar The argument to be added to the reference
     */
    public void addArgument(ArgumentRating ar){
        this.argumentList.add(ar);
    }

    /**
     * Removes the argument from the reference instance's list of arguments
     *
     * @param ar the argument to be removed
     */
    public void removeArgument(ArgumentRating ar){
        this.argumentList.remove(ar);
    }

    /**
     * Adds the Note to the references list of notes
     *
     * @param item the note to be added
     */
    public void addNote(Note item){
        this.noteList.add(item);
    }

    /**
     * Remove the Note from the reference instance's list of notes
     *
     * @param item the note to be removed
     */
    public void removeNote(Note item){
        this.noteList.remove(item);
    }

    /**
     * The getter method for authors
     *
     * @return The reference instance's authors
     */
    public List<String> getAuthors() {
        return authors;
    }


    /**
     * The setter method for authors
     *
     * @param authors
     */
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    /**
     * Adds an author to the list of Authors
     *
     * @param author The author to be added
     */
    public void addAuthor(String author){
        this.authors.add(author);
    }

    /**
     * The getter method for the reference source's title
     *
     * @return The instance's source title
     */
    public String getSourceTitle() {
        return sourceTitle;
    }

    /**
     * The setter method for the reference source's title
     *
     * @param sourceTitle The new source title
     */
    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    /**
     * The getter method for the Container's Title
     *
     * @return The Container title
     */
    public String getContainerTitle() {
        return containerTitle;
    }

    /**
     * The setter method for the Container's Title
     *
     * @param containerTitle The new Container's Title
     */
    public void setContainerTitle(String containerTitle) {
        this.containerTitle = containerTitle;
    }

    /**
     * The getter method for the Version
     *
     * @return The reference instance's version
     */
    public String getVersion() {
        return version;
    }

    /**
     * The setter method for the Version
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * The getter method for the Volume Number
     *
     * @return The reference instance's Volume Number
     */
    public String getVolumeNumber() {
        return volumeNumber;
    }

    /**
     * The setter method for the Volume Number
     *
     * @param volumeNumber the new Volume Number
     */
    public void setVolumeNumber(String volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    /**
     * The getter method for the Publisher
     *
     * @return the reference instance's publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * The setter method for the Publisher
     *
     * @param publisher the new publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * The getter method for the Publication Date
     *
     * @return the reference instance's publication date
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * The setter method for the Publication Date
     *
     * @param publicationDate the new publication date
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * The getter method for the Location
     *
     * @return the reference instance's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * The setter method for the Location
     *
     * @param location the new location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The getter method for the Owning Theme
     *
     * @return The owning theme
     */
    public Theme getOwner() {
        return owner;
    }

    /**
     * The setter method for the owning theme
     *
     * @param owner the new owning theme
     */
    public void setOwner(Theme owner) {
        this.owner = owner;
    }

    /**
     * Generates a formatted string containing all the fields
     *
     * @return The formatted string
     */
    @Override
    public String toString() {
        return "Reference{" +
                "authors=" + authors +
                ", sourceTitle='" + sourceTitle + '\'' +
                ", containerTitle='" + containerTitle + '\'' +
                ", version='" + version + '\'' +
                ", volumeNumber='" + volumeNumber + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", location='" + location + '\'' +
                ", ideaList=" + ideaList +
                ", argumentList=" + argumentList +
                ", noteList=" + noteList +
                ", owner=" + owner +
                '}';
    }
}