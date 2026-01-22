package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCalculator {
    
    public long  countWeekendDays(LocalDate starDate, LocalDate endDate){
        return starDate.datesUntil(endDate.plusDays(1))
        .filter(date -> {
            DayOfWeek day = date.getDayOfWeek();
            return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;

            
        })
        .count();
    }
}