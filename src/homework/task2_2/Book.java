package homework.task2_2;

public class Book {

    String authorName;
    String titleOfBook;
    int yearOfEdition;
    int pageCount;

    public Book(){}

    public Book (String authorName, String titleOfBook, int yearOfEdition, int pageCount) {
        this.authorName = authorName;
        this.titleOfBook = titleOfBook;
        this.yearOfEdition = yearOfEdition;
        this.pageCount = pageCount;
    }

    public void setAuthorName(String name) {authorName = name;}

    public void setTitleOfBook(String title) {titleOfBook = title;}

    public void setYearOfEdition(int year) {yearOfEdition = year;}

    public void setPageCount(int pages) {pageCount = pages;}

    public String getAuthorName() {return authorName;}

    public String getTitleOfBook() {return titleOfBook;}

    public int getYearOfEdition() {return yearOfEdition;}

    public int getPageCount() {return pageCount;}

@Override
    public String toString() {

        return "Info about book - Author "+this.authorName+", "+
                "title - "+this.titleOfBook+" ,"+
                "year of edition "+this.yearOfEdition+" ,"+
                "pages - "+this.pageCount;
    }
}