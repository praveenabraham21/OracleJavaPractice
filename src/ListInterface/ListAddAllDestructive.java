package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListAddAllDestructive {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add("World");
        List<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("Java");

        System.out.println(list1);
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
