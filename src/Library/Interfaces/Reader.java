package Library.Interfaces;

import Library.Book;
import Library.User;

public interface Reader {
     String getName();
     void takeBook(Book book, Administrator administrator);
     void bringBackBookTo(Book book, Administrator administrator);
}
