package PhoneDictionary;

import java.util.*;

public class PhoneContacts {
    public static  Map<String, List<Contacts>> data = new HashMap<>();




    public static void printGroups(){
        for(String key: data.keySet()){
            System.out.print(key + ", ");
        }
    }
    public static void printMap(){
        for(Map.Entry<String,List<Contacts>> entry: data.entrySet()){
            System.out.println(entry.getKey() + " -> /n" + entry.getValue());
        }
    }


}