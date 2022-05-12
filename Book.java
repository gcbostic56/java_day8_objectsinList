public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String bookTitle, int pageNumbers, int publicationYear) {
        this.title = bookTitle;
        this.pages = pageNumbers;
        this.year = publicationYear;
    }
    public Book(String bookTitle) {
        this.title = bookTitle;
    }
    public Book(int pageNumbers, int publicationYear) {
        this.pages = pageNumbers;
        this.year = publicationYear;
    }
    public Book(int publicationYear) {
        this.year = publicationYear;
    }
    public Book(String bookTitle, int pageNumbers) {
        this.title = bookTitle;
        this.pages = pageNumbers;
    } 
    public Book() {
        
    }
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }
    public int getYear() {
        return this.year;
    }
    
    public String toString(String answer) {
        String whatever = null;
        if (answer.equalsIgnoreCase("everything")) {
            whatever = "The title of the book is " + getTitle() + ".\nThe amount of pages is " + getPages() +".\nThe publication year is " + getYear() + ".";
        }
        else if (answer.equalsIgnoreCase("name")) {
        
        whatever = "The title of the books are " + getTitle() + ".";
    }
    return whatever;
}
}
