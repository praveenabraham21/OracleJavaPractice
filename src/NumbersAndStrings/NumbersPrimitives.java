package NumbersAndStrings;

import java.util.Locale;

public class NumbersPrimitives {

    public static void main(String[] args) {
        int i = 564348;
        System.out.printf("The value of i is: %d%n", i);
        float floatVar = 100.000f;
        int intVar = 1021;
        String stringVar = "Praveen";
        System.out.printf(Locale.FRENCH, "The value of float variable is %f, while the value of the " +
                "integer variable is %d, and the string value is %s%n", floatVar, intVar, stringVar);
    }
}
