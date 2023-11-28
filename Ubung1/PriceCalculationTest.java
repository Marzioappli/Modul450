// Klasse für den Test der Preisberechnung
public class PriceCalculationTest {

    // Hauptmethode für den Test
    public static void main(String[] args) {
        // Testergebnis abrufen und ausgeben
        boolean testResult = testCalculatePrice();
        System.out.println("Test calculatePrice: " + (testResult ? "Bestanden" : "Fehlgeschlagen"));
    }

    // Methode zum Durchführen des Tests der Preisberechnung
    private static boolean testCalculatePrice() {
        // Testdaten
        double grundpreis = 1000.0;
        double spezialpreis = 50.0;
        double extrapreis = 200.0;
        int extras = 4;
        double rabatt = 5.0;

        // Erwartetes Ergebnis basierend auf der bereitgestellten Formel
        double erwartetesErgebnis = calculateExpectedResult(grundpreis, spezialpreis, extrapreis, extras, rabatt);

        // Tatsächliches Ergebnis aus der zu testenden Funktion abrufen
        double tatsächlichesErgebnis = calculatePrice(grundpreis, spezialpreis, extrapreis, extras, rabatt);

        // Überprüfen, ob der berechnete Preis mit einer Toleranz dem erwarteten Ergebnis entspricht
        boolean testBestanden = Math.abs(erwartetesErgebnis - tatsächlichesErgebnis) < 0;

        // Details des Tests ausgeben
        System.out.println("Testdaten:");
        System.out.println("Grundpreis: " + grundpreis);
        System.out.println("Spezialpreis: " + spezialpreis);
        System.out.println("Extrapreis: " + extrapreis);
        System.out.println("Extras: " + extras);
        System.out.println("Rabatt: " + rabatt);
        System.out.println("Erwartetes Ergebnis: " + erwartetesErgebnis);
        System.out.println("Tatsächliches Ergebnis: " + tatsächlichesErgebnis);
        System.out.println("Testergebnis: " + (testBestanden ? "Bestanden" : "Fehlgeschlagen"));

        return testBestanden;
    }

    // Methode zur Berechnung des erwarteten Ergebnisses
    private static double calculateExpectedResult(double grundpreis, double spezialpreis, double extrapreis, int extras, double rabatt) {
        double zusatzrabatt = 0;

        if (extras >= 3)
            zusatzrabatt = 10;
        else if (extras >= 5)
            zusatzrabatt = 15;

        if (rabatt > zusatzrabatt)
            zusatzrabatt = rabatt;

        return grundpreis / 100.0 * (100 - rabatt) + spezialpreis
                + extrapreis / 100.0 * (100 - zusatzrabatt);
    }

    // Methode zur Berechnung des Preises
    private static double calculatePrice(double grundpreis, double spezialpreis, double extrapreis, int extras, double rabatt) {
        double zusatzrabatt;

        if (extras >= 3)
            zusatzrabatt = 10;
        else if (extras >= 5)
            zusatzrabatt = 15;
        else
            zusatzrabatt = 0;

        if (rabatt > zusatzrabatt)
            zusatzrabatt = rabatt;

        return grundpreis / 100.0 * (100 - rabatt) + spezialpreis
                + extrapreis / 100.0 * (100 - zusatzrabatt);
    }
}