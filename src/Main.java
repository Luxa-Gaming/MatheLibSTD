import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MathLib.main();
        test();
    }

    public static void test() {
        System.out.println("Eigene Zahlen (e) oder Beispielzahlen (b) verwenden?");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();

        if (eingabe.equals("b")) { // Beispielzahlen
            System.out.println("Beispielzahlen werden nun verwendet.");
            System.out.println("Alle Methoden testen? (j/n)");
            eingabe = scanner.nextLine();
            if (eingabe.equals("j")) {
                testMatheExample.testMal();
                testMatheExample.testPlus();
                testMatheExample.testGeteilt();
                testMatheExample.testMinus();
                testMatheExample.testBetrag();
            } else if (eingabe.equals("n")) {
                System.out.println("Mögliche Auswahl: '+', '-', '/', '*'");
                eingabe = scanner.nextLine();
                switch (eingabe) {
                    case "+" -> testMatheExample.testPlus();
                    case "-" -> testMatheExample.testMinus();
                    case "/" -> testMatheExample.testGeteilt();
                    case "*" -> testMatheExample.testMal();
                    default -> System.out.println("Keine gültige Option ausgewählt.");
                }
            } else {
                System.out.println("Falsche Eingabe.");
            }

        } else if (eingabe.equals("e")) { // Eigene Zahlen
            System.out.println("Eigene Zahlen werden nun verwendet. \n Die ausgewählten Zahlen werden die nachfolgend ausgewählte Funktion verwendet");
            System.out.println("Bitte Zahl 1 eingeben:");
            String zahl1String = scanner.nextLine();
            System.out.println("Bitte Zahl 2 eingeben:");
            String zahl2String = scanner.nextLine();

            int zahl1 = (Integer.parseInt(zahl1String));
            int zahl2 = (Integer.parseInt(zahl2String));

            System.out.println("\n Alle Methoden testen? (j/n)");
            eingabe = scanner.nextLine();
            if (eingabe.equals("j")) {
                testMatheSelf.testMal(zahl1, zahl2);
                testMatheSelf.testPlus(zahl1, zahl2);
                testMatheSelf.testGeteilt(zahl1, zahl2);
                testMatheSelf.testMinus(zahl1, zahl2);
                testMatheSelf.testBetrag(zahl1);
                testMatheSelf.testBetrag(zahl2);
            } else if (eingabe.equals("n")) {
                System.out.println("Eingabe der zu testenden Funktion: ");
                System.out.println("Mögliche Auswahl: '+', '-', '/', '*'");
                eingabe = scanner.nextLine();
                switch (eingabe) {
                    case "+" -> testMatheSelf.testPlus(zahl1, zahl2);
                    case "-" -> testMatheSelf.testMinus(zahl1, zahl2);
                    case "/" -> testMatheSelf.testGeteilt(zahl1, zahl2);
                    case "*" -> testMatheSelf.testMal(zahl1, zahl2);
                    default -> System.out.println("Keine gültige Option ausgewählt.");
                }
            } else {
                System.out.println("Falsche Eingabe.");

            }

        }
    }
}