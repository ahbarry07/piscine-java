import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        String heure = "";
        String periode = "";
        String minute = "";
        String seconde = "";
        String[] tab = stringDate.split(" ");

        for(int i = 0; i < tab.length; i++){
            
            if (tab[i].contains("heures")){
                heure = tab[i-1];
                periode = tab[i+2];
            }else if(tab[i].contains("minutes")){
                minute = tab[i-1];
            }else if(tab[i].contains("secondes")){
                seconde = tab[i-1];
            }
        }
        int minutes = Integer.parseInt(minute);
        int seconds = Integer.parseInt(seconde);
        int hours = periode.contains("soir") ? Integer.parseInt(heure) + 12 : Integer.parseInt(heure);
        return LocalTime.of(hours, minutes, seconds);
    }


    public static void main(String[] args) {
        System.out.println(parseIsoFormat("2022-04-25T20:51:28.709039322"));
        System.out.println(parseFullTextFormat("lundi 25 avril 2022"));
        System.out.println(parseTimeFormat("09 heures du soir, 07 minutes et 23 secondes"));
    }
}