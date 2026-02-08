# Stream Package - Java Stream API Exercises

A collection of Java classes demonstrating Stream API usage, iterators, and functional programming patterns in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/stream/*.java

# Run the comprehensive test suite
java -cp out sprint.StreamTester
```

## 📚 Exercise Questions

### 1. StreamPolice
**Question:** Filter a list to include only non-negative numbers and exclude multiples of 5 that are not multiples of 10.

**Requirements:**
- Filter out negative numbers
- Include multiples of 10
- Exclude multiples of 5 that are not multiples of 10
- Use Stream API with filter() operation
- Return as List<Integer>

**Example:**
```java
processNumbers([-10, 15, 20, 30, 8, -3, 5]); // [20, 30, 8]
```

**Stream Operations:** `filter()`, `toList()`

---

### 2. StringToIntConverter
**Question:** Convert a list of string numbers to integers using streams.

**Requirements:**
- Parse each string to integer
- Use Stream API with map() operation
- Handle invalid number formats gracefully
- Return List<Integer>

**Example:**
```java
convertStringListToIntList(["23", "45", "-15"]); // [23, 45, -15]
```

**Stream Operations:** `map()`, `toList()`

---

### 3. UsernameProcessor
**Question:** Find the first username in a list, return "Anonymous" if the list is empty.

**Requirements:**
- Find the first element in the list
- Return "Anonymous" if list is empty or null
- Use Stream API with findFirst() and orElse()
- Return String

**Example:**
```java
findFirstUsername(["usr", "user12", "test"]); // "usr"
findFirstUsername([]); // "Anonymous"
```

**Stream Operations:** `findFirst()`, `orElse()`

---

### 4. EmailDomainExtractor
**Question:** Extract valid, unique, lowercase email domains from a list.

**Requirements:**
- Validate email format (contains '@')
- Extract domain part (after '@')
- Convert to lowercase
- Remove duplicates
- Use Stream API operations
- Return List<String>

**Example:**
```java
extractDomains(["USER1@EXAMPLE.COM", "user2@Example.com"]); // ["example.com"]
```

**Stream Operations:** `filter()`, `map()`, `distinct()`, `toList()`

---

### 5. NumberProcessor
**Question:** Filter numbers ≥10 from a list and multiply them all together.

**Requirements:**
- Filter numbers that are 10 or greater
- Multiply all filtered numbers
- Return Optional<Integer> (empty if no numbers ≥10)
- Use Stream API with filter() and reduce()

**Example:**
```java
processNumbers([3, 5, 12, 20, 7, 10]); // Optional[2400]
processNumbers([1, 2, 3]); // Optional.empty
```

**Stream Operations:** `filter()`, `reduce()`

---

### 6. WordLengthAnalyzer
**Question:** Group words by their length and count the occurrences of each length.

**Requirements:**
- Calculate length of each word
- Group by length as key
- Count how many words have each length
- Return Map<Integer, Integer> (length → count)
- Use advanced collectors

**Example:**
```java
analyzeWordLengths(["apple", "banana", "cherry"]); // {5=2, 6=1}
```

**Stream Operations:** `groupingBy()`, `counting()`, `collectingAndThen()`

---

### 7. CustomIterator
**Question:** Implement a manual Iterator interface for integer lists without using built-in iterators.

**Requirements:**
- Implement Iterator<Integer> interface
- Provide hasNext() method
- Provide next() method
- Throw NoSuchElementException when no more elements
- Track current position manually

**Example:**
```java
CustomIterator iterator = new CustomIterator([1, 2, 3]);
while (iterator.hasNext()) { 
    System.out.println(iterator.next()); 
}
// Output: 1 2 3
```

**Features:** `hasNext()`, `next()`, `NoSuchElementException` handling

---

### 8. NumberFilter
**Question:** Generate random numbers and provide multiple filtering operations: find primes, find numbers divisible by 3 but not 5, sort remaining numbers, and compute their average.

**Requirements:**
- Generate specified count of random numbers
- Method 1: Find all prime numbers
- Method 2: Find numbers divisible by 3 but not 5
- Method 3: Get remaining numbers (not div by 3 or 5), sorted descending
- Method 4: Compute average of remaining numbers
- All operations should work on the same generated list

**Example:**
```java
NumberFilter filter = new NumberFilter(100, 12345L);
filter.getAllPrimeNumbers();                    // Returns all primes
filter.getDivisibleBy3ButNot5();                // Divisible by 3, not by 5
filter.getSortedRemainingNumbers();             // Not div by 3 or 5, sorted desc
filter.computeAverageOfRemainingNumbers();      // Average of remaining
```

**Features:** Random generation, prime checking, multiple filters, sorting, averaging

---

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
