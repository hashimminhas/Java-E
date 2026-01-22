package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayChecker {
    
    public static String checkDayType(LocalDate date) {
        DayOfWeek dayofweek = date.getDayOfWeek();

        switch(dayofweek){
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            case MONDAY:
            case TUESDAY:
            case THURSDAY:
            case FRIDAY:
                return "Weekday";
            case WEDNESDAY:
                return "Hump Day!";
            default:
                return "Weekday";
        }
    }
}