package sprint;

/**
 * RecursionTester - Comprehensive test suite for all recursion package classes
 * 
 * This class tests all 7 recursion-based classes with various test cases:
 * 1. Factorial
 * 2. Fibonacci
 * 3. GCDRecursive
 * 4. RecursivePalindrome
 * 5. OccurrenceCounter
 * 6. ParenthesesBalanceChecker
 * 7. Chunks (Binary Search)
 */
public class RecursionTester {

    private static int testsPassed = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║       RECURSION PACKAGE - COMPREHENSIVE TEST SUITE            ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        testFactorial();
        testFibonacci();
        testGCDRecursive();
        testRecursivePalindrome();
        testOccurrenceCounter();
        testParenthesesBalanceChecker();
        testChunks();

        printSummary();
    }

    // ======================== TEST 1: Factorial ========================
    private static void testFactorial() {
        printTestHeader("1. Factorial - Calculate Factorial Recursively");
        
        Factorial calculator = new Factorial();
        
        // Test Case 1: Normal factorial
        int result1 = calculator.calculateFactorial(5);
        System.out.println("Input:    5");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 120");
        checkTest(result1 == 120);
        
        // Test Case 2: Negative number
        int result2 = calculator.calculateFactorial(-3);
        System.out.println("\nInput:    -3");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 0 (invalid)");
        checkTest(result2 == 0);
        
        // Test Case 3: Zero
        int result3 = calculator.calculateFactorial(0);
        System.out.println("\nInput:    0");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 1");
        checkTest(result3 == 1);
        
        // Test Case 4: One
        int result4 = calculator.calculateFactorial(1);
        System.out.println("\nInput:    1");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 1");
        checkTest(result4 == 1);
        
        // Test Case 5: Larger number
        int result5 = calculator.calculateFactorial(7);
        System.out.println("\nInput:    7");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 5040");
        checkTest(result5 == 5040);
        
        System.out.println();
    }

    // ======================== TEST 2: Fibonacci ========================
    private static void testFibonacci() {
        printTestHeader("2. Fibonacci - Calculate Nth Fibonacci Number Recursively");
        
        Fibonacci calculator = new Fibonacci();
        
        // Test Case 1: Fibonacci of 6
        int result1 = calculator.calculateFibonacci(6);
        System.out.println("Input:    6");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 8 (0,1,1,2,3,5,8)");
        checkTest(result1 == 8);
        
        // Test Case 2: Negative number
        int result2 = calculator.calculateFibonacci(-3);
        System.out.println("\nInput:    -3");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: -1 (invalid)");
        checkTest(result2 == -1);
        
        // Test Case 3: Fibonacci of 0
        int result3 = calculator.calculateFibonacci(0);
        System.out.println("\nInput:    0");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 0");
        checkTest(result3 == 0);
        
        // Test Case 4: Fibonacci of 1
        int result4 = calculator.calculateFibonacci(1);
        System.out.println("\nInput:    1");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 1");
        checkTest(result4 == 1);
        
        // Test Case 5: Fibonacci of 10
        int result5 = calculator.calculateFibonacci(10);
        System.out.println("\nInput:    10");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 55");
        checkTest(result5 == 55);
        
        System.out.println();
    }

    // ======================== TEST 3: GCDRecursive ========================
    private static void testGCDRecursive() {
        printTestHeader("3. GCDRecursive - Greatest Common Divisor Using Euclidean Algorithm");
        
        GCDRecursive calculator = new GCDRecursive();
        
        // Test Case 1
        int result1 = calculator.gcd(48, 18);
        System.out.println("Input:    gcd(48, 18)");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 6");
        checkTest(result1 == 6);
        
        // Test Case 2
        int result2 = calculator.gcd(100, 75);
        System.out.println("\nInput:    gcd(100, 75)");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 25");
        checkTest(result2 == 25);
        
        // Test Case 3: Same numbers
        int result3 = calculator.gcd(20, 20);
        System.out.println("\nInput:    gcd(20, 20)");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 20");
        checkTest(result3 == 20);
        
        // Test Case 4: One is zero
        int result4 = calculator.gcd(15, 0);
        System.out.println("\nInput:    gcd(15, 0)");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 15");
        checkTest(result4 == 15);
        
        // Test Case 5: Both zero
        int result5 = calculator.gcd(0, 0);
        System.out.println("\nInput:    gcd(0, 0)");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 0");
        checkTest(result5 == 0);
        
        System.out.println();
    }

    // ======================== TEST 4: RecursivePalindrome ========================
    private static void testRecursivePalindrome() {
        printTestHeader("4. RecursivePalindrome - Check Palindrome Recursively");
        
        RecursivePalindrome checker = new RecursivePalindrome();
        
        // Test Case 1
        boolean result1 = checker.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("Input:    \"A man, a plan, a canal: Panama\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: true");
        checkTest(result1 == true);
        
        // Test Case 2
        boolean result2 = checker.isPalindrome("race a car");
        System.out.println("\nInput:    \"race a car\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: false");
        checkTest(result2 == false);
        
        // Test Case 3: Empty string
        boolean result3 = checker.isPalindrome("");
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: true");
        checkTest(result3 == true);
        
        // Test Case 4: Single character
        boolean result4 = checker.isPalindrome("a");
        System.out.println("\nInput:    \"a\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: true");
        checkTest(result4 == true);
        
        // Test Case 5: Only spaces
        boolean result5 = checker.isPalindrome("   ");
        System.out.println("\nInput:    \"   \" (only spaces)");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: true");
        checkTest(result5 == true);
        
        // Test Case 6: Null
        boolean result6 = checker.isPalindrome(null);
        System.out.println("\nInput:    null");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: false");
        checkTest(result6 == false);
        
        System.out.println();
    }

    // ======================== TEST 5: OccurrenceCounter ========================
    private static void testOccurrenceCounter() {
        printTestHeader("5. OccurrenceCounter - Count Element Occurrences Recursively");
        
        OccurrenceCounter counter = new OccurrenceCounter();
        
        // Test Case 1: Multiple occurrences
        int[] arr1 = {1, 2, 3, 2, 4, 2, 5};
        int result1 = counter.countOccurrences(arr1, 2, 0);
        System.out.println("Input:    arr={1, 2, 3, 2, 4, 2, 5}, element=2");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 3");
        checkTest(result1 == 3);
        
        // Test Case 2: Element not found
        int result2 = counter.countOccurrences(arr1, 6, 0);
        System.out.println("\nInput:    arr={1, 2, 3, 2, 4, 2, 5}, element=6");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 0");
        checkTest(result2 == 0);
        
        // Test Case 3: Null array
        int result3 = counter.countOccurrences(null, 1, 0);
        System.out.println("\nInput:    arr=null, element=1");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 0");
        checkTest(result3 == 0);
        
        // Test Case 4: Empty array
        int result4 = counter.countOccurrences(new int[]{}, 1, 0);
        System.out.println("\nInput:    arr={} (empty), element=1");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 0");
        checkTest(result4 == 0);
        
        // Test Case 5: All same elements
        int[] arr5 = {5, 5, 5, 5};
        int result5 = counter.countOccurrences(arr5, 5, 0);
        System.out.println("\nInput:    arr={5, 5, 5, 5}, element=5");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 4");
        checkTest(result5 == 4);
        
        System.out.println();
    }

    // ======================== TEST 6: ParenthesesBalanceChecker ========================
    private static void testParenthesesBalanceChecker() {
        printTestHeader("6. ParenthesesBalanceChecker - Check Balanced Parentheses Recursively");
        
        ParenthesesBalanceChecker checker = new ParenthesesBalanceChecker();
        
        // Test Case 1: Balanced simple
        boolean result1 = checker.isBalanced("(())");
        System.out.println("Input:    \"(())\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: true");
        checkTest(result1 == true);
        
        // Test Case 2: Balanced with other characters
        boolean result2 = checker.isBalanced("(a()b()c)");
        System.out.println("\nInput:    \"(a()b()c)\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: true");
        checkTest(result2 == true);
        
        // Test Case 3: Unbalanced - missing closing
        boolean result3 = checker.isBalanced("(()");
        System.out.println("\nInput:    \"(()\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: false");
        checkTest(result3 == false);
        
        // Test Case 4: Unbalanced - wrong order
        boolean result4 = checker.isBalanced(")(");
        System.out.println("\nInput:    \")(\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: false");
        checkTest(result4 == false);
        
        // Test Case 5: Empty string
        boolean result5 = checker.isBalanced("");
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: true");
        checkTest(result5 == true);
        
        // Test Case 6: Null
        boolean result6 = checker.isBalanced(null);
        System.out.println("\nInput:    null");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: false");
        checkTest(result6 == false);
        
        // Test Case 7: Complex balanced
        boolean result7 = checker.isBalanced("((()())(()))");
        System.out.println("\nInput:    \"((()())(()))\"");
        System.out.println("Output:   " + result7);
        System.out.println("Expected: true");
        checkTest(result7 == true);
        
        System.out.println();
    }

    // ======================== TEST 7: Chunks (Binary Search) ========================
    private static void testChunks() {
        printTestHeader("7. Chunks - Recursive Binary Search (Count Steps)");
        
        // Test Case 1: Find element in middle
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int result1 = Chunks.search(arr1, 9);
        System.out.println("Input:    arr={1,3,5,7,9,11,13,15,17,19}, target=9");
        System.out.println("Output:   " + result1 + " steps");
        System.out.println("Expected: 1-3 steps (found at index 4)");
        checkTest(result1 > 0 && result1 <= 3);
        
        // Test Case 2: Find element at start
        int result2 = Chunks.search(arr1, 1);
        System.out.println("\nInput:    arr={1,3,5,7,9,11,13,15,17,19}, target=1");
        System.out.println("Output:   " + result2 + " steps");
        System.out.println("Expected: 3-4 steps");
        checkTest(result2 > 0 && result2 <= 4);
        
        // Test Case 3: Find element at end
        int result3 = Chunks.search(arr1, 19);
        System.out.println("\nInput:    arr={1,3,5,7,9,11,13,15,17,19}, target=19");
        System.out.println("Output:   " + result3 + " steps");
        System.out.println("Expected: 3-4 steps");
        checkTest(result3 > 0 && result3 <= 4);
        
        // Test Case 4: Element not in array
        int result4 = Chunks.search(arr1, 8);
        System.out.println("\nInput:    arr={1,3,5,7,9,11,13,15,17,19}, target=8");
        System.out.println("Output:   " + result4 + " steps");
        System.out.println("Expected: 3-4 steps (not found)");
        checkTest(result4 > 0 && result4 <= 4);
        
        // Test Case 5: Empty array
        int[] arr5 = {};
        int result5 = Chunks.search(arr5, 5);
        System.out.println("\nInput:    arr={} (empty), target=5");
        System.out.println("Output:   " + result5 + " steps");
        System.out.println("Expected: 0");
        checkTest(result5 == 0);
        
        // Test Case 6: Null array
        int result6 = Chunks.search(null, 5);
        System.out.println("\nInput:    arr=null, target=5");
        System.out.println("Output:   " + result6 + " steps");
        System.out.println("Expected: 0");
        checkTest(result6 == 0);
        
        // Test Case 7: Single element - found
        int[] arr7 = {42};
        int result7 = Chunks.search(arr7, 42);
        System.out.println("\nInput:    arr={42}, target=42");
        System.out.println("Output:   " + result7 + " steps");
        System.out.println("Expected: 1");
        checkTest(result7 == 1);
        
        // Test Case 8: Large array
        int[] arr8 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr8[i] = i * 2;
        }
        int result8 = Chunks.search(arr8, 50);
        System.out.println("\nInput:    arr={0,2,4,...,198} (100 elements), target=50");
        System.out.println("Output:   " + result8 + " steps");
        System.out.println("Expected: ≤7 steps (log2(100) ≈ 6.64)");
        checkTest(result8 > 0 && result8 <= 7);
        
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
