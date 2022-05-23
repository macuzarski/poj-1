package pl.pjait.refactored.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CurrentDate {
    public static String asString() {
        DateTimeFormatter currentMomentString = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDateTime.now().format(currentMomentString);
    }
}
