package Access;

import java.util.*;

import Access.Exceptions.*;

public class Main {


    public static void main(String[] args) throws UsernotFoundException, AccessDeniedException {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин ");
        String login = scanner.nextLine();

        System.out.println("Введите пароль ");
        String password = scanner.nextLine();

        getUserByLoginAndPassword(login,password);
        validateUser(getUserByLoginAndPassword(login, password));

        System.out.println("доступ предоставлен");
     }
    public static User[] getUsers() {
        User user1 = new User("gaga", "goThere", "gogo@gmail.com", 23);
        User user2 = new User("black", "daNu", "1999@gmail.com", 17);
        User user3 = new User("gogog", "tadamm", "123@sobaka", 23);
        User user4 = new User("phaa", "dom", "domsobaka", 11);
        User user5 = new User("masha", "4to_delaesh", "zaika@mail.ru", 15);

        return new User[]{user1,user2,user3,user4,user5};
    }

    public static User getUserByLoginAndPassword(String login,String password) throws UsernotFoundException,AccessDeniedException{
        User[] users = getUsers();
        for(User user:users){
            if(login.equals(user.login) && password.equals(user.password)){
                return user;
            }
        }   throw new UsernotFoundException("таких данных нет в базе данных");
    }


    public static void validateUser(User user) throws AccessDeniedException{
        if(user.age < 18){
            throw new AccessDeniedException("не достаточно лет");
        }
    }

}


