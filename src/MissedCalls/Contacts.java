package MissedCalls;

import java.util.Objects;

public class Contacts {
    private final String name;
    private int number;
    public Contacts(String name,int number){
        this.name = name;
        this.number = number;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null ||!obj.getClass().equals(Contacts.class)) return false;
        Contacts altContact = (Contacts) obj;
        return this.name.equals(altContact.name) && this.number == altContact.number;
    }
    public int hashCode() { return Objects.hash(name, number);}

    @Override
    public String toString() { return name + " " + number;}
}
