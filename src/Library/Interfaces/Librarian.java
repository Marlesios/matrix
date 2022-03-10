package Library.Interfaces;

import Library.Book;
import Library.User;

public interface Librarian {
    void orderBook(Book Book, Supplier supplier);
    String getName();
}
