# Exam Package - Java Challenge Problems

A collection of Java classes demonstrating solutions to common programming interview challenges and coding exam problems.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/Exam/*.java

# Run the comprehensive test suite
java -cp out ExamTester
```

## 📚 Exercise Questions

### 1. CountUpper
**Question:** Count the number of uppercase Latin letters (A-Z) in a string.

**Difficulty:** ⭐ Easy

**Requirements:**
- Count only uppercase letters from A to Z
- Ignore lowercase letters, numbers, and special characters
- Handle null and empty strings (return 0)
- Use character range checking

**Example:**
```java
CountUpper counter = new CountUpper();
counter.countChars("Hello World");     // 2 (H, W)
counter.countChars("HELLO");           // 5
counter.countChars("hello");           // 0
```

**Features:** Character range checking, null/empty handling

**Time Complexity:** O(n)  
**Key Skill:** Character filtering

---

### 2. CharOccurrences
**Question:** Count the occurrences of a specific character in a string.

**Difficulty:** ⭐ Easy

**Requirements:**
- Count how many times a given character appears
- Case-sensitive comparison
- Handle null and empty strings (return 0)
- Character-by-character comparison

**Example:**
```java
CharOccurrences counter = new CharOccurrences();
counter.countChars("hello world", 'l');  // 3
counter.countChars("hello world", 'o');  // 2
counter.countChars("hello world", 'z');  // 0
```

**Features:** Character-by-character comparison, case-sensitive

**Time Complexity:** O(n)  
**Key Skill:** Linear search

---

### 3. Cursor
**Question:** Track cursor position after a series of directional movements (L, R, U, D) on a 2D coordinate plane.

**Difficulty:** ⭐⭐ Medium

**Requirements:**
- Parse starting coordinates in format "(x,y)"
- Process movement commands:
  - 'L' = left (x - 1)
  - 'R' = right (x + 1)
  - 'U' = up (y + 1)
  - 'D' = down (y + 1)
- Return final coordinates in format "(x,y)"
- Handle invalid movements gracefully

**Example:**
```java
Cursor cursor = new Cursor();
cursor.getCoords("(0,0)", "RRR");           // "(3,0)"
cursor.getCoords("(0,0)", "RRRUUULLDDD");   // "(1,0)"
cursor.getCoords("(5,5)", "LLLLLDDDDD");    // "(0,0)"
```

**Movements:** L=left(-x), R=right(+x), U=up(+y), D=down(-y)

**Time Complexity:** O(n)  
**Key Skill:** State management

---

### 4. IsAnadrome
**Question:** Check if a string is a palindrome or an anagram of a palindrome.

**Difficulty:** ⭐⭐⭐ Medium-Hard

**Requirements:**
- First check if string is a palindrome (reads same forwards and backwards)
- If not, check if it's an anagram of a palindrome
- For anagram check: at most one character can have odd frequency
- Ignore non-alphanumeric characters and case
- Return "Palindrome", "Anagram of palindrome", or "Neither"

**Example:**
```java
IsAnadrome checker = new IsAnadrome();
checker.checkAnagramAndPalindrome("racecar");    // "Palindrome"
checker.checkAnagramAndPalindrome("aabbcc");     // "Anagram of palindrome"
checker.checkAnagramAndPalindrome("hello");      // "Neither"
```

**Logic:** 
1. Palindrome check first (compare with reverse)
2. Then anagram-of-palindrome check (at most 1 odd frequency)

**Time Complexity:** O(n)  
**Key Skill:** Frequency analysis

---

### 5. WildcardCompare
**Question:** Compare two strings with wildcard (*) pattern matching using recursion.

**Difficulty:** ⭐⭐⭐⭐ Hard

**Requirements:**
- Implement pattern matching with '*' wildcard
- '*' can match zero or more characters
- Use recursive backtracking algorithm
- Handle multiple wildcards in pattern
- Return true if text matches pattern, false otherwise
- No loops allowed - pure recursion

**Example:**
```java
WildcardCompare comparator = new WildcardCompare();
comparator.compare("hello", "hello");      // true
comparator.compare("hello", "hel*");       // true
comparator.compare("hello", "*lo");        // true
comparator.compare("hello", "he*o");       // true
comparator.compare("hello world", "h*o w*d");  // true
comparator.compare("hello", "h*x");        // false
```

**Algorithm:** 
- Recursive backtracking with two choices for wildcard:
  1. Match zero characters (skip wildcard)
  2. Match one character and continue with wildcard

**Time Complexity:** O(n×m) worst case  
**Key Skill:** Recursive backtracking

---

## 🧪 Testing

Run `ExamTester.main()` to execute comprehensive tests for all 5 classes with:
- 34 total test cases
- Edge case validation (null, empty, special characters)
- Pattern matching tests (wildcards)
- Coordinate movement verification
- Comprehensive validation

## 📊 Challenge Patterns Summary

| Class | Problem Type | Algorithm | Time Complexity |
|-------|-------------|-----------|-----------------|
| CountUpper | Character Filtering | Linear scan | O(n) |
| CharOccurrences | Character Counting | Linear search | O(n) |
| Cursor | Coordinate Tracking | State simulation | O(n) |
| IsAnadrome | String Analysis | Frequency counting | O(n) |
| WildcardCompare | Pattern Matching | Recursive backtracking | O(n×m) worst |

## 🛠️ Technologies

- Java 17+
- String manipulation
- Character operations
- Recursion (WildcardCompare)
- Frequency counting algorithms

## 💡 Key Concepts Demonstrated

### String Processing
- Character iteration and filtering
- Case-insensitive comparison
- Cleaning non-alphanumeric characters
- Palindrome verification

### Problem-Solving Patterns
1. **Frequency Analysis** - Character counting for anagram detection
2. **State Tracking** - Coordinate system simulation
3. **Pattern Matching** - Wildcard comparison with recursion
4. **Validation** - Null/empty checks and edge cases

### Algorithm Techniques
- **Linear Scan** - Single pass through string
- **Two Pointers** - Palindrome checking from both ends
- **Recursion** - Wildcard pattern matching
- **Hash/Array Counting** - Character frequency maps

## 🎯 Challenge Difficulty

| Challenge | Difficulty | Key Skill |
|-----------|-----------|-----------|
| CountUpper | ⭐ Easy | Character filtering |
| CharOccurrences | ⭐ Easy | Linear search |
| Cursor | ⭐⭐ Medium | State management |
| IsAnadrome | ⭐⭐⭐ Medium-Hard | Frequency analysis |
| WildcardCompare | ⭐⭐⭐⭐ Hard | Recursive backtracking |

## 📝 Notes

- No package declaration (default package)
- Interview-style problem solutions
- Clean, readable code with edge case handling
- Comprehensive test coverage
- Production-ready implementations
