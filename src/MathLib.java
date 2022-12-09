
public class MathLib {
    public static void main() {
        System.out.println("MathLib gestartet");
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static double betrag(double a) {
        if (a < 0) {
            return a * (-1);
        }
        return a;
    }

    public static int betrag(int a) {
        if (a < 0) {
            return a * (-1);
        }
        return a;
    }

    public static int fakultaet(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fakultaet(n - 1);
        }

    }
}