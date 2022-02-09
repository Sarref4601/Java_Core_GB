
import com.sun.javafx.css.StyleCacheEntry;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Yabloko");
        stringList.add("Persik");
        stringList.add("Vishnya");
        stringList.add("Klubnika");
        stringList.add("Vishnya");
        stringList.add("Vishnya");
        stringList.add("Persik");
        stringList.add("Persik");
        stringList.add("Golubika");
        stringList.add("Yabloko");

        HashSet<String> hs = new HashSet<>();
        hs.addAll(stringList);
        System.out.println(hs);// уникальные элементы

        for (String r : hs) {
            System.out.println(r + ": " + Collections.frequency(stringList, r)); //кол-во повторений каждого элемента
        }


        PhoneContacts.add("Valera", 1245);
        PhoneContacts.add("Alesha", 5666);
        System.out.println(PhoneContacts.phoneBook);
    }
}
