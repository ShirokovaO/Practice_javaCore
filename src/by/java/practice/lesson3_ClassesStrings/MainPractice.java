package by.java.practice.lesson3_ClassesStrings;

import java.lang.reflect.Array;

public class MainPractice {
    public static void main(String[] args) {
        Book book = new Book (323232,"HarryPotter","Roaling", "EKSMO", 2018, 233, 50.99);
//        int id, String name, String author, String establish, int year, int pages, double price
        String bookInfo = book.info();
        System.out.println(bookInfo);

        String infoWithNewPrice = book.newPrice(120.55);
        System.out.println(infoWithNewPrice);


        System.out.println("****************next*****************");

            Book book1 = new Book(32324, "HarryPotter1", "Roaling1", "EKSMO1", 2012, 280, 70.99);
            Book book2 = new Book(32324, "HarryPotter2", "Roaling2", "EKSMO2", 2011, 284, 71.99);
            Book book3 = new Book(33, "HarryPotter3", "Roaling3", "EKSMO3", 2013, 255, 33.99);
            Book book4 = new Book(3444, "HarryPotter4", "Roaling4", "EKSMO4", 2014, 267, 98.99);
            Book book5 = new Book(324, "HarryPotter5", "Roaling5", "EKSMO5", 2015, 288, 79.79);
            Book ArrayBook [] = {book1,book2,book3,book4,book5};

            Book [] NewArrayOfBooks = book1.getBooksToYear(ArrayBook, 2013);
            for (Book s : NewArrayOfBooks){
                if (s == null){
                    continue;
                }
                System.out.println(s.info());
            }

        System.out.println("**********************next**********************");

            Book[] NewArrayOfBooks1 = book1.removeBook(ArrayBook,32324);
            for(Book t: NewArrayOfBooks1){
                if (t==null){
                    continue;
                }
                System.out.println(t.info());
            }



    }

}
