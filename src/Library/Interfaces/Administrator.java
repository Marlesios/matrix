package Library.Interfaces;

import Library.Book;
import Library.User;

public interface Administrator {
    String getName();
    void findBooks(Book book);
    void giveBookTo(Book book, Reader robert);
    void overDueNotification(Book book,Reader user,String date);
}
