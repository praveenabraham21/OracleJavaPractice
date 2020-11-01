package NumbersAndStrings;

import java.text.DecimalFormat;

public class DecimalFormatter {

    public static void main(String[] args) {
        String value = customFormat("###,###,###", 1234567889);
        System.out.println(value);

        String value1 = customFormat("###.##", 123456.789);
        System.out.println(value1);

        String value2 = customFormat("000000.000", 123.78);
        System.out.println(value2);

        String value3 = customFormat("$###,###,###", 12332232);
        System.out.println(value3);
    }

    public static String customFormat(String pattern, double value) {
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(value);
    }
}
