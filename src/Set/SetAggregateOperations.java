package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetAggregateOperations {
    public static void main(String[] args) {
        String[] s = {"i", "see", "what", "i", "saw"};
        Set<String> mySet = new HashSet<>(Arrays.asList(s));
        System.out.println(mySet);
    }
}
