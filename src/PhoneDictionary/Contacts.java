package PhoneDictionary;
import java.util.*;


public class Contacts {
    private final   String name;
    private final int number;

    public Contacts(String name, int number){
        this.name = name;
        this.number = number;
    }
    public int getNumber(int number){
        return number;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || !obj.getClass().equals(Contacts.class)) return false;
        Contacts altContacts = (Contacts) obj;

        return this.name.equals(altContacts.name) && this.number == altContacts.number;
    }
    public int hashCode(){
        return Objects.hash(name, number);
    }

    @Override
    public String toString(){
        return name +  "/n  " + number;
    }
}
