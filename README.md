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
