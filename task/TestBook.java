package task;

public class TestBook {
public static void main(String[] args) {

    Book b1 = new Book();
    b1.setIsbn(1122);
    b1.setAuthor("Thor");
    b1.setTitle("The Avengers");
    b1.setYear(2012);

    Book b2 = new Book();
    b2.setIsbn(2233);
    b2.setAuthor("Iron Man");
    b2.setTitle("Avengers: Age of Ultron");
    b2.setYear(2015);

    Book b3 = new Book();
    b3.setIsbn(3344);
    b3.setAuthor("Halk");
    b3.setTitle("Avengers: Infinity War");
    b3.setYear(2018);

    Book b4 = new Book();
    b4.setIsbn(4455);
    b4.setAuthor("Captain America");
    b4.setTitle("Avengers: The Kang Dynasty");
    b4.setYear(2025);
    
    Book b5 = new Book();
    b5.setIsbn(5566);
    b5.setAuthor("Rocket");
    b5.setTitle("Avengers: Secret Wars");
    b5.setYear(2026);

    Book[] books = {b1, b2, b3, b4, b5};
    printBooks(books,2001,2008);
}
/*
public static void printBooks(Book[] books){
    for(int i = 0; i < books.length; i++){
    
    System.out.println("ISBN: " + books[i].getIsbn());
    System.out.println("Author: " + books[i].getAuthor());
    System.out.println("Title: " + books[i].getTitle());
    System.out.println("Year: " + books[i].getYear());
    System.out.println("=======^A^=======\n");
    
    }
}*/
public static void printBooks(Book[] books, int fromYear, int toYear){
    for(int i = 0; i < books.length; i++){
        if(books[i].getYear() >= fromYear && books[i].getYear() <= toYear){
    if(books[i].getYear() >= fromYear && books[i].getYear() <= toYear){
        System.out.println("ISBN: " + books[i].getIsbn());
        System.out.println("Author: " + books[i].getAuthor());
        System.out.println("Title: " + books[i].getTitle());
        System.out.println("Year: " + books[i].getYear());
        System.out.println("=======^A^=======\n");
} } else {System.out.println("No pulications on this period"); break;}
    }
} 
}