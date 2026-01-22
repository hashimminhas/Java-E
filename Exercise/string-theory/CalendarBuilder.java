package sprint;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class CalendarBuilder {

    public static String buildCalendar(String month, int year) {
        StringBuilder calendar = new StringBuilder();

        // Add header with month and year
        calendar.append(month.toUpperCase()).append(" ").append(year).append("\n");

        // Add day headers
        calendar.append("Mon Tue Wed Thu Fri Sat Sun\n");

        // Get the first day of the month
        Month monthEnum = Month.valueOf(month.toUpperCase());
        YearMonth yearMonth = YearMonth.of(year, monthEnum);
        LocalDate firstDay = yearMonth.atDay(1);
        int daysInMonth = yearMonth.lengthOfMonth();

        // Get the day of week for the first day (1 = Monday, 7 = Sunday)
        int startDayOfWeek = firstDay.getDayOfWeek().getValue();

        // Add leading spaces for days before the first day
        for (int i = 1; i < startDayOfWeek; i++) {
            calendar.append("    "); // 4 spaces for empty day
        }
        // Add all days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Format the day with appropriate leading spaces
            if (day < 10) {
                calendar.append("  ").append(day); // 2 leading spaces for single digit
            } else {
                calendar.append(" ").append(day); // 1 leading space for double digit
            }

            // Calculate current day of week (1 = Monday, 7 = Sunday)
            int currentDayOfWeek = (startDayOfWeek + day - 1) % 7;
            if (currentDayOfWeek == 0) {
                currentDayOfWeek = 7; // Sunday
            }

            // Add space after day, except at end of week or end of month
            if (currentDayOfWeek != 7 && day != daysInMonth) {
                calendar.append(" ");
            }

            // Add newline at end of week or end of month
            if (currentDayOfWeek == 7 && day != daysInMonth) {
                calendar.append("\n");
            }
        }

        return calendar.toString();
    }

}
