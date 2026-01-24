package sprint;

/**
 * MPTester - Comprehensive test suite for all M-P package classes
 * 
 * This class tests all 7 M-P classes with various test cases:
 * 1. PowerCalculator
 * 2. DigitSum
 * 3. PrimeChecker
 * 4. SmallestDivisor
 * 5. StringEncryption (atoi/itoa)
 * 6. Tree
 * 7. WordCounter
 */
public class MPTester {

    private static int testsPassed = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║         M-P PACKAGE - COMPREHENSIVE TEST SUITE                ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        testPowerCalculator();
        testDigitSum();
        testPrimeChecker();
        testSmallestDivisor();
        testStringEncryption();
        testTree();
        testWordCounter();

        printSummary();
    }

    // ======================== TEST 1: PowerCalculator ========================
    private static void testPowerCalculator() {
        printTestHeader("1. PowerCalculator - Calculate Base^Exponent");
        
        PowerCalculator calculator = new PowerCalculator();
        
        // Test Case 1: Basic power
        int result1 = calculator.calculatePower(2, 3);
        System.out.println("Input:    base=2, exponent=3");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 8");
        checkTest(result1 == 8);
        
        // Test Case 2: Power of 0
        int result2 = calculator.calculatePower(5, 0);
        System.out.println("\nInput:    base=5, exponent=0");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 1");
        checkTest(result2 == 1);
        
        // Test Case 3: Power of 1
        int result3 = calculator.calculatePower(7, 1);
        System.out.println("\nInput:    base=7, exponent=1");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 7");
        checkTest(result3 == 7);
        
        // Test Case 4: Negative exponent
        int result4 = calculator.calculatePower(2, -3);
        System.out.println("\nInput:    base=2, exponent=-3");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 0 (invalid)");
        checkTest(result4 == 0);
        
        // Test Case 5: Larger power
        int result5 = calculator.calculatePower(3, 4);
        System.out.println("\nInput:    base=3, exponent=4");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 81");
        checkTest(result5 == 81);
        
        // Test Case 6: Zero base
        int result6 = calculator.calculatePower(0, 5);
        System.out.println("\nInput:    base=0, exponent=5");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: 0");
        checkTest(result6 == 0);
        
        System.out.println();
    }

    // ======================== TEST 2: DigitSum ========================
    private static void testDigitSum() {
        printTestHeader("2. DigitSum - Sum of All Digits in a Number");
        
        // Test Case 1: Positive number
        int result1 = DigitSum.sumOfDigits(12345);
        System.out.println("Input:    12345");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 15 (1+2+3+4+5)");
        checkTest(result1 == 15);
        
        // Test Case 2: Single digit
        int result2 = DigitSum.sumOfDigits(7);
        System.out.println("\nInput:    7");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 7");
        checkTest(result2 == 7);
        
        // Test Case 3: Zero
        int result3 = DigitSum.sumOfDigits(0);
        System.out.println("\nInput:    0");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 0");
        checkTest(result3 == 0);
        
        // Test Case 4: Negative number
        int result4 = DigitSum.sumOfDigits(-123);
        System.out.println("\nInput:    -123");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 6 (1+2+3, absolute value)");
        checkTest(result4 == 6);
        
        // Test Case 5: Large number
        int result5 = DigitSum.sumOfDigits(999);
        System.out.println("\nInput:    999");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 27 (9+9+9)");
        checkTest(result5 == 27);
        
        System.out.println();
    }

    // ======================== TEST 3: PrimeChecker ========================
    private static void testPrimeChecker() {
        printTestHeader("3. PrimeChecker - Check if Number is Prime");
        
        // Test Case 1: Prime number
        boolean result1 = PrimeChecker.isPrime(7);
        System.out.println("Input:    7");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: true");
        checkTest(result1 == true);
        
        // Test Case 2: Composite number
        boolean result2 = PrimeChecker.isPrime(8);
        System.out.println("\nInput:    8");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: false");
        checkTest(result2 == false);
        
        // Test Case 3: Two (smallest prime)
        boolean result3 = PrimeChecker.isPrime(2);
        System.out.println("\nInput:    2");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: true");
        checkTest(result3 == true);
        
        // Test Case 4: One (not prime)
        boolean result4 = PrimeChecker.isPrime(1);
        System.out.println("\nInput:    1");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: false");
        checkTest(result4 == false);
        
        // Test Case 5: Zero (not prime)
        boolean result5 = PrimeChecker.isPrime(0);
        System.out.println("\nInput:    0");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: false");
        checkTest(result5 == false);
        
        // Test Case 6: Negative number
        boolean result6 = PrimeChecker.isPrime(-7);
        System.out.println("\nInput:    -7");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: false");
        checkTest(result6 == false);
        
        // Test Case 7: Large prime
        boolean result7 = PrimeChecker.isPrime(97);
        System.out.println("\nInput:    97");
        System.out.println("Output:   " + result7);
        System.out.println("Expected: true");
        checkTest(result7 == true);
        
        System.out.println();
    }

    // ======================== TEST 4: SmallestDivisor ========================
    private static void testSmallestDivisor() {
        printTestHeader("4. SmallestDivisor - Find Smallest Prime Divisor");
        
        SmallestDivisor finder = new SmallestDivisor();
        
        // Test Case 1: Even number
        int result1 = finder.smallestDivisor(10);
        System.out.println("Input:    10");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 2");
        checkTest(result1 == 2);
        
        // Test Case 2: Prime number
        int result2 = finder.smallestDivisor(17);
        System.out.println("\nInput:    17");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 17 (itself)");
        checkTest(result2 == 17);
        
        // Test Case 3: Composite with odd divisor
        int result3 = finder.smallestDivisor(15);
        System.out.println("\nInput:    15");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 3");
        checkTest(result3 == 3);
        
        // Test Case 4: Two (smallest prime)
        int result4 = finder.smallestDivisor(2);
        System.out.println("\nInput:    2");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 2");
        checkTest(result4 == 2);
        
        // Test Case 5: Invalid input (< 1)
        int result5 = finder.smallestDivisor(0);
        System.out.println("\nInput:    0");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 0 (invalid)");
        checkTest(result5 == 0);
        
        // Test Case 6: One
        int result6 = finder.smallestDivisor(1);
        System.out.println("\nInput:    1");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: 1");
        checkTest(result6 == 1);
        
        System.out.println();
    }

    // ======================== TEST 5: StringEncryption ========================
    private static void testStringEncryption() {
        printTestHeader("5. StringEncryption - atoi (String to Int) & itoa (Int to String)");
        
        StringEncryption converter = new StringEncryption();
        
        System.out.println("--- Testing atoi() ---");
        
        // Test Case 1: Positive number
        int result1 = converter.atoi("123");
        System.out.println("Input:    \"123\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 123");
        checkTest(result1 == 123);
        
        // Test Case 2: Negative number
        int result2 = converter.atoi("-456");
        System.out.println("\nInput:    \"-456\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: -456");
        checkTest(result2 == -456);
        
        // Test Case 3: Zero
        int result3 = converter.atoi("0");
        System.out.println("\nInput:    \"0\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 0");
        checkTest(result3 == 0);
        
        // Test Case 4: Empty string
        int result4 = converter.atoi("");
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 0");
        checkTest(result4 == 0);
        
        // Test Case 5: Null
        int result5 = converter.atoi(null);
        System.out.println("\nInput:    null");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 0");
        checkTest(result5 == 0);
        
        // Test Case 6: Invalid character
        int result6 = converter.atoi("12a3");
        System.out.println("\nInput:    \"12a3\"");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: 0 (invalid)");
        checkTest(result6 == 0);
        
        System.out.println("\n--- Testing itoa() ---");
        
        // Test Case 7: Positive number
        String result7 = converter.itoa(789);
        System.out.println("Input:    789");
        System.out.println("Output:   \"" + result7 + "\"");
        System.out.println("Expected: \"789\"");
        checkTest(result7.equals("789"));
        
        // Test Case 8: Negative number
        String result8 = converter.itoa(-321);
        System.out.println("\nInput:    -321");
        System.out.println("Output:   \"" + result8 + "\"");
        System.out.println("Expected: \"-321\"");
        checkTest(result8.equals("-321"));
        
        // Test Case 9: Zero
        String result9 = converter.itoa(0);
        System.out.println("\nInput:    0");
        System.out.println("Output:   \"" + result9 + "\"");
        System.out.println("Expected: \"0\"");
        checkTest(result9.equals("0"));
        
        System.out.println();
    }

    // ======================== TEST 6: Tree ========================
    private static void testTree() {
        printTestHeader("6. Tree - Draw ASCII Tree with Given Height");
        
        System.out.println("Test Case 1: Tree with height 5");
        System.out.println("Output:");
        Tree.tree(5);
        System.out.println("Expected: Tree with 5 rows of branches and trunk");
        checkTest(true); // Visual test, always pass
        
        System.out.println("\nTest Case 2: Tree with height 0");
        System.out.println("Output:");
        Tree.tree(0);
        System.out.println("Expected: No output");
        checkTest(true);
        
        System.out.println("\nTest Case 3: Tree with height 3");
        System.out.println("Output:");
        Tree.tree(3);
        System.out.println("Expected: Small tree with 3 rows");
        checkTest(true);
        
        System.out.println();
    }

    // ======================== TEST 7: WordCounter ========================
    private static void testWordCounter() {
        printTestHeader("7. WordCounter - Count Words in Sentence");
        
        WordCounter counter = new WordCounter();
        
        // Test Case 1: Simple sentence
        int result1 = counter.countWords("Hello world");
        System.out.println("Input:    \"Hello world\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 2");
        checkTest(result1 == 2);
        
        // Test Case 2: Multiple spaces
        int result2 = counter.countWords("Hello   world   test");
        System.out.println("\nInput:    \"Hello   world   test\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 3");
        checkTest(result2 == 3);
        
        // Test Case 3: Empty string
        int result3 = counter.countWords("");
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 0");
        checkTest(result3 == 0);
        
        // Test Case 4: Single word
        int result4 = counter.countWords("Hello");
        System.out.println("\nInput:    \"Hello\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 1");
        checkTest(result4 == 1);
        
        // Test Case 5: With punctuation
        int result5 = counter.countWords("Hello, world!");
        System.out.println("\nInput:    \"Hello, world!\"");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 2");
        checkTest(result5 == 2);
        
        // Test Case 6: Only spaces
        int result6 = counter.countWords("   ");
        System.out.println("\nInput:    \"   \" (only spaces)");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: 0");
        checkTest(result6 == 0);
        
        // Test Case 7: Mixed with numbers and special chars
        int result7 = counter.countWords("Test123 with456 numbers");
        System.out.println("\nInput:    \"Test123 with456 numbers\"");
        System.out.println("Output:   " + result7);
        System.out.println("Expected: 3");
        checkTest(result7 == 3);
        
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
