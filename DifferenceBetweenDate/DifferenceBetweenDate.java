import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    // Calcule la durée entre deux heures, toujours positive
    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        if (localTime1 == null || localTime2 == null) return null;
        // Utilise abs() pour s'assurer que la durée est toujours positive
        return Duration.between(localTime1, localTime2).abs();
    }

    // Calcule la période entre deux dates, toujours positive
    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        if (date1 == null || date2 == null) return null;
        // Utilise abs() pour s'assurer que la période est toujours positive
        return Period.between(date1, date2).isNegative() ? Period.between(date2, date1) : Period.between(date1, date2);
    }

    // Calcule le nombre d'heures entre deux DateTimes, toujours positif
    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        if (dateTime1 == null || dateTime2 == null) return null;
        // Utilise abs() pour s'assurer que la durée est toujours positive
        return Math.abs(Duration.between(dateTime1, dateTime2).toHours());
    }

}
