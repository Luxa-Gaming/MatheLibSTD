public class testMatheSelf {

    public static void testPlus(int zahl1, int zahl2) {
        System.out.println("Test der Funktion plus(...) gestartet");
        int ergebnis = MathLib.plus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " + " + zahl2 + " : " + ergebnis);

    }

    public static void testMinus(int zahl1, int zahl2) {
        System.out.println("Test der Funktion minus(...) gestartet");
        int ergebnis = MathLib.minus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " - " + zahl2 + " : " + ergebnis);

    }

    public static void testMal(int zahl1, int zahl2) {
        System.out.println("Test der Funktion mal(...) gestartet");
        int ergebnis = MathLib.multi(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " * " + zahl2 + " : " + ergebnis);

    }

    public static void testGeteilt(int zahl1, int zahl2) {
        System.out.println("Test der Funktion geteilt(...) gestartet");
        double ergebnis = MathLib.divide(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " / " + zahl2 + " : " + ergebnis);

    }

    public static void testBetrag(int zahl) {
        System.out.println(MathLib.betrag(zahl));

    }

}
