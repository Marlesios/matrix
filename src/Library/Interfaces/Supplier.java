package Library.Interfaces;

import Library.Book;
import Library.User;

public interface Supplier {
    void bringBooks(Book book, Librarian user);
    String getName();
}
