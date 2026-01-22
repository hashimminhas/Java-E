package sprint;

import java.time.LocalDate;
import java.util.List;

/**
 * StringTheoryTester - Comprehensive test suite for all string-theory package classes
 * 
 * This class tests all 7 string-theory classes with various test cases:
 * 1. AreaCalculator
 * 2. PrimeFinder
 * 3. DayChecker
 * 4. WeekendCalculator
 * 5. PalindromeChecker
 * 6. AnagramChecker
 * 7. CalendarBuilder
 */
public class StringTheoryTester {

    private static int testsPassed = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║     STRING-THEORY PACKAGE - COMPREHENSIVE TEST SUITE          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        testAreaCalculator();
        testPrimeFinder();
        testDayChecker();
        testWeekendCalculator();
        testPalindromeChecker();
        testAnagramChecker();
        testCalendarBuilder();

        printSummary();
    }

    // ======================== TEST 1: AreaCalculator ========================
    private static void testAreaCalculator() {
        printTestHeader("1. AreaCalculator - Method Overloading for Different Shapes");
        
        // Test Case 1: Square
        double squareArea = AreaCalculator.calculateArea(5);
        System.out.println("Square (side=5):");
        System.out.println("Output:   " + squareArea);
        System.out.println("Expected: 25.0");
        checkTest(squareArea == 25.0);
        
        // Test Case 2: Rectangle
        double rectangleArea = AreaCalculator.calculateArea(5, 10);
        System.out.println("\nRectangle (length=5, width=10):");
        System.out.println("Output:   " + rectangleArea);
        System.out.println("Expected: 50.0");
        checkTest(rectangleArea == 50.0);
        
        // Test Case 3: Circle (valid)
        double circleArea = AreaCalculator.calculateArea(7, true);
        System.out.println("\nCircle (radius=7, isCircle=true):");
        System.out.println("Output:   " + circleArea);
        System.out.println("Expected: ~153.94");
        checkTest(Math.abs(circleArea - 153.938) < 0.01);
        
        // Test Case 4: Circle (invalid - boolean false)
        double invalidCircleArea = AreaCalculator.calculateArea(7, false);
        System.out.println("\nCircle (radius=7, isCircle=false):");
        System.out.println("Output:   " + invalidCircleArea);
        System.out.println("Expected: NaN");
        checkTest(Double.isNaN(invalidCircleArea));
        
        System.out.println();
    }

    // ======================== TEST 2: PrimeFinder ========================
    private static void testPrimeFinder() {
        printTestHeader("2. PrimeFinder - Find All Prime Numbers Up To Limit");
        
        // Test Case 1
        int limit1 = 30;
        List<Integer> primes1 = PrimeFinder.findPrimesUpTo(limit1);
        System.out.println("Limit:    " + limit1);
        System.out.println("Output:   " + primes1);
        System.out.println("Expected: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]");
        checkTest(primes1.toString().equals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]"));
        
        // Test Case 2
        int limit2 = 10;
        List<Integer> primes2 = PrimeFinder.findPrimesUpTo(limit2);
        System.out.println("\nLimit:    " + limit2);
        System.out.println("Output:   " + primes2);
        System.out.println("Expected: [2, 3, 5, 7]");
        checkTest(primes2.toString().equals("[2, 3, 5, 7]"));
        
        // Test Case 3
        int limit3 = 1;
        List<Integer> primes3 = PrimeFinder.findPrimesUpTo(limit3);
        System.out.println("\nLimit:    " + limit3);
        System.out.println("Output:   " + primes3);
        System.out.println("Expected: []");
        checkTest(primes3.isEmpty());
        
        System.out.println();
    }

    // ======================== TEST 3: DayChecker ========================
    private static void testDayChecker() {
        printTestHeader("3. DayChecker - Check Day Type (Weekday/Weekend/Hump Day)");
        
        // Test Case 1: Weekday (Monday)
        LocalDate weekdayDate = LocalDate.of(2024, 8, 26); // Monday
        String result1 = DayChecker.checkDayType(weekdayDate);
        System.out.println("Date:     " + weekdayDate + " (Monday)");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: Weekday");
        checkTest(result1.equals("Weekday"));
        
        // Test Case 2: Weekend (Saturday)
        LocalDate weekendDate = LocalDate.of(2024, 8, 31); // Saturday
        String result2 = DayChecker.checkDayType(weekendDate);
        System.out.println("\nDate:     " + weekendDate + " (Saturday)");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: Weekend");
        checkTest(result2.equals("Weekend"));
        
        // Test Case 3: Hump Day (Wednesday)
        LocalDate wednesdayDate = LocalDate.of(2024, 8, 28); // Wednesday
        String result3 = DayChecker.checkDayType(wednesdayDate);
        System.out.println("\nDate:     " + wednesdayDate + " (Wednesday)");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: Hump Day!");
        checkTest(result3.equals("Hump Day!"));
        
        // Test Case 4: Weekend (Sunday)
        LocalDate sundayDate = LocalDate.of(2024, 9, 1); // Sunday
        String result4 = DayChecker.checkDayType(sundayDate);
        System.out.println("\nDate:     " + sundayDate + " (Sunday)");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: Weekend");
        checkTest(result4.equals("Weekend"));
        
        System.out.println();
    }

    // ======================== TEST 4: WeekendCalculator ========================
    private static void testWeekendCalculator() {
        printTestHeader("4. WeekendCalculator - Count Weekend Days in Date Range");
        
        WeekendCalculator calculator = new WeekendCalculator();
        
        // Test Case 1: August 2024 (full month)
        LocalDate startDate1 = LocalDate.of(2024, 8, 1);
        LocalDate endDate1 = LocalDate.of(2024, 8, 31);
        long weekendDayCount1 = calculator.countWeekendDays(startDate1, endDate1);
        System.out.println("Range:    " + startDate1 + " to " + endDate1);
        System.out.println("Output:   " + weekendDayCount1 + " weekend days");
        System.out.println("Expected: 9 (Aug has 4 Saturdays, 5 Sundays, but starts Thu)");
        checkTest(weekendDayCount1 == 9);
        
        // Test Case 2: One week
        LocalDate startDate2 = LocalDate.of(2024, 8, 26); // Monday
        LocalDate endDate2 = LocalDate.of(2024, 9, 1);    // Sunday
        long weekendDayCount2 = calculator.countWeekendDays(startDate2, endDate2);
        System.out.println("\nRange:    " + startDate2 + " to " + endDate2);
        System.out.println("Output:   " + weekendDayCount2 + " weekend days");
        System.out.println("Expected: 2 (Sat 8/31, Sun 9/1)");
        checkTest(weekendDayCount2 == 2);
        
        // Test Case 3: Single day (weekday)
        LocalDate startDate3 = LocalDate.of(2024, 8, 26);
        LocalDate endDate3 = LocalDate.of(2024, 8, 26);
        long weekendDayCount3 = calculator.countWeekendDays(startDate3, endDate3);
        System.out.println("\nRange:    " + startDate3 + " to " + endDate3);
        System.out.println("Output:   " + weekendDayCount3 + " weekend days");
        System.out.println("Expected: 0");
        checkTest(weekendDayCount3 == 0);
        
        System.out.println();
    }

    // ======================== TEST 5: PalindromeChecker ========================
    private static void testPalindromeChecker() {
        printTestHeader("5. PalindromeChecker - Check if String is Palindrome");
        
        // Test Case 1: Valid palindrome with punctuation
        String testString1 = "A man, a plan, a canal, Panama";
        boolean result1 = PalindromeChecker.isPalindrome(testString1);
        System.out.println("Input:    \"" + testString1 + "\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: true");
        checkTest(result1 == true);
        
        // Test Case 2: Not a palindrome
        String testString2 = "Hello, World!";
        boolean result2 = PalindromeChecker.isPalindrome(testString2);
        System.out.println("\nInput:    \"" + testString2 + "\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: false");
        checkTest(result2 == false);
        
        // Test Case 3: Simple palindrome
        String testString3 = "racecar";
        boolean result3 = PalindromeChecker.isPalindrome(testString3);
        System.out.println("\nInput:    \"" + testString3 + "\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: true");
        checkTest(result3 == true);
        
        // Test Case 4: Empty string
        String testString4 = "";
        boolean result4 = PalindromeChecker.isPalindrome(testString4);
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: true");
        checkTest(result4 == true);
        
        System.out.println();
    }

    // ======================== TEST 6: AnagramChecker ========================
    private static void testAnagramChecker() {
        printTestHeader("6. AnagramChecker - Check if Two Strings are Anagrams");
        
        // Test Case 1: Valid anagrams
        String string1 = "Listen";
        String string2 = "Silent";
        boolean result1 = AnagramChecker.areAnagrams(string1, string2);
        System.out.println("String 1: \"" + string1 + "\"");
        System.out.println("String 2: \"" + string2 + "\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: true");
        checkTest(result1 == true);
        
        // Test Case 2: Not anagrams
        String string3 = "Listen";
        String string4 = "Hello";
        boolean result2 = AnagramChecker.areAnagrams(string3, string4);
        System.out.println("\nString 1: \"" + string3 + "\"");
        System.out.println("String 2: \"" + string4 + "\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: false");
        checkTest(result2 == false);
        
        // Test Case 3: Valid anagrams (different case)
        String string5 = "Dormitory";
        String string6 = "Dirty room";
        boolean result3 = AnagramChecker.areAnagrams(string5, string6);
        System.out.println("\nString 1: \"" + string5 + "\"");
        System.out.println("String 2: \"" + string6 + "\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: false (space counts)");
        checkTest(result3 == false);
        
        // Test Case 4: Null check
        boolean result4 = AnagramChecker.areAnagrams(null, "test");
        System.out.println("\nString 1: null");
        System.out.println("String 2: \"test\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: false");
        checkTest(result4 == false);
        
        System.out.println();
    }

    // ======================== TEST 7: CalendarBuilder ========================
    private static void testCalendarBuilder() {
        printTestHeader("7. CalendarBuilder - Build Calendar for Given Month/Year");
        
        // Test Case 1: August 2024
        String calendar1 = CalendarBuilder.buildCalendar("August", 2024);
        System.out.println("Input:    August 2024");
        System.out.println("Output:\n" + calendar1);
        checkTest(calendar1.contains("AUGUST 2024") && calendar1.contains("Mon Tue Wed Thu Fri Sat Sun"));
        
        // Test Case 2: February 2024 (leap year)
        String calendar2 = CalendarBuilder.buildCalendar("February", 2024);
        System.out.println("\nInput:    February 2024 (leap year)");
        System.out.println("Output:\n" + calendar2);
        checkTest(calendar2.contains("FEBRUARY 2024") && calendar2.contains("29"));
        
        // Test Case 3: January 2025
        String calendar3 = CalendarBuilder.buildCalendar("January", 2025);
        System.out.println("\nInput:    January 2025");
        System.out.println("Output:\n" + calendar3);
        checkTest(calendar3.contains("JANUARY 2025"));
        
        System.out.println();
    }

    // ======================== HELPER METHODS ========================
    
    private static void printTestHeader(String title) {
        System.out.println("┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ " + title);
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
    }

    private static void checkTest(boolean passed) {
        if (passed) {
            System.out.println("✓ PASSED");
            testsPassed++;
        } else {
            System.out.println("✗ FAILED");
            testsFailed++;
        }
    }

    private static void printSummary() {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                        TEST SUMMARY                            ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.printf("║  Total Tests: %-6d                                         ║%n", 
                          testsPassed + testsFailed);
        System.out.printf("║  Passed:      %-6d ✓                                      ║%n", 
                          testsPassed);
        System.out.printf("║  Failed:      %-6d ✗                                      ║%n", 
                          testsFailed);
        System.out.println("╚════════════════════════════════════════════════════════════════╝");
    }
}
