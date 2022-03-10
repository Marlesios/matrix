package Library.users;

import Library.Interfaces.Administrator;
import Library.Book;
import Library.Interfaces.Reader;
import Library.User;


public class Alex extends User implements Administrator {
    public Alex(String name){
        this.name = name;
    }
    public String getName(){
        return name;}

    @Override
    public void findBooks(Book book) {
        System.out.printf("вот я сейчас ищу книгу %s,  о нашел вот \n", book.getName());

    }

    @Override
    public void giveBookTo(Book book, Reader mark) {
        System.out.printf("держите %s вашу %s \n", mark.getName(), book.getName());
    }

    @Override
    public void overDueNotification(Book book, Reader user, String date) {
        System.out.printf("хей %s ты забыл принести книгу %s в этом числе %s\n", user.getName(), book.getName(), date);
    }
}
