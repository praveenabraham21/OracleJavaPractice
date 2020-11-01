package Set;

import java.util.HashSet;
import java.util.Set;

public class SetForEachConstruct {

    public static void main(String[] args) {
        String[] arr = {"i", "came", "i", "saw", "i", "left"};
        Set<String> s = new HashSet<String>();
        int i = 0;
        for (String a : arr) {
            boolean result = s.add(a);
            if (result)
                System.out.println((i + 1) + " element add successful");
            else
                System.out.println((i + 1) + " element add failure");
            i++;
        }
        System.out.println(s);
    }
}
