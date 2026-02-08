# M-P Package - Miscellaneous Programming Exercises

A diverse collection of Java classes covering mathematical operations, string processing, and ASCII art generation in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/M-P/*.java

# Run tests
java -cp out sprint.MPTester
```

## 📚 Exercise Questions

### 1. PowerCalculator
**Question:** Calculate power (base^exponent) using iterative multiplication without using Math.pow().

**Requirements:**
- Implement power calculation using loops (no Math.pow())
- Handle positive exponents
- Return 1 for exponent 0 (any number to power 0)
- Return 0 for negative exponents (invalid)
- Handle zero base correctly

**Example:**
```java
PowerCalculator calc = new PowerCalculator();
calc.calculatePower(2, 3); // 8 (2³)
calc.calculatePower(5, 0); // 1 (any number to power 0)
calc.calculatePower(2, -3); // 0 (negative exponent invalid)
```

**Edge Cases:** Returns 0 for negative exponents, handles zero base

**Time Complexity:** O(exp)  
**Space Complexity:** O(1)  
**Algorithm Type:** Iterative multiplication

---

### 2. DigitSum
**Question:** Calculate the sum of all digits in a number using modulo and division.

**Requirements:**
- Sum all digits in a given number
- Handle negative numbers (use absolute value)
- Use modulo (%) to extract digits
- Use division (/) to remove processed digits
- Handle zero correctly

**Example:**
```java
DigitSum.sumOfDigits(12345); // 15 (1+2+3+4+5)
DigitSum.sumOfDigits(-123);  // 6 (absolute value)
DigitSum.sumOfDigits(0);     // 0
```

**Edge Cases:** Handles negative numbers by converting to positive

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)  
**Algorithm Type:** Digit extraction

---

### 3. PrimeChecker
**Question:** Determine if a number is prime using trial division optimization.

**Requirements:**
- Check if number is prime
- Optimize by only checking divisors up to √n
- Return false for numbers ≤ 1
- Return true for 2 (smallest prime)
- Handle negative numbers (return false)

**Example:**
```java
PrimeChecker.isPrime(7);  // true
PrimeChecker.isPrime(8);  // false
PrimeChecker.isPrime(2);  // true (smallest prime)
PrimeChecker.isPrime(1);  // false (not prime by definition)
```

**Edge Cases:** Returns false for numbers ≤ 1 and negative numbers

**Time Complexity:** O(√n)  
**Space Complexity:** O(1)  
**Algorithm Type:** Trial division

---

### 4. SmallestDivisor
**Question:** Find the smallest prime divisor of a number (returns itself if prime).

**Requirements:**
- Find the smallest number > 1 that divides the input
- Start checking from 2
- Optimize by checking up to √n
- Return the number itself if it's prime
- Return 1 for input 1
- Return 0 for invalid inputs (≤ 0)

**Example:**
```java
SmallestDivisor finder = new SmallestDivisor();
finder.smallestDivisor(10); // 2
finder.smallestDivisor(15); // 3
finder.smallestDivisor(17); // 17 (prime, returns itself)
```

**Edge Cases:** Returns 1 for input 1, 0 for invalid inputs

**Time Complexity:** O(√n)  
**Space Complexity:** O(1)  
**Algorithm Type:** Optimized divisor search

---

### 5. StringEncryption
**Question:** Implement string-to-integer and integer-to-string conversion (atoi and itoa functions).

**Requirements:**

#### atoi() - String to Integer
- Convert string to integer
- Handle positive and negative numbers
- Return 0 for invalid inputs (non-numeric characters, null, empty)
- Handle Integer.MIN_VALUE and Integer.MAX_VALUE

#### itoa() - Integer to String
- Convert integer to string
- Handle positive, negative, and zero
- Build string correctly with proper sign placement

**Example:**
```java
StringEncryption converter = new StringEncryption();

// String to Int
converter.atoi("123");   // 123
converter.atoi("-456");  // -456
converter.atoi("12a3");  // 0 (invalid characters)

// Int to String
converter.itoa(789);     // "789"
converter.itoa(-321);    // "-321"
converter.itoa(0);       // "0"
```

**Edge Cases:** Handles null, empty strings, Integer.MIN_VALUE, invalid characters

**Time Complexity:** O(n) for atoi, O(log n) for itoa  
**Space Complexity:** O(1) for atoi, O(log n) for itoa  
**Algorithm Type:** Linear parsing (atoi), digit extraction + reverse (itoa)

---

### 6. Tree
**Question:** Draw an ASCII art tree with branches and trunk for a given height.

**Requirements:**
- Draw tree with specified height
- Top: single `^` character
- Branches: `/` + repeated `*` + `\`
- Each row has 2 more stars than previous
- Proper spacing for centering
- Trunk: `|` characters (height/5 + 1 rows)
- Return 0 for height ≤ 0

**Example:**
```java
Tree.tree(5);
// Output:
//     ^
//    /*\
//   /***\
//  /*****\
// /*******\
//    |||

Tree.tree(3);
// Output:
//   ^
//  /*\
// /***\
//   |
```

**Pattern:** 
- Top: `^`
- Branches: `/` + `*` repeated + `\`
- Trunk: `|` repeated (height/5 + 1 rows)

**Time Complexity:** O(h²)  
**Space Complexity:** O(h)  
**Algorithm Type:** ASCII pattern generation

---

### 7. WordCounter
**Question:** Count the number of words in a sentence using state machine approach.

**Requirements:**
- Count words separated by spaces or punctuation
- Use two-state machine (outside word / inside word)
- Only count letter transitions
- Handle multiple consecutive spaces
- Ignore punctuation and special characters
- Return 0 for empty or null strings

**Example:**
```java
WordCounter counter = new WordCounter();
counter.countWords("Hello world");           // 2
counter.countWords("Hello   world   test");  // 3 (multiple spaces)
counter.countWords("Hello, world!");         // 2 (ignores punctuation)
counter.countWords("");                      // 0
```

**Logic:** Uses two-state machine (0=outside word, 1=inside word), only counts letter transitions

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  
**Algorithm Type:** Single-pass state machine

---

## 🧪 Testing

Run comprehensive test suite:
```bash
java -cp out sprint.MPTester
```

### Test Coverage

| Class | Test Cases | Coverage |
|-------|------------|----------|
| PowerCalculator | 6 | Basic power, exponent 0/1, negative, large, zero base |
| DigitSum | 5 | Positive, single digit, zero, negative, large number |
| PrimeChecker | 7 | Primes, composites, 0/1/2, negative, large prime |
| SmallestDivisor | 6 | Even, odd, prime, edge cases (0/1/2) |
| StringEncryption | 9 | atoi (pos/neg/zero/empty/null/invalid), itoa (pos/neg/zero) |
| Tree | 3 | Heights 0/3/5, visual validation |
| WordCounter | 7 | Simple, spaces, empty, single, punctuation, special chars |
| **Total** | **43** | **100% pass rate** |

## 📊 Complexity Analysis

| Class | Time Complexity | Space Complexity | Algorithm Type |
|-------|----------------|------------------|----------------|
| PowerCalculator | O(exp) | O(1) | Iterative multiplication |
| DigitSum | O(log n) | O(1) | Digit extraction |
| PrimeChecker | O(√n) | O(1) | Trial division |
| SmallestDivisor | O(√n) | O(1) | Optimized divisor search |
| StringEncryption.atoi | O(n) | O(1) | Linear parsing |
| StringEncryption.itoa | O(log n) | O(log n) | Digit extraction + reverse |
| Tree | O(h²) | O(h) | ASCII pattern generation |
| WordCounter | O(n) | O(1) | Single-pass state machine |

## 🛠️ Technologies & Concepts

- **Java Core**: Static methods, instance methods, loops, conditionals
- **String Processing**: Character iteration, validation, state machines
- **Mathematical Algorithms**: Power calculation, prime checking, divisor finding
- **Number Theory**: Prime numbers, divisibility, digit manipulation
- **ASCII Art**: Pattern generation, spacing calculations
- **Edge Case Handling**: Null safety, invalid input validation
- **String Building**: Efficient string construction for itoa()

## 💡 Key Concepts

- **Iterative Power Calculation**: Repeated multiplication instead of recursion
- **Prime Number Optimization**: Only check divisors up to √n
- **State Machine Pattern**: Two-state approach for word counting
- **atoi/itoa Implementation**: Core string-number conversion algorithms
- **ASCII Art Generation**: Mathematical pattern for tree branches and spacing
- **Null Safety**: Defensive programming with null/empty checks
- **Static vs Instance Methods**: Mix of both based on use case

## 📝 Notes

- All classes in `sprint` package
- Mix of static and instance methods
- Comprehensive edge case handling
- Production-ready implementations
- 100% test pass rate with 43 test cases
