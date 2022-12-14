public class testMatheExample {

    public static void testPlus() {
        System.out.println("Test der Funktion plus(...) gestartet");
        int zahl1 = 999;
        int zahl2 = 1;
        int ergebnis = MathLib.plus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " + " + zahl2 + " : " + ergebnis);
        zahl1 = 1;
        zahl2 = -5;
        ergebnis = MathLib.plus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " + " + zahl2 + " : " + ergebnis);
        zahl1 = Integer.MAX_VALUE;
        zahl2 = 1;
        ergebnis = MathLib.plus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " + " + zahl2 + " : " + ergebnis);
        zahl1 = 0;
        ergebnis = MathLib.plus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " + " + zahl2 + " : " + ergebnis);

    }

    public static void testMinus() {
        System.out.println("Test der Funktion minus(...) gestartet");
        int zahl1 = 999;
        int zahl2 = 1;
        int ergebnis = MathLib.minus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " - " + zahl2 + " : " + ergebnis);
        zahl1 = 1;
        zahl2 = -5;
        ergebnis = MathLib.minus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " - " + zahl2 + " : " + ergebnis);
        zahl1 = Integer.MAX_VALUE;
        zahl2 = 1;
        ergebnis = MathLib.minus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " - " + zahl2 + " : " + ergebnis);
        zahl1 = 0;
        ergebnis = MathLib.minus(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " - " + zahl2 + " : " + ergebnis);

    }

    public static void testMal() {
        System.out.println("Test der Funktion mal(...) gestartet");
        int zahl1 = 999;
        int zahl2 = 1;
        int ergebnis = MathLib.multi(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " * " + zahl2 + " : " + ergebnis);
        zahl1 = 1;
        zahl2 = -5;
        ergebnis = MathLib.multi(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " * " + zahl2 + " : " + ergebnis);
        zahl1 = Integer.MAX_VALUE;
        zahl2 = 1;
        ergebnis = MathLib.multi(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " * " + zahl2 + " : " + ergebnis);
        zahl1 = 0;
        ergebnis = MathLib.multi(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " * " + zahl2 + " : " + ergebnis);

    }

    public static void testGeteilt() {
        System.out.println("Test der Funktion geteilt(...) gestartet");
        int zahl1 = 999;
        int zahl2 = 1;
        double ergebnis = MathLib.divide(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " / " + zahl2 + " : " + ergebnis);
        zahl1 = 5;
        zahl2 = 2;
        ergebnis = MathLib.divide(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " / " + zahl2 + " : " + ergebnis);
        zahl2 = 0;
        ergebnis = MathLib.divide(zahl1, zahl2);
        System.out.println("Ergebnis von " + zahl1 + " / " + zahl2 + " : " + ergebnis);

    }

    public static void testBetrag() {
        System.out.println(MathLib.betrag(1));
        System.out.println(MathLib.betrag(-1));
        System.out.println(MathLib.betrag(1.5));
        System.out.println(MathLib.betrag(-1.5));
    }

}
