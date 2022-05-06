package Lab11;

public class Book {



    //define and assign instance variables
    private String title;
    private String author;

    //default constructor
    public Book() {
        title = "Test";
        author = null;
    }

    //parametized constructor
    public Book(String aTitle, String anAuthor) {
        title = aTitle;
        author = anAuthor;
    }

    //getter method for title
    public String getTitle() {
        return title;
    }

    //setter method for title
    public void setTitle(String aTitle) {
        title = aTitle;
    }

    //getter method for author
    public String getAuthor() {
        return author;
    }

    //setter method for author
    public void setAuthor(String anAuthor) {
        author = anAuthor;
    }

    //method called toString to return string with book info
    public String toString() {
        StringBuilder str = new StringBuilder(); //assigning blank value for str

        str.append("\"").append(title).append("\" by ").append(author);

        return str.toString(); //stringbuilder is not a string so you have to convert it to string
}
                }






