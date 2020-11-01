package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListAddAllNonDestructive {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();


        list1.add("Hello");
        list1.add("World");

        list2.add("Hello");
        list2.add("Java");

        List<String> list3 = new ArrayList<String>(list1);
        list3.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);


    }

}
