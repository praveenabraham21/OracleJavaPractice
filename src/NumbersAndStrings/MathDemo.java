package NumbersAndStrings;

public class MathDemo {
    public static void main(String[] args) {
        double a = 100.49;
        double b = 100.50;
        double c = 100.51;
        double n = -100.00;

        System.out.printf("The absolute value of %.3f is %.3f%n", a, Math.abs(a));
        System.out.printf("The absolute value of %.3f is %.3f%n", b, Math.abs(b));
        System.out.printf("The absolute value of %.3f is %.3f%n", c, Math.abs(c));
        System.out.printf("The absolute value of %.3f is %.3f%n", n, Math.abs(n));

        System.out.printf("The Ceil value of %.2f is %.2f%n", a, Math.ceil(a));
        System.out.printf("The Ceil value of %.2f is %.2f%n", b, Math.ceil(b));
        System.out.printf("The Ceil value of %.2f is %.2f%n", c, Math.ceil(c));

        System.out.printf("The floor value of %.2f is %.2f%n", a, Math.floor(a));
        System.out.printf("The floor value of %.2f is %.2f%n", b, Math.floor(b));
        System.out.printf("The floor value of %.2f is %.2f%n", c, Math.floor(c));

        System.out.printf("The rint value of %.2f is %.2f%n", a, Math.rint(a));
        System.out.printf("The rint value of %.2f is %.2f%n", b, Math.rint(b));
        System.out.printf("The rint value of %.2f is %.2f%n", c, Math.rint(c));
    }
}
