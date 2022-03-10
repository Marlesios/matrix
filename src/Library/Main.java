package Library;

import Library.Interfaces.Administrator;
import Library.Interfaces.Librarian;
import Library.Interfaces.Reader;
import Library.Interfaces.Supplier;
import Library.users.Alex;
import Library.users.Mark;
import Library.users.Robert;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("война и мир");
        Book book2 = new Book("monte kristo");
        Book[] books = new Book[5];
        book1.setData("21.12.15");
        book2.setData("22.12.18");

        Librarian mark = new Mark("Mark");
        Reader markus = new Mark("markus");
        Administrator alex = new Alex("lex");
        Supplier robert = new Robert("robin");

        mark.orderBook(book1,robert);
        robert.bringBooks(book1,mark);
        markus.takeBook(book1,alex);
        alex.findBooks(book1);
        alex.giveBookTo(book1,markus);
        alex.overDueNotification(book1,markus,"12.12.12");
        markus.bringBackBookTo(book1,alex);






    }

}
