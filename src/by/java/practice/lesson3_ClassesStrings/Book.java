package by.java.practice.lesson3_ClassesStrings;

public class Book {
    int id;
    String name;
    String author;
    String establish;
    int year;
    int pages;
    double price;

    public Book (int idParam, String nameParam, String authorParam, String establishParam, int yearParam, int pagesParam, double priceParam){
        id=idParam;
        name=nameParam;
        author=authorParam;
        establish = establishParam;
        year=yearParam;
        pages=pagesParam;
        price=priceParam;
    }
//    1	Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ), Год издания(тип Int), Количество старниц (тип int), цена (double).Инициализацию книги в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.


//2	Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public String info(){
       String info = "Данные книги: \n" + "id: " + id + " name: " + name + " author: " + author + " establish: " + establish + " year: " + year + " pages: " + pages + " price: " + price;
       return info;
    }
//3	Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)

    public String newPrice(double NewPrice) {
        String infoWithNewPrice = "Данные книги с новой ценой: \n" + "id: " + id + " name: " + name + " author: " + author + " establish: " + establish + " year: " + year + " pages: " + pages + " price: " + NewPrice;
        return infoWithNewPrice;
    }

//4	В классе main создать массив из пяти книг
//5	Создать метод в классе Book, который будет принимать массив книг и возвращать из массив книг, у которых год издания ниже переданной года в методе.

    public Book[] getBooksToYear (Book[] ArrayBook, int newYear){
        Book[] NewArrayOfBooks = new Book[ArrayBook.length];
        for(int l=0; l< ArrayBook.length; l++){
            if(ArrayBook [l].year<newYear){
                NewArrayOfBooks [l] = ArrayBook [l];
            }
        }
        return NewArrayOfBooks;
    }

//        6      Создайте метод, который будет принимать массивкниг и дентификатор (id)книги,которую надо удалить из этого массива. Сам метод будет возвращать массив книг.Сигнатура метода: public Book[]removeBook(Book[]books, intidRemoveBook
    public Book[] removeBook (Book [] ArrayBook, int idRemoveBook){
        Book[] NewArrayOfBooks1 = new Book[ArrayBook.length];
        for(int k=0; k< ArrayBook.length; k++){
            if(ArrayBook [k].id!=idRemoveBook){
                NewArrayOfBooks1 [k] = ArrayBook [k];
//                NewArrayOfBooks1 [k] = null;
            }
        }
        return NewArrayOfBooks1;
    }


}
