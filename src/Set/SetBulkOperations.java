package Set;

import java.util.HashSet;
import java.util.Set;

public class SetBulkOperations {
    public static void main(String[] args) {

        String[] arr = {"i", "came", "i", "saw", "i", "left"};

        Set<String> uniques = new HashSet<String>();
        Set<String> dupes = new HashSet<String>();

        for (String a : arr) {
            if (!uniques.add(a)) {
                dupes.add(a);
            }
        }

        uniques.removeAll(dupes);

        System.out.println(uniques);
        System.out.println(dupes);
    }
}
