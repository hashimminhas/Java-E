/**
 * ExamTester - Comprehensive test suite for all Exam package classes
 * 
 * This class tests all 5 exam challenge classes with various test cases:
 * 1. CountUpper
 * 2. CharOccurrences
 * 3. Cursor
 * 4. IsAnadrome
 * 5. WildcardCompare
 */
public class ExamTester {

    private static int testsPassed = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║           EXAM PACKAGE - COMPREHENSIVE TEST SUITE             ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        testCountUpper();
        testCharOccurrences();
        testCursor();
        testIsAnadrome();
        testWildcardCompare();

        printSummary();
    }

    // ======================== TEST 1: CountUpper ========================
    private static void testCountUpper() {
        printTestHeader("1. CountUpper - Count Uppercase Letters (A-Z)");
        
        CountUpper counter = new CountUpper();
        
        // Test Case 1: Mixed case
        int result1 = counter.countChars("Hello World");
        System.out.println("Input:    \"Hello World\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 2 (H, W)");
        checkTest(result1 == 2);
        
        // Test Case 2: All uppercase
        int result2 = counter.countChars("HELLO");
        System.out.println("\nInput:    \"HELLO\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 5");
        checkTest(result2 == 5);
        
        // Test Case 3: All lowercase
        int result3 = counter.countChars("hello");
        System.out.println("\nInput:    \"hello\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 0");
        checkTest(result3 == 0);
        
        // Test Case 4: Empty string
        int result4 = counter.countChars("");
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 0");
        checkTest(result4 == 0);
        
        // Test Case 5: Null
        int result5 = counter.countChars(null);
        System.out.println("\nInput:    null");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 0");
        checkTest(result5 == 0);
        
        // Test Case 6: With numbers and symbols
        int result6 = counter.countChars("ABC123xyz!@#XYZ");
        System.out.println("\nInput:    \"ABC123xyz!@#XYZ\"");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: 6 (ABC, XYZ)");
        checkTest(result6 == 6);
        
        System.out.println();
    }

    // ======================== TEST 2: CharOccurrences ========================
    private static void testCharOccurrences() {
        printTestHeader("2. CharOccurrences - Count Character Occurrences");
        
        CharOccurrences counter = new CharOccurrences();
        
        // Test Case 1: Multiple occurrences
        int result1 = counter.countChars("hello world", 'l');
        System.out.println("Input:    str=\"hello world\", target='l'");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: 3");
        checkTest(result1 == 3);
        
        // Test Case 2: No occurrences
        int result2 = counter.countChars("hello world", 'z');
        System.out.println("\nInput:    str=\"hello world\", target='z'");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: 0");
        checkTest(result2 == 0);
        
        // Test Case 3: Single occurrence
        int result3 = counter.countChars("hello world", 'h');
        System.out.println("\nInput:    str=\"hello world\", target='h'");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: 1");
        checkTest(result3 == 1);
        
        // Test Case 4: All same character
        int result4 = counter.countChars("aaaa", 'a');
        System.out.println("\nInput:    str=\"aaaa\", target='a'");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: 4");
        checkTest(result4 == 4);
        
        // Test Case 5: Empty string
        int result5 = counter.countChars("", 'a');
        System.out.println("\nInput:    str=\"\" (empty), target='a'");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: 0");
        checkTest(result5 == 0);
        
        // Test Case 6: Null
        int result6 = counter.countChars(null, 'a');
        System.out.println("\nInput:    str=null, target='a'");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: 0");
        checkTest(result6 == 0);
        
        System.out.println();
    }

    // ======================== TEST 3: Cursor ========================
    private static void testCursor() {
        printTestHeader("3. Cursor - Calculate Final Position After Movements");
        
        Cursor cursor = new Cursor();
        
        // Test Case 1: All directions
        String result1 = cursor.getCoords("(0,0)", "RRRUUULLDDD");
        System.out.println("Input:    start=\"(0,0)\", moves=\"RRRUUULLDDD\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: (1,0) [R:3,U:3,L:2,D:3 = x:+1,y:0]");
        checkTest(result1.equals("(1,0)"));
        
        // Test Case 2: Only right and up
        String result2 = cursor.getCoords("(0,0)", "RRR");
        System.out.println("\nInput:    start=\"(0,0)\", moves=\"RRR\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: (3,0)");
        checkTest(result2.equals("(3,0)"));
        
        // Test Case 3: Return to origin
        String result3 = cursor.getCoords("(0,0)", "RRLLUU DD");
        System.out.println("\nInput:    start=\"(0,0)\", moves=\"RRLLUU DD\" (with spaces)");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: (0,0)");
        checkTest(result3.equals("(0,0)"));
        
        // Test Case 4: Negative coordinates
        String result4 = cursor.getCoords("(5,5)", "LLLLLDDDDD");
        System.out.println("\nInput:    start=\"(5,5)\", moves=\"LLLLLDDDDD\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: (0,0)");
        checkTest(result4.equals("(0,0)"));
        
        // Test Case 5: No movement
        String result5 = cursor.getCoords("(3,7)", "");
        System.out.println("\nInput:    start=\"(3,7)\", moves=\"\" (empty)");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: (3,7)");
        checkTest(result5.equals("(3,7)"));
        
        // Test Case 6: Complex path
        String result6 = cursor.getCoords("(10,10)", "RRUULLDDRRUU");
        System.out.println("\nInput:    start=\"(10,10)\", moves=\"RRUULLDDRRUU\"");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: (12,12) [R:4,U:4,L:2,D:2 = x:+2,y:+2]");
        checkTest(result6.equals("(12,12)"));
        
        System.out.println();
    }

    // ======================== TEST 4: IsAnadrome ========================
    private static void testIsAnadrome() {
        printTestHeader("4. IsAnadrome - Check Palindrome or Anagram of Palindrome");
        
        IsAnadrome checker = new IsAnadrome();
        
        // Test Case 1: Perfect palindrome
        String result1 = checker.checkAnagramAndPalindrome("racecar");
        System.out.println("Input:    \"racecar\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: Palindrome");
        checkTest(result1.equals("Palindrome"));
        
        // Test Case 2: Palindrome with punctuation
        String result2 = checker.checkAnagramAndPalindrome("A man, a plan, a canal: Panama");
        System.out.println("\nInput:    \"A man, a plan, a canal: Panama\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: Palindrome");
        checkTest(result2.equals("Palindrome"));
        
        // Test Case 3: Anagram of palindrome
        String result3 = checker.checkAnagramAndPalindrome("civic");
        System.out.println("\nInput:    \"civic\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: Palindrome");
        checkTest(result3.equals("Palindrome"));
        
        // Test Case 4: Anagram of palindrome (rearrangeable)
        String result4 = checker.checkAnagramAndPalindrome("aabbcc");
        System.out.println("\nInput:    \"aabbcc\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: Anagram of palindrome");
        checkTest(result4.equals("Anagram of palindrome"));
        
        // Test Case 5: Neither
        String result5 = checker.checkAnagramAndPalindrome("hello");
        System.out.println("\nInput:    \"hello\"");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: Neither");
        checkTest(result5.equals("Neither"));
        
        // Test Case 6: Empty string
        String result6 = checker.checkAnagramAndPalindrome("");
        System.out.println("\nInput:    \"\" (empty)");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: Palindrome");
        checkTest(result6.equals("Palindrome"));
        
        // Test Case 7: Single character
        String result7 = checker.checkAnagramAndPalindrome("a");
        System.out.println("\nInput:    \"a\"");
        System.out.println("Output:   " + result7);
        System.out.println("Expected: Palindrome");
        checkTest(result7.equals("Palindrome"));
        
        System.out.println();
    }

    // ======================== TEST 5: WildcardCompare ========================
    private static void testWildcardCompare() {
        printTestHeader("5. WildcardCompare - String Matching with * Wildcard");
        
        WildcardCompare comparator = new WildcardCompare();
        
        // Test Case 1: Exact match
        boolean result1 = comparator.compare("hello", "hello");
        System.out.println("Input:    str=\"hello\", pattern=\"hello\"");
        System.out.println("Output:   " + result1);
        System.out.println("Expected: true");
        checkTest(result1 == true);
        
        // Test Case 2: Wildcard at end
        boolean result2 = comparator.compare("hello", "hel*");
        System.out.println("\nInput:    str=\"hello\", pattern=\"hel*\"");
        System.out.println("Output:   " + result2);
        System.out.println("Expected: true");
        checkTest(result2 == true);
        
        // Test Case 3: Wildcard at start
        boolean result3 = comparator.compare("hello", "*lo");
        System.out.println("\nInput:    str=\"hello\", pattern=\"*lo\"");
        System.out.println("Output:   " + result3);
        System.out.println("Expected: true");
        checkTest(result3 == true);
        
        // Test Case 4: Wildcard in middle
        boolean result4 = comparator.compare("hello", "he*o");
        System.out.println("\nInput:    str=\"hello\", pattern=\"he*o\"");
        System.out.println("Output:   " + result4);
        System.out.println("Expected: true");
        checkTest(result4 == true);
        
        // Test Case 5: Multiple wildcards
        boolean result5 = comparator.compare("hello world", "h*o w*d");
        System.out.println("\nInput:    str=\"hello world\", pattern=\"h*o w*d\"");
        System.out.println("Output:   " + result5);
        System.out.println("Expected: true");
        checkTest(result5 == true);
        
        // Test Case 6: Only wildcard
        boolean result6 = comparator.compare("anything", "*");
        System.out.println("\nInput:    str=\"anything\", pattern=\"*\"");
        System.out.println("Output:   " + result6);
        System.out.println("Expected: true");
        checkTest(result6 == true);
        
        // Test Case 7: No match
        boolean result7 = comparator.compare("hello", "world");
        System.out.println("\nInput:    str=\"hello\", pattern=\"world\"");
        System.out.println("Output:   " + result7);
        System.out.println("Expected: false");
        checkTest(result7 == false);
        
        // Test Case 8: No match with wildcard
        boolean result8 = comparator.compare("hello", "h*x");
        System.out.println("\nInput:    str=\"hello\", pattern=\"h*x\"");
        System.out.println("Output:   " + result8);
        System.out.println("Expected: false");
        checkTest(result8 == false);
        
        // Test Case 9: Empty string with wildcard
        boolean result9 = comparator.compare("", "*");
        System.out.println("\nInput:    str=\"\" (empty), pattern=\"*\"");
        System.out.println("Output:   " + result9);
        System.out.println("Expected: true");
        checkTest(result9 == true);
        
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
