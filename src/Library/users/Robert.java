package Library.users;

import Library.Book;
import Library.Interfaces.Administrator;
import Library.Interfaces.Librarian;
import Library.Interfaces.Supplier;
import Library.User;

public class Robert extends User implements Supplier {
    public Robert(String name){
        this.name = name;
    }


  public void bringBooks(Book book, Librarian librarin ){
        System.out.printf(" здаров %s. вот держи то что заказывал %s \n",
                librarin.getClass().getSimpleName(), book.getName());

    }

    public String getName() {
         return name;
    }


}

