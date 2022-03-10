package Library.users;

import Library.Book;
import Library.Interfaces.Administrator;
import Library.Interfaces.Librarian;
import Library.Interfaces.Reader;
import Library.Interfaces.Supplier;
import Library.User;


public class Mark extends User implements Librarian, Reader {
    public Mark(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    // Методы читателя 0

   public void takeBook(Book book, Administrator mark){
        System.out.printf("Здравствуйте %s  вот я забираю %s и верну вам потом\n", mark.getName(), book.getName());
    };

    public void bringBackBookTo(Book book,Administrator mark){
        System.out.printf("Ой извините %s вот я принес вам книгу %s\n", mark.getName(),book.getName());
    }

    public void orderBook(Book book, Supplier supplier){
        System.out.printf("Здравствуйте %s это %s бы хотел заказать у вас книгу %s\n", supplier.getName(), getName(), book.getName());
    };




}
