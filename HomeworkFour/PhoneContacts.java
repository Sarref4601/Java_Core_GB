import java.util.*;

public class PhoneContacts {
    static HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();


    public static void add(String name, int phone) {
        HashSet<Integer> phones;
        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phoneBook.put(name,phones);

    }

    public HashSet<Integer> getPhonesByName (String name){
        return phoneBook.get(name);
    }
}
