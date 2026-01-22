# Array Package - Java Sprint Exercises

A collection of Java classes for array manipulation, list operations, and algorithmic problem-solving in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/src/Main.java Exercise/array/*.java

# Run
java -cp out Main
```

## 📁 Project Structure

- **Main.java** - Entry point that runs all tests
- **array/** - Contains 10 sprint package classes + ArrayTester
- **ArrayTester.java** - Comprehensive test suite for all classes

## 📚 Classes Overview

### 1. PrimeFinder
Finds all prime numbers up to a given limit using optimized trial division.
```java
PrimeFinder.findPrimesUpTo(30); // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
```

### 2. ArrayInitializer
Creates arrays filled with sequential integers from 1 to max.
```java
new ArrayInitializer().fillArray(5); // [1, 2, 3, 4, 5]
```

### 3. ArraySorter
Sorts double arrays in ascending order using bubble sort.
```java
new ArraySorter().sortArray({5.5, 2.2, 8.8}); // [2.2, 5.5, 8.8]
```

### 4. ArrayAdder
Concatenates two integer arrays into one.
```java
ArrayAdder.concatArrays({1,2,3}, {4,5,6}); // [1, 2, 3, 4, 5, 6]
```

### 5. ListManipulator
Manipulates string lists: removes last, updates second-to-last, adds "last", sets first to "first".
```java
manipulateList(["A","B","C"]); // ["first", "The size of the list is 2", "last"]
```

### 6. StringConcatenator
Concatenates variable number of strings using varargs.
```java
concatenate("Hello", ", ", "World", "!"); // "Hello, World!"
```

### 7. Combinations
Generates all combinations of n digits (0-9) in ascending order.
```java
combN(3); // ["012", "013", ..., "789"] - 120 combinations
```

### 8. ArrayFilter
Filters 2D array rows where sum ≥ threshold value.
```java
filterBySum({{1,2,3}, {4,5}, {6,7,8,9}}, 10); // {{6,7,8,9}}
```

### 9. ArrayModifier
Removes elements from ArrayList between two indices (inclusive).
```java
removeElementsBetween([1.5,2.5,3.5,4.5,5.5], 2, 4); // [1.5, 2.5]
```

### 10. Transformer
Applies 4-step transformation: remove duplicates → sort descending → modify every 3rd → reverse.
```java
transform({5,2,8,2,9,1,5,7}); // [7, 2, 5, 17, 8, 9]
```

## 🧪 Testing

Run `ArrayTester.testAll()` to execute comprehensive tests for all 10 classes with formatted output showing inputs, outputs, and results.

## 📊 Complexity Summary

| Class | Time | Space |
|-------|------|-------|
| PrimeFinder | O(n√n) | O(π(n)) |
| ArrayInitializer | O(n) | O(n) |
| ArraySorter | O(n²) | O(1) |
| ArrayAdder | O(n+m) | O(n+m) |
| ListManipulator | O(n) | O(1) |
| StringConcatenator | O(n) | O(n) |
| Combinations | O(C(10,n)) | O(C(10,n)) |
| ArrayFilter | O(n×m) | O(k×m) |
| ArrayModifier | O(k) | O(1) |
| Transformer | O(n log n) | O(n) |

## 🛠️ Technologies

- Java 17+
- Collections Framework
- Streams API

## 📝 Notes

- All classes in `sprint` package
- Null-safe implementations
- Clean code with single responsibility principle
- Comprehensive edge case handling

---

# Stream Package - Java Stream API Exercises

A collection of Java classes demonstrating Stream API usage, iterators, and functional programming patterns in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/stream/*.java

# Run the comprehensive test suite
java -cp out sprint.StreamTester
```

## 📁 Project Structure

- **stream/** - Contains 8 sprint package classes + StreamTester
- **StreamTester.java** - Comprehensive test suite for all stream classes

## 📚 Classes Overview

### 1. StreamPolice
Filters non-negative numbers and excludes multiples of 5 that are not multiples of 10.
```java
processNumbers([-10, 15, 20, 30, 8, -3, 5]); // [20, 30, 8]
```
**Stream Operations:** `filter()`, `toList()`

### 2. StringToIntConverter
Converts a list of string numbers to integers using streams.
```java
convertStringListToIntList(["23", "45", "-15"]); // [23, 45, -15]
```
**Stream Operations:** `map()`, `toList()`

### 3. UsernameProcessor
Finds the first username in a list, returns "Anonymous" if empty.
```java
findFirstUsername(["usr", "user12", "test"]); // "usr"
findFirstUsername([]); // "Anonymous"
```
**Stream Operations:** `findFirst()`, `orElse()`

### 4. EmailDomainExtractor
Extracts valid, unique, lowercase email domains from a list.
```java
extractDomains(["USER1@EXAMPLE.COM", "user2@Example.com"]); // ["example.com"]
```
**Stream Operations:** `filter()`, `map()`, `distinct()`, `toList()`

### 5. NumberProcessor
Filters numbers ≥10 and multiplies them all together.
```java
processNumbers([3, 5, 12, 20, 7, 10]); // Optional[2400]
processNumbers([1, 2, 3]); // Optional.empty
```
**Stream Operations:** `filter()`, `reduce()`

### 6. WordLengthAnalyzer
Groups words by length and counts occurrences of each length.
```java
analyzeWordLengths(["apple", "banana", "cherry"]); // {5=2, 6=1}
```
**Stream Operations:** `groupingBy()`, `counting()`, `collectingAndThen()`

### 7. CustomIterator
Manual implementation of the Iterator interface for integer lists.
```java
CustomIterator iterator = new CustomIterator([1, 2, 3]);
while (iterator.hasNext()) { System.out.println(iterator.next()); }
// Output: 1 2 3
```
**Features:** `hasNext()`, `next()`, `NoSuchElementException` handling

### 8. NumberFilter
Generates random numbers and provides multiple filtering operations.
```java
NumberFilter filter = new NumberFilter(100, 12345L);
filter.getAllPrimeNumbers();                    // Returns all primes
filter.getDivisibleBy3ButNot5();                // Divisible by 3, not by 5
filter.getSortedRemainingNumbers();             // Not div by 3 or 5, sorted desc
filter.computeAverageOfRemainingNumbers();      // Average of remaining
```
**Features:** Random generation, prime checking, multiple filters, sorting, averaging

## 🧪 Testing

Run `StreamTester.main()` to execute comprehensive tests for all 8 classes with:
- Multiple test cases per class
- Expected vs actual output comparison
- Formatted test results with pass/fail indicators
- Overall test summary

## 📊 Stream Operations Summary

| Class | Key Stream Operations | Return Type |
|-------|----------------------|-------------|
| StreamPolice | filter() | List<Integer> |
| StringToIntConverter | map() | List<Integer> |
| UsernameProcessor | findFirst(), orElse() | String |
| EmailDomainExtractor | filter(), map(), distinct() | List<String> |
| NumberProcessor | filter(), reduce() | Optional<Integer> |
| WordLengthAnalyzer | groupingBy(), counting() | Map<Integer, Integer> |
| CustomIterator | Manual iteration | Integer (per call) |
| NumberFilter | Traditional loops + sorting | List<Integer> / double |

## 🛠️ Technologies

- Java 17+
- Stream API
- Collections Framework
- Functional Interfaces
- Optional API
- Iterator Pattern

## 💡 Key Concepts Demonstrated

### Intermediate Operations (Lazy)
- `filter()` - Filter elements based on predicate
- `map()` - Transform elements
- `distinct()` - Remove duplicates

### Terminal Operations (Eager)
- `toList()` - Collect to list
- `findFirst()` - Get first element
- `reduce()` - Combine elements
- `forEach()` - Iterate and perform action
- `collect()` - Collect to various data structures

### Advanced Collectors
- `groupingBy()` - Group elements by classifier
- `counting()` - Count elements
- `collectingAndThen()` - Transform collection result

### Functional Programming
- Lambda expressions
- Method references (`::`)
- Optional handling
- Predicate composition

## 📝 Notes

- All classes in `sprint` package
- Stream-based implementations for concise, readable code
- Demonstrates both stream and traditional approaches
- Comprehensive test coverage with edge cases

---

# String-Theory Package - Java String Manipulation & Date/Time Exercises

A collection of Java classes demonstrating method overloading, string operations, date/time handling, and algorithm implementations in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/string-theory/*.java

# Run the comprehensive test suite
java -cp out sprint.StringTheoryTester
```

## 📁 Project Structure

- **string-theory/** - Contains 7 sprint package classes + StringTheoryTester
- **StringTheoryTester.java** - Comprehensive test suite for all string-theory classes

## 📚 Classes Overview

### 1. AreaCalculator
Demonstrates method overloading to calculate areas of different shapes.
```java
calculateArea(5);           // Square: 25.0
calculateArea(5, 10);       // Rectangle: 50.0
calculateArea(7, true);     // Circle: ~153.94
calculateArea(7, false);    // NaN (invalid circle)
```
**Features:** Method overloading with different parameter combinations

### 2. PrimeFinder
Finds all prime numbers up to a specified limit using optimized trial division.
```java
findPrimesUpTo(30); // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
findPrimesUpTo(10); // [2, 3, 5, 7]
```
**Algorithm:** Trial division with √n optimization, skips even numbers

### 3. DayChecker
Checks the type of day for a given LocalDate.
```java
checkDayType(LocalDate.of(2024, 8, 26));  // "Weekday" (Monday)
checkDayType(LocalDate.of(2024, 8, 28));  // "Hump Day!" (Wednesday)
checkDayType(LocalDate.of(2024, 8, 31));  // "Weekend" (Saturday)
```
**Features:** Switch statement, DayOfWeek enum, special Wednesday handling

### 4. WeekendCalculator
Counts weekend days (Saturday & Sunday) in a date range using streams.
```java
WeekendCalculator calculator = new WeekendCalculator();
calculator.countWeekendDays(
    LocalDate.of(2024, 8, 1), 
    LocalDate.of(2024, 8, 31)
); // Returns: 10
```
**Features:** Stream API, datesUntil(), DayOfWeek filtering

### 5. PalindromeChecker
Checks if a string is a palindrome, ignoring punctuation and case.
```java
isPalindrome("A man, a plan, a canal, Panama");  // true
isPalindrome("Hello, World!");                    // false
isPalindrome("racecar");                          // true
```
**Features:** Regex cleaning, case normalization, StringBuilder reversal

### 6. AnagramChecker
Checks if two strings are anagrams by comparing sorted characters.
```java
areAnagrams("Listen", "Silent");  // true
areAnagrams("Listen", "Hello");   // false
```
**Features:** Character array sorting, case-insensitive comparison, null handling

### 7. CalendarBuilder
Builds a formatted calendar string for a given month and year.
```java
buildCalendar("August", 2024);
// Output:
// AUGUST 2024
// Mon Tue Wed Thu Fri Sat Sun
//            1   2  3  4
//   5  6  7  8  9 10 11
//  12 13 14 15 16 17 18
//  ...
```
**Features:** YearMonth API, dynamic day positioning, formatted output

## 🧪 Testing

Run `StringTheoryTester.main()` to execute comprehensive tests for all 7 classes with:
- Multiple test cases per class (22 total tests)
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
