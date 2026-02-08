# Array Package - Java Sprint Exercises

A collection of Java classes for array manipulation, list operations, and algorithmic problem-solving in the `sprint` package.

## 🚀 Quick Start

```bash
# Compile
javac -d out Exercise/array/*.java

# Run
java -cp out sprint.ArrayTester
```

## 📚 Exercise Questions

### 1. PrimeFinder
**Question:** Write a method that finds all prime numbers up to a given limit using optimized trial division.

**Requirements:**
- Find all prime numbers from 2 to the given limit
- Use optimized algorithm with √n check
- Return as List<Integer>
- Handle edge cases (negative numbers, zero, one)

**Example:**
```java
PrimeFinder.findPrimesUpTo(30); // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
```

**Time Complexity:** O(n√n)  
**Space Complexity:** O(π(n))

---

### 2. ArrayInitializer
**Question:** Create a method that fills an array with sequential integers from 1 to max.

**Requirements:**
- Create an array of specified size
- Fill with consecutive integers starting from 1
- Handle edge cases (zero, negative)

**Example:**
```java
new ArrayInitializer().fillArray(5); // [1, 2, 3, 4, 5]
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 3. ArraySorter
**Question:** Implement a method that sorts double arrays in ascending order using bubble sort.

**Requirements:**
- Sort array of double values in ascending order
- Use bubble sort algorithm
- Handle null and empty arrays

**Example:**
```java
new ArraySorter().sortArray({5.5, 2.2, 8.8}); // [2.2, 5.5, 8.8]
```

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

### 4. ArrayAdder
**Question:** Write a static method that concatenates two integer arrays into one.

**Requirements:**
- Combine two arrays into a single array
- Maintain original order
- Handle null arrays

**Example:**
```java
ArrayAdder.concatArrays({1,2,3}, {4,5,6}); // [1, 2, 3, 4, 5, 6]
```

**Time Complexity:** O(n+m)  
**Space Complexity:** O(n+m)

---

### 5. ListManipulator
**Question:** Manipulate a string list with specific transformations: remove last element, update second-to-last with list size message, add "last", and set first element to "first".

**Requirements:**
- Remove the last element
- Update second-to-last element to display list size
- Add "last" at the end
- Set first element to "first"
- Handle empty and small lists

**Example:**
```java
manipulateList(["A","B","C"]); // ["first", "The size of the list is 2", "last"]
```

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 6. StringConcatenator
**Question:** Implement a method that concatenates a variable number of strings using varargs.

**Requirements:**
- Accept variable number of string arguments
- Concatenate all strings together
- Handle null and empty inputs

**Example:**
```java
concatenate("Hello", ", ", "World", "!"); // "Hello, World!"
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 7. Combinations
**Question:** Generate all combinations of n digits (0-9) in ascending order.

**Requirements:**
- Generate all n-digit combinations
- Use digits 0-9
- Ensure ascending order within each combination
- No repeated digits in a combination

**Example:**
```java
combN(3); // ["012", "013", ..., "789"] - 120 combinations
```

**Time Complexity:** O(C(10,n))  
**Space Complexity:** O(C(10,n))

---

### 8. ArrayFilter
**Question:** Filter rows from a 2D array where the sum of elements in each row is greater than or equal to a threshold value.

**Requirements:**
- Process 2D integer array
- Calculate sum for each row
- Include only rows where sum ≥ threshold
- Return new 2D array with filtered rows

**Example:**
```java
filterBySum({{1,2,3}, {4,5}, {6,7,8,9}}, 10); // {{6,7,8,9}}
```

**Time Complexity:** O(n×m)  
**Space Complexity:** O(k×m)

---

### 9. ArrayModifier
**Question:** Remove elements from an ArrayList between two indices (inclusive).

**Requirements:**
- Remove elements from startIndex to endIndex (inclusive)
- Modify the original ArrayList
- Handle invalid indices
- Return modified list

**Example:**
```java
removeElementsBetween([1.5,2.5,3.5,4.5,5.5], 2, 4); // [1.5, 2.5]
```

**Time Complexity:** O(k)  
**Space Complexity:** O(1)

---

### 10. Transformer
**Question:** Apply a 4-step transformation to an integer array: remove duplicates → sort descending → modify every 3rd element → reverse.

**Requirements:**
- Step 1: Remove duplicate elements
- Step 2: Sort in descending order
- Step 3: Add 10 to every 3rd element
- Step 4: Reverse the array
- Handle null and empty arrays

**Example:**
```java
transform({5,2,8,2,9,1,5,7}); // [7, 2, 5, 17, 8, 9]
```

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)

---

## 🧪 Testing

Run `ArrayTester.testAll()` to execute comprehensive tests for all 10 classes with formatted output showing inputs, outputs, and results.

## 🛠️ Technologies

- Java 17+
- Collections Framework
- Streams API

## 📝 Notes

- All classes in `sprint` package
- Null-safe implementations
- Clean code with single responsibility principle
- Comprehensive edge case handling
