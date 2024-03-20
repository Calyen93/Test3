/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
Crea un metodo che dalla stringa ti ritorna un'altra stringa formattata
come richiesto e scrivi dei test per quello*/


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
    }

    public static String date(String dateString){
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return formatter.format(offsetDateTime);
    }

}