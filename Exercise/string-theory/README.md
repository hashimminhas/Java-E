# String-Theory Package - Java String Manipulation & Date/Time Exercises

A collection of Java classes demonstrating method overloading, string operations, date/time handling, and algorithm implementations in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/string-theory/*.java

# Run the comprehensive test suite
java -cp out sprint.StringTheoryTester
```

## 📚 Exercise Questions

### 1. AreaCalculator
**Question:** Demonstrate method overloading by calculating areas of different shapes: square, rectangle, and circle.

**Requirements:**
- Overload `calculateArea()` method with different parameter combinations
- Square: `calculateArea(int side)` → side²
- Rectangle: `calculateArea(int length, int width)` → length × width
- Circle: `calculateArea(int radius, boolean isCircle)` → π × radius² (if isCircle is true)
- Return NaN for invalid circle (isCircle = false)

**Example:**
```java
calculateArea(5);           // Square: 25.0
calculateArea(5, 10);       // Rectangle: 50.0
calculateArea(7, true);     // Circle: ~153.94
calculateArea(7, false);    // NaN (invalid circle)
```

**Features:** Method overloading with different parameter combinations

---

### 2. PrimeFinder
**Question:** Find all prime numbers up to a specified limit using optimized trial division algorithm.

**Requirements:**
- Implement trial division with √n optimization
- Skip even numbers (except 2)
- Return List<Integer> of all primes
- Handle edge cases (negative, zero, one)

**Example:**
```java
findPrimesUpTo(30); // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
findPrimesUpTo(10); // [2, 3, 5, 7]
```

**Algorithm:** Trial division with √n optimization, skips even numbers

---

### 3. DayChecker
**Question:** Check the type of day for a given LocalDate (Weekday, Weekend, or special Hump Day for Wednesday).

**Requirements:**
- Accept LocalDate as parameter
- Return "Weekday" for Monday, Tuesday, Thursday, Friday
- Return "Hump Day!" for Wednesday
- Return "Weekend" for Saturday and Sunday
- Use Switch statement and DayOfWeek enum

**Example:**
```java
checkDayType(LocalDate.of(2024, 8, 26));  // "Weekday" (Monday)
checkDayType(LocalDate.of(2024, 8, 28));  // "Hump Day!" (Wednesday)
checkDayType(LocalDate.of(2024, 8, 31));  // "Weekend" (Saturday)
```

**Features:** Switch statement, DayOfWeek enum, special Wednesday handling

---

### 4. WeekendCalculator
**Question:** Count the number of weekend days (Saturday & Sunday) in a given date range using streams.

**Requirements:**
- Accept start and end LocalDate parameters
- Use Stream API with datesUntil()
- Filter for Saturday and Sunday
- Return long count of weekend days

**Example:**
```java
WeekendCalculator calculator = new WeekendCalculator();
calculator.countWeekendDays(
    LocalDate.of(2024, 8, 1), 
    LocalDate.of(2024, 8, 31)
); // Returns: 10
```

**Features:** Stream API, datesUntil(), DayOfWeek filtering

---

### 5. PalindromeChecker
**Question:** Check if a string is a palindrome, ignoring punctuation, spaces, and case.

**Requirements:**
- Remove all non-alphanumeric characters using regex
- Convert to lowercase for case-insensitive comparison
- Compare string with its reverse
- Return boolean
- Handle null and empty strings

**Example:**
```java
isPalindrome("A man, a plan, a canal, Panama");  // true
isPalindrome("Hello, World!");                    // false
isPalindrome("racecar");                          // true
```

**Features:** Regex cleaning, case normalization, StringBuilder reversal

---

### 6. AnagramChecker
**Question:** Check if two strings are anagrams by comparing their sorted characters.

**Requirements:**
- Convert both strings to lowercase
- Convert to character arrays
- Sort both arrays
- Compare sorted arrays
- Handle null inputs

**Example:**
```java
areAnagrams("Listen", "Silent");  // true
areAnagrams("Listen", "Hello");   // false
```

**Features:** Character array sorting, case-insensitive comparison, null handling

---

### 7. CalendarBuilder
**Question:** Build a formatted calendar string for a given month and year.

**Requirements:**
- Accept month name (String) and year (int)
- Generate calendar header with month and year
- Display day names (Mon to Sun)
- Calculate first day of month position
- Format dates with proper spacing
- Handle leap years automatically

**Example:**
```java
buildCalendar("August", 2024);
// Output:
// AUGUST 2024
// Mon Tue Wed Thu Fri Sat Sun
//            1   2  3  4
//   5  6  7  8  9 10 11
//  12 13 14 15 16 17 18
//  19 20 21 22 23 24 25
//  26 27 28 29 30 31
```

**Features:** YearMonth API, dynamic day positioning, formatted output

---

## 🧪 Testing

Run `StringTheoryTester.main()` to execute comprehensive tests for all 7 classes with:
- 25+ total test cases
- Expected vs actual output comparison
- Formatted test results with pass/fail indicators
- Calendar visualization
- Edge case validation (null, empty, leap years)

## 📊 Class Features Summary

| Class | Key Technology | Input | Output |
|-------|---------------|-------|--------|
| AreaCalculator | Method Overloading | double/boolean | double |
| PrimeFinder | Algorithm | int limit | List<Integer> |
| DayChecker | Switch/Enum | LocalDate | String |
| WeekendCalculator | Stream API | Date Range | long |
| PalindromeChecker | Regex/StringBuilder | String | boolean |
| AnagramChecker | Array Sorting | String, String | boolean |
| CalendarBuilder | StringBuilder/YearMonth | String, int | String |

## 🛠️ Technologies

- Java 17+
- Java Time API (LocalDate, YearMonth, DayOfWeek)
- StringBuilder for string manipulation
- Regular Expressions
- Arrays utility class
- Method Overloading

## 💡 Key Concepts Demonstrated

### Method Overloading
- Same method name with different parameters
- Different return types based on input
- Type-based method resolution

### Date/Time API
- `LocalDate` - Date without time zone
- `YearMonth` - Month and year handling
- `DayOfWeek` - Day enumeration
- `datesUntil()` - Stream of dates in range

### String Manipulation
- Regular expressions for cleaning
- `StringBuilder` for efficient string building
- Character array operations
- Case normalization

### Algorithms
- Prime number detection (trial division)
- Palindrome verification (reversal)
- Anagram detection (sorting)
- Calendar layout calculation

## 📝 Notes

- All classes in `sprint` package
- Comprehensive null safety checks
- Edge case handling (leap years, empty strings, etc.)
- Clean, readable implementations
- Test coverage for all methods
