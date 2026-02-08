# Recursion Package - Java Recursive Algorithm Exercises

A collection of Java classes demonstrating recursive problem-solving techniques for mathematical computations, string processing, and searching algorithms in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/recursion/*.java

# Run the comprehensive test suite
java -cp out sprint.RecursionTester
```

## 📚 Exercise Questions

### 1. Factorial
**Question:** Calculate the factorial of a number using recursion.

**Requirements:**
- Implement recursive factorial calculation
- Base cases: 0! = 1, 1! = 1
- Return 0 for negative numbers (invalid)
- No loops allowed - pure recursion
- Formula: n! = n × (n-1)!

**Example:**
```java
Factorial calculator = new Factorial();
calculator.calculateFactorial(5);   // 120
calculator.calculateFactorial(0);   // 1
calculator.calculateFactorial(-3);  // 0 (invalid)
```

**Formula:** n! = n × (n-1)! with base cases: 0! = 1, 1! = 1

**Time Complexity:** O(n)  
**Recursion Type:** Linear

---

### 2. Fibonacci
**Question:** Calculate the nth Fibonacci number recursively.

**Requirements:**
- Implement recursive Fibonacci calculation
- Base cases: F(0) = 0, F(1) = 1
- Return -1 for negative numbers (invalid)
- No loops allowed
- Formula: F(n) = F(n-1) + F(n-2)

**Example:**
```java
Fibonacci calculator = new Fibonacci();
calculator.calculateFibonacci(6);   // 8 (0,1,1,2,3,5,8)
calculator.calculateFibonacci(0);   // 0
calculator.calculateFibonacci(-3);  // -1 (invalid)
```

**Sequence:** F(n) = F(n-1) + F(n-2) with F(0)=0, F(1)=1

**Time Complexity:** O(2ⁿ)  
**Recursion Type:** Tree

---

### 3. GCDRecursive
**Question:** Find the greatest common divisor (GCD) of two numbers using Euclidean algorithm recursively.

**Requirements:**
- Implement Euclidean algorithm recursively
- Formula: gcd(a, b) = gcd(b, a mod b)
- Base case: gcd(a, 0) = a
- Handle negative numbers (use absolute values)
- No loops allowed

**Example:**
```java
GCDRecursive calculator = new GCDRecursive();
calculator.gcd(48, 18);   // 6
calculator.gcd(100, 75);  // 25
calculator.gcd(15, 0);    // 15
```

**Algorithm:** gcd(a, b) = gcd(b, a mod b) with base case: gcd(a, 0) = a

**Time Complexity:** O(log min(a,b))  
**Recursion Type:** Linear

---

### 4. RecursivePalindrome
**Question:** Check if a string is a palindrome recursively, ignoring non-alphanumeric characters.

**Requirements:**
- Implement recursive palindrome checking
- Clean string: remove non-alphanumeric characters and convert to lowercase
- Compare characters from both ends recursively
- Base cases: empty string or single character = true
- Base case for recursion: start index >= end index
- No loops allowed

**Example:**
```java
RecursivePalindrome checker = new RecursivePalindrome();
checker.isPalindrome("A man, a plan, a canal: Panama");  // true
checker.isPalindrome("race a car");                       // false
checker.isPalindrome("");                                 // true
```

**Features:** Character-by-character comparison from both ends, regex cleaning

**Time Complexity:** O(n/2)  
**Recursion Type:** Linear (two-pointer)

---

### 5. OccurrenceCounter
**Question:** Count the occurrences of an element in an array recursively.

**Requirements:**
- Implement recursive occurrence counting
- Accept array, target element, and starting index
- Count matches and recurse to next index
- Base case: index out of bounds = 0
- No loops allowed

**Example:**
```java
OccurrenceCounter counter = new OccurrenceCounter();
int[] arr = {1, 2, 3, 2, 4, 2, 5};
counter.countOccurrences(arr, 2, 0);  // 3
counter.countOccurrences(arr, 6, 0);  // 0
```

**Approach:** Traverse array from given index, count matches, recurse to next index

**Time Complexity:** O(n)  
**Recursion Type:** Linear (accumulator)

---

### 6. ParenthesesBalanceChecker
**Question:** Check if parentheses in a string are balanced using recursion.

**Requirements:**
- Implement recursive parentheses balance checking
- Track balance counter: increment for '(', decrement for ')'
- Ignore non-parenthesis characters
- Return false if balance goes negative
- Return true only if final balance is 0
- No loops allowed

**Example:**
```java
ParenthesesBalanceChecker checker = new ParenthesesBalanceChecker();
checker.isBalanced("(())");        // true
checker.isBalanced("(a()b()c)");   // true
checker.isBalanced("(()");         // false
checker.isBalanced(")(");          // false
```

**Algorithm:** Track balance counter, increment for '(', decrement for ')', ignore other chars

**Time Complexity:** O(n)  
**Recursion Type:** Linear (state tracking)

---

### 7. Chunks (Binary Search)
**Question:** Perform recursive binary search on a sorted array and return the number of steps taken.

**Requirements:**
- Implement recursive binary search
- Return number of recursive calls (steps) taken
- Work on sorted integer arrays
- Base case: element found or search space exhausted
- Divide array in half each iteration
- Count and return the number of steps

**Example:**
```java
int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
Chunks.search(arr, 9);   // 1-3 steps (found)
Chunks.search(arr, 8);   // 3-4 steps (not found)
```

**Complexity:** O(log n) time, counts iterations for analysis

**Time Complexity:** O(log n)  
**Recursion Type:** Divide & Conquer

---

## 🧪 Testing

Run `RecursionTester.main()` to execute comprehensive tests for all 7 classes with:
- 40+ total test cases
- Edge case validation (null, empty, negative, zero)
- Expected vs actual output comparison
- Boundary condition testing
- Algorithm step counting (for Chunks)

## 📊 Recursion Patterns Summary

| Class | Recursion Type | Base Case(s) | Recursive Case | Time Complexity |
|-------|---------------|--------------|----------------|-----------------|
| Factorial | Linear | n ≤ 1 | n × F(n-1) | O(n) |
| Fibonacci | Tree | n ≤ 1 | F(n-1) + F(n-2) | O(2ⁿ) |
| GCDRecursive | Linear | b = 0 | gcd(b, a%b) | O(log min(a,b)) |
| RecursivePalindrome | Linear | start ≥ end | Compare ends | O(n/2) |
| OccurrenceCounter | Linear | index out of bounds | Count + recurse | O(n) |
| ParenthesesBalanceChecker | Linear | end of string | Track balance | O(n) |
| Chunks | Binary | left > right | Divide & conquer | O(log n) |

## 🛠️ Technologies

- Java 17+
- Recursion techniques (linear, tree, divide-and-conquer)
- No loops - pure recursive implementations
- Helper methods for recursive logic

## 💡 Key Concepts Demonstrated

### Recursion Fundamentals
- **Base Case** - Condition to stop recursion
- **Recursive Case** - Problem reduced to smaller instance
- **Call Stack** - How recursive calls are managed

### Recursion Types
1. **Linear Recursion** - Single recursive call per function
2. **Tree Recursion** - Multiple recursive calls (Fibonacci)
3. **Tail Recursion** - Recursive call is the last operation
4. **Divide and Conquer** - Split problem into subproblems (Binary Search)

### Design Patterns
- **Helper Method Pattern** - Public method + private recursive helper
- **Accumulator Pattern** - Pass accumulated result through recursion
- **Index Tracking** - Use parameters to track position in data structure

### Algorithm Applications
- Mathematical computations (factorial, Fibonacci, GCD)
- String manipulation (palindrome checking)
- Array processing (occurrence counting)
- Pattern matching (parentheses balancing)
- Efficient searching (binary search)

## 🎯 Recursion Best Practices

1. **Always define base case(s)** - Prevents infinite recursion
2. **Make progress toward base case** - Each call should simplify problem
3. **Trust the recursion** - Assume smaller problems are solved correctly
4. **Consider stack overflow** - Deep recursion may exhaust stack space
5. **Optimize when needed** - Memoization for tree recursion (Fibonacci)

## 📝 Notes

- All classes in `sprint` package
- No loops allowed - pure recursive solutions
- Comprehensive null and edge case handling
- Stack depth considerations for large inputs
- Educational implementations (not always production-optimal)
