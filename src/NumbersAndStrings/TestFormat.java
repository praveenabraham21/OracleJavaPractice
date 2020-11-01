package NumbersAndStrings;

public class TestFormat {

    public static void main(String[] args) {
        long n = 12345678;
        System.out.format("%d%n",n);
        System.out.printf("%011d%n",n);
        System.out.printf("%+010d%n",n);
        System.out.printf("%,010d%n",n);
    }
}
