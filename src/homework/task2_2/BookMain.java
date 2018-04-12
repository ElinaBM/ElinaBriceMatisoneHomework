package homework.task2_2;

public class BookMain {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setAuthorName("Aleksandrs Grins");
        firstBook.setTitleOfBook("Dveselu putenis");
        firstBook.setYearOfEdition(1990);
        firstBook.setPageCount(781);

        Book secondBook = new Book();
        secondBook.setAuthorName("Dens Brauns");
        secondBook.setTitleOfBook("Sakums");
        secondBook.setYearOfEdition(2017);
        secondBook.setPageCount(552);

        Book thirdBook = new Book();
        thirdBook.setTitleOfBook("The Cat Encyclopedia");
        thirdBook.setAuthorName("Esther J. J. Verhoef-Verhallen");
        thirdBook.setYearOfEdition(2014);
        thirdBook.setPageCount(320);

        Book newBook = new Book("Dan Brown", "Angels and Demons", 2000, 616);
        System.out.println("This is a good book. Info - " +
                "Title: " + newBook.getTitleOfBook() + ", " +
                "Author: " + newBook.getAuthorName() + ", " +
                "it's issued in " + newBook.getYearOfEdition() +
                " and has " + newBook.getPageCount() + " pages.");


        System.out.println(newBook.toString());


    }
}
