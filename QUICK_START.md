# Quick Start Guide - Java Sprint Exercises

Complete guide to compiling and running all exercise packages in the Kood project.

## 📁 Project Structure

```
D:\Kood\
├── Exercise\
│   ├── array\           ← Array manipulation (10 classes)
│   ├── stream\          ← Stream API exercises (8 classes)
│   ├── string-theory\   ← String & Date/Time (7 classes)
│   ├── recursion\       ← Recursive algorithms (7 classes)
│   ├── Exam\            ← Challenge problems (5 classes)
│   ├── src\
│   │   └── Main.java
│   └── out\             ← Compiled classes
├── README.md            ← Complete documentation
└── QUICK_START.md       ← This file
```

## 🚀 Quick Commands

### Compile All Packages

```bash
# From D:\Kood\Exercise directory
javac -d out array/*.java
javac -d out stream/*.java
javac -d out string-theory/*.java
javac -d out recursion/*.java
javac -d out Exam/*.java
```

### Run All Test Suites

```bash
# Test each package individually
java -cp out sprint.ArrayTester
java -cp out sprint.StreamTester
java -cp out sprint.StringTheoryTester
java -cp out sprint.RecursionTester
java -cp out ExamTester
```

### Compile and Run in One Command

```bash
# Array package
javac -d out array/*.java && java -cp out sprint.ArrayTester

# Stream package
javac -d out stream/*.java && java -cp out sprint.StreamTester

# String-Theory package
javac -d out string-theory/*.java && java -cp out sprint.StringTheoryTester

# Recursion package
javac -d out recursion/*.java && java -cp out sprint.RecursionTester

# Exam package
javac -d out Exam/*.java && java -cp out ExamTester
```

## 🧪 Testing Individual Classes

### Array Package (sprint package)

```bash
# Compile all array classes first
javac -d out array/*.java

# Test specific class
java -cp out sprint.PrimeFinder
java -cp out sprint.ArrayInitializer
java -cp out sprint.ArraySorter
# ... etc
```

### Stream Package (sprint package)

```bash
# Compile all stream classes first
javac -d out stream/*.java

# Test specific class (requires Main.java with test code)
java -cp out sprint.StreamPolice
java -cp out sprint.StringToIntConverter
# ... etc
```

### String-Theory Package (sprint package)

```bash
# Compile all string-theory classes first
javac -d out string-theory/*.java

# Test specific class
java -cp out sprint.AreaCalculator
java -cp out sprint.PrimeFinder
# ... etc
```

### Recursion Package (sprint package)

```bash
# Compile all recursion classes first
javac -d out recursion/*.java

# Test specific class
java -cp out sprint.Factorial
java -cp out sprint.Fibonacci
# ... etc
```

### Exam Package (default package)

```bash
# Compile all Exam classes first
javac -d out Exam/*.java

# Test specific class
java -cp out CountUpper
java -cp out CharOccurrences
# ... etc
```

## 📦 Package Summary

| Package | Classes | Tests | Focus Area |
|---------|---------|-------|------------|
| **array** | 10 + tester | ArrayTester | Array manipulation, lists, algorithms |
| **stream** | 8 + tester | StreamTester | Stream API, functional programming |
| **string-theory** | 7 + tester | StringTheoryTester | Strings, dates, method overloading |
| **recursion** | 7 + tester | RecursionTester | Recursive algorithms, no loops |
| **Exam** | 5 + tester | ExamTester | Interview challenges, pattern matching |

## 🎯 Run All Tests at Once

```bash
# Compile everything
cd D:\Kood\Exercise
javac -d out array/*.java stream/*.java string-theory/*.java recursion/*.java Exam/*.java

# Run all test suites
java -cp out sprint.ArrayTester
java -cp out sprint.StreamTester
java -cp out sprint.StringTheoryTester
java -cp out sprint.RecursionTester
java -cp out ExamTester
```

Or use this PowerShell one-liner:

```powershell
cd D:\Kood\Exercise; javac -d out array/*.java stream/*.java string-theory/*.java recursion/*.java Exam/*.java; java -cp out sprint.ArrayTester; java -cp out sprint.StreamTester; java -cp out sprint.StringTheoryTester; java -cp out sprint.RecursionTester; java -cp out ExamTester
```

## 📊 Test Results Summary

All test suites provide:
- ✓ Pass/Fail indicators
- Expected vs Actual output
- Edge case validation
- Final test summary with statistics

### Expected Output Format:

```
╔════════════════════════════════════════════════════════════════╗
║           [PACKAGE] - COMPREHENSIVE TEST SUITE                ║
╚════════════════════════════════════════════════════════════════╝

┌─────────────────────────────────────────────────────────────────┐
│ [Class Name] - Description
└─────────────────────────────────────────────────────────────────┘
Input:    [test input]
Output:   [actual output]
Expected: [expected output]
✓ PASSED

...

╔════════════════════════════════════════════════════════════════╗
║                        TEST SUMMARY                            ║
╠════════════════════════════════════════════════════════════════╣
║  Total Tests: X                                              ║
║  Passed:      X      ✓                                       ║
║  Failed:      0      ✗                                       ║
╚════════════════════════════════════════════════════════════════╝
```

## 🛠️ Troubleshooting

### Class Not Found Error
```bash
# Make sure you're in the Exercise directory
cd D:\Kood\Exercise

# Verify out directory exists
mkdir out

# Recompile the specific package
javac -d out [package]/*.java
```

### Package Declaration Issues
- **array, stream, string-theory, recursion** use `package sprint;`
- **Exam** classes have no package declaration (default package)

### Cannot Find Symbol Errors
```bash
# Clean and rebuild
rm -r out
mkdir out
javac -d out array/*.java stream/*.java string-theory/*.java recursion/*.java Exam/*.java
```

## 📖 Documentation

For detailed documentation on each class, see [README.md](README.md)

For project architecture and structure, see [PROJECT_OVERVIEW.md](PROJECT_OVERVIEW.md)

## ✅ All Tests Passing

- **Array Package**: 10/10 classes ✓
- **Stream Package**: 18/18 tests ✓
- **String-Theory Package**: 25/25 tests ✓
- **Recursion Package**: 41/41 tests ✓
- **Exam Package**: 34/34 tests ✓

**Total: 128 tests passing across 37 classes!**
