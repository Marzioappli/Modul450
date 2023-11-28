# Modul450

# Aufgabenpaket 1

## Aufgabe 1
### Welche Formen von Tests kennen Sie aus der Informatik?
1. Unit Tests <br>
2. Integrationstest <br>
3. Akzeptanztests
### Wie werden die Tests durchgeführt?
Tests werden entweder von einem Tester durch Ausprobieren der Software gemacht oder automatisch mit vorbereiteten Anweisungen. Manchmal erkunden Tester spontan die Software, um Probleme zu finden. Bei der Testentwicklung schreiben Entwickler Tests, bevor sie den eigentlichen Code erstellen. In manchen Fällen arbeiten zwei Personen zusammen, um Tests durchzuführen. Egal, wie es gemacht wird, klare Ziele werden gesetzt, Ergebnisse werden notiert, und Tests werden regelmäßig wiederholt, um sicherzustellen, dass die Software gut funktioniert.

## Aufgabe 2
**Beispiel eines Software-Fehlers:**
Denk dir eine Online-Shop-Seite vor, bei der der "Bezahlen"-Button nicht richtig funktioniert. Kunden können ihre Bestellungen nicht abschließen, was zu Frustration führt.<br><br>

**Beispiel eines Software-Mangels:**
Stell dir vor, du verwendest eine Projektmanagement-Software, die keine Funktion für automatische Meilenstein-Updates hat. Das bedeutet, dass du manuell aktualisieren musst, was zeitaufwendig und ineffizient ist.<br><br>

**Beispiel für hohen Schaden bei einem Software-Fehler:**
In einem medizinischen Software-System kann ein Fehler dazu führen, dass Patientendaten falsch interpretiert werden. Das könnte zu falschen Diagnosen und Behandlungen führen, was nicht nur das Vertrauen in die medizinische Versorgung beeinträchtigt, sondern auch das Leben der Patienten gefährdet.<br><br>

### Aufgabe 3

**Siehe Code. Ubung1 Ordner**

# Arbeitspaket 2

### Aufgabe 1

#### Abstrankte Testfälle

| Testfall | Beschreibung                          | Erwartetes Ergebnis |
|----------|--------------------------------------|----------------------|
| 1        | Kaufpreis < 15’000 CHF               | Kein Rabatt          |
| 2        | 15’000 CHF <= Kaufpreis <= 20’000 CHF | 5% Rabatt           |
| 3        | 20’000 CHF < Kaufpreis <= 25’000 CHF  | 7% Rabatt           |
| 4        | Kaufpreis > 25’000 CHF               | 8,5% Rabatt         |

#### Konkrete Testfälle

| Testfall | Kaufpreis | Erwartetes Ergebnis |
|----------|-----------|----------------------|
| 1        | 10’000 CHF | Kein Rabatt          |
| 2        | 17’500 CHF | 5% Rabatt            |
| 3        | 23’000 CHF | 7% Rabatt            |
| 4        | 30’000 CHF | 8,5% Rabatt          |


### Aufgabe 2


| ID  | Beschreibung                              | Erwartetes Resultat                               | Effektives Resultat                               | Status | Mögliche Ursache                               |
| --- | ----------------------------------------- | -------------------------------------------------- | --------------------------------------------------- | ------ | ----------------------------------------------- |
| 1   | Anmeldung und Anzeige verfügbarer Autos    | Nach erfolgreicher Anmeldung werden verfügbare Autos angezeigt. | Fehlermeldung oder leere Anzeige                  | Fehler | Authentifizierung oder Datenbankzugriff fehlgeschlagen |
| 2   | Buchung eines Fahrzeugs                   | Nach Auswahl und Bestätigung eines Autos wird die Buchung erfolgreich abgeschlossen. | Fehlermeldung oder Buchung wird nicht gespeichert | Fehler | Probleme mit der Buchungsfunktionalität oder Datenbank |
| 3   | Preisberechnung für Buchung                | Der angezeigte Preis für die Buchung entspricht der erwarteten Berechnung basierend auf Mietdauer, Fahrzeugtyp usw. | Falscher Preis oder keine Preisangabe            | Fehler | Fehlerhafte Berechnung oder fehlende Preisinformationen |
| 4   | Stornierung einer Buchung                 | Nach Stornierung einer Buchung wird das Fahrzeug wieder als verfügbar markiert, und der Buchungsbetrag wird zurückerstattet. | Fehlermeldung oder keine Aktualisierung der Verfügbarkeit | Fehler | Probleme mit der Stornierungsfunktionalität oder Datenbank |
| 5   | Zahlungsvorgang für eine Buchung           | Nach Eingabe der Zahlungsinformationen wird die Zahlung erfolgreich abgeschlossen. | Fehlermeldung oder keine Bestätigung der Zahlung | Fehler | Probleme mit der Zahlungsabwicklung oder externem Zahlungsdienst |
