package sprint;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * StreamTester - Comprehensive test suite for all stream package classes
 * 
 * This class tests all 8 stream-based classes with various test cases:
 * 1. StreamPolice
 * 2. StringToIntConverter
 * 3. UsernameProcessor
 * 4. EmailDomainExtractor
 * 5. NumberProcessor
 * 6. WordLengthAnalyzer
 * 7. CustomIterator
 * 8. NumberFilter
 */
public class StreamTester {

    private static int testsPassed = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║        STREAM PACKAGE - COMPREHENSIVE TEST SUITE              ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        testStreamPolice();
        testStringToIntConverter();
        testUsernameProcessor();
        testEmailDomainExtractor();
        testNumberProcessor();
        testWordLengthAnalyzer();
        testCustomIterator();
        testNumberFilter();

        printSummary();
    }

    // ======================== TEST 1: StreamPolice ========================
    private static void testStreamPolice() {
        printTestHeader("1. StreamPolice - Filter Non-Negative & Exclude Multiples of 5 (not 10)");
        
        StreamPolice processor = new StreamPolice();
        
        // Test Case 1
        List<Integer> numbers1 = Arrays.asList(-10, 15, 20, 30, 8, -3, 5, 10, 50, 12);
        List<Integer> result1 = processor.processNumbers(numbers1);
        System.out.println("Input:    " + numbers1);
        System.out.println("Output:   " + result1);
        System.out.println("Expected: [20, 30, 8, 10, 50, 12]");
        checkTest(result1.equals(Arrays.asList(20, 30, 8, 10, 50, 12)));
        
        // Test Case 2
        List<Integer> numbers2 = Arrays.asList(5, 15, 25, 35, 45);
        List<Integer> result2 = processor.processNumbers(numbers2);
        System.out.println("\nInput:    " + numbers2);
        System.out.println("Output:   " + result2);
        System.out.println("Expected: []");
        checkTest(result2.isEmpty());
        
        System.out.println();
    }

    // ======================== TEST 2: StringToIntConverter ========================
    private static void testStringToIntConverter() {
        printTestHeader("2. StringToIntConverter - Convert String List to Integer List");
        
        StringToIntConverter converter = new StringToIntConverter();
        
        // Test Case 1
        List<String> input1 = Arrays.asList("23", "45", "-15");
        List<Integer> result1 = converter.convertStringListToIntList(input1);
        System.out.println("Input:    " + input1);
        System.out.println("Output:   " + result1);
        System.out.println("Expected: [23, 45, -15]");
        checkTest(result1.equals(Arrays.asList(23, 45, -15)));
        
        // Test Case 2
        List<String> input2 = Arrays.asList("0", "100", "-100");
        List<Integer> result2 = converter.convertStringListToIntList(input2);
        System.out.println("\nInput:    " + input2);
        System.out.println("Output:   " + result2);
        System.out.println("Expected: [0, 100, -100]");
        checkTest(result2.equals(Arrays.asList(0, 100, -100)));
        
        System.out.println();
    }

    // ======================== TEST 3: UsernameProcessor ========================
    private static void testUsernameProcessor() {
        printTestHeader("3. UsernameProcessor - Find First Username or Return 'Anonymous'");
        
        UsernameProcessor processor = new UsernameProcessor();
        
        // Test Case 1
        List<String> usernames1 = Arrays.asList("usr", "user12", "test", "validUser", "12345");
        String result1 = processor.findFirstUsername(usernames1);
        System.out.println("Input:    " + usernames1);
        System.out.println("Output:   " + result1);
        System.out.println("Expected: usr");
        checkTest(result1.equals("usr"));
        
        // Test Case 2
        List<String> usernames2 = Arrays.asList();
        String result2 = processor.findFirstUsername(usernames2);
        System.out.println("\nInput:    " + usernames2);
        System.out.println("Output:   " + result2);
        System.out.println("Expected: Anonymous");
        checkTest(result2.equals("Anonymous"));
        
        System.out.println();
    }

    // ======================== TEST 4: EmailDomainExtractor ========================
    private static void testEmailDomainExtractor() {
        printTestHeader("4. EmailDomainExtractor - Extract Valid & Unique Lowercase Domains");
        
        EmailDomainExtractor extractor = new EmailDomainExtractor();
        
        // Test Case 1
        List<String> emails1 = Arrays.asList(
            "USER1@EXAMPLE.COM",
            "user2@Example.com",
            "user1@EXAMPLE.COM",
            "user3@SAMPLE.ORG",
            "INVALIDEMAIL@",
            "user4@SAMPLE.ORG"
        );
        List<String> result1 = extractor.extractDomains(emails1);
        System.out.println("Input:    " + emails1);
        System.out.println("Output:   " + result1);
        System.out.println("Expected: [example.com, sample.org]");
        checkTest(result1.equals(Arrays.asList("example.com", "sample.org")));
        
        // Test Case 2
        List<String> emails2 = Arrays.asList("invalid@@email.com", "@test.com", "test@");
        List<String> result2 = extractor.extractDomains(emails2);
        System.out.println("\nInput:    " + emails2);
        System.out.println("Output:   " + result2);
        System.out.println("Expected: []");
        checkTest(result2.isEmpty());
        
        System.out.println();
    }

    // ======================== TEST 5: NumberProcessor ========================
    private static void testNumberProcessor() {
        printTestHeader("5. NumberProcessor - Filter ≥10 and Multiply All");
        
        NumberProcessor processor = new NumberProcessor();
        
        // Test Case 1
        List<Integer> numbers1 = Arrays.asList(3, 5, 12, 20, 7, 10);
        Optional<Integer> result1 = processor.processNumbers(numbers1);
        System.out.println("Input:    " + numbers1);
        System.out.println("Output:   " + result1);
        System.out.println("Expected: Optional[2400]");
        checkTest(result1.isPresent() && result1.get() == 2400);
        
        // Test Case 2
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> result2 = processor.processNumbers(numbers2);
        System.out.println("\nInput:    " + numbers2);
        System.out.println("Output:   " + result2);
        System.out.println("Expected: Optional.empty");
        checkTest(result2.isEmpty());
        
        System.out.println();
    }

    // ======================== TEST 6: WordLengthAnalyzer ========================
    private static void testWordLengthAnalyzer() {
        printTestHeader("6. WordLengthAnalyzer - Group Words by Length and Count");
        
        WordLengthAnalyzer analyzer = new WordLengthAnalyzer();
        
        // Test Case 1
        List<String> words1 = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        Map<Integer, Integer> result1 = analyzer.analyzeWordLengths(words1);
        System.out.println("Input:    " + words1);
        System.out.println("Output:   " + result1);
        System.out.println("Expected: {3=1, 4=1, 5=1, 6=2}");
        checkTest(result1.get(3) == 1 && result1.get(4) == 1 && 
                  result1.get(5) == 1 && result1.get(6) == 2);
        
        // Test Case 2
        List<String> words2 = Arrays.asList("a", "bb", "ccc", "dd", "e");
        Map<Integer, Integer> result2 = analyzer.analyzeWordLengths(words2);
        System.out.println("\nInput:    " + words2);
        System.out.println("Output:   " + result2);
        System.out.println("Expected: {1=2, 2=2, 3=1}");
        checkTest(result2.get(1) == 2 && result2.get(2) == 2 && result2.get(3) == 1);
        
        System.out.println();
    }

    // ======================== TEST 7: CustomIterator ========================
    private static void testCustomIterator() {
        printTestHeader("7. CustomIterator - Iterate Through Integer List");
        
        // Test Case 1
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        CustomIterator iterator1 = new CustomIterator(numbers1);
        System.out.println("Input:    " + numbers1);
        System.out.print("Output:   ");
        StringBuilder sb1 = new StringBuilder();
        while (iterator1.hasNext()) {
            sb1.append(iterator1.next()).append(" ");
        }
        System.out.println(sb1.toString().trim());
        System.out.println("Expected: 1 2 3 4 5");
        checkTest(sb1.toString().trim().equals("1 2 3 4 5"));
        
        // Test Case 2
        List<Integer> numbers2 = Arrays.asList(10);
        CustomIterator iterator2 = new CustomIterator(numbers2);
        System.out.println("\nInput:    " + numbers2);
        System.out.print("Output:   ");
        StringBuilder sb2 = new StringBuilder();
        while (iterator2.hasNext()) {
            sb2.append(iterator2.next()).append(" ");
        }
        System.out.println(sb2.toString().trim());
        System.out.println("Expected: 10");
        checkTest(sb2.toString().trim().equals("10"));
        
        System.out.println();
    }

    // ======================== TEST 8: NumberFilter ========================
    private static void testNumberFilter() {
        printTestHeader("8. NumberFilter - Generate Random Numbers and Apply Filters");
        
        NumberFilter filter = new NumberFilter(100, 12345L);
        
        // Test Case 1: Get all prime numbers
        List<Integer> primes = filter.getAllPrimeNumbers();
        System.out.println("Generated 100 random numbers with seed 12345");
        System.out.println("Prime numbers found: " + primes.size() + " primes");
        System.out.println("Sample primes: " + (primes.size() > 5 ? primes.subList(0, 5) : primes));
        checkTest(!primes.isEmpty());
        
        // Test Case 2: Get numbers divisible by 3 but not 5
        List<Integer> div3not5 = filter.getDivisibleBy3ButNot5();
        System.out.println("\nDivisible by 3 but not 5: " + div3not5.size() + " numbers");
        System.out.println("Sample: " + (div3not5.size() > 5 ? div3not5.subList(0, 5) : div3not5));
        checkTest(!div3not5.isEmpty());
        
        // Test Case 3: Get sorted remaining numbers
        List<Integer> remaining = filter.getSortedRemainingNumbers();
        System.out.println("\nRemaining numbers (not divisible by 3 or 5), sorted descending:");
        System.out.println("Count: " + remaining.size());
        System.out.println("Sample: " + (remaining.size() > 5 ? remaining.subList(0, 5) : remaining));
        checkTest(!remaining.isEmpty());
        
        // Test Case 4: Compute average
        double average = filter.computeAverageOfRemainingNumbers();
        System.out.println("\nAverage of remaining numbers: " + average);
        checkTest(average != 0.0);
        
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
