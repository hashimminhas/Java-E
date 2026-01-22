package sprint;

import java.util.ArrayList;
import java.util.List;

public class ArrayTester {
    
    public static void main(String[] args) {
        testAll();
    }
    
    public static void testAll() {
        System.out.println("=".repeat(60));
        System.out.println("ARRAY PACKAGE TESTING - ALL CLASSES");
        System.out.println("=".repeat(60));
        
        testPrimeFinder();
        testArrayInitializer();
        testArraySorter();
        testArrayAdder();
        testListManipulator();
        testStringConcatenator();
        testCombinations();
        testArrayFilter();
        testArrayModifier();
        testTransformer();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ALL TESTS COMPLETED SUCCESSFULLY!");
        System.out.println("=".repeat(60));
    }
    
    private static void testPrimeFinder() {
        System.out.println("\n[1] Testing PrimeFinder");
        System.out.println("-".repeat(40));
        int limit = 30;
        List<Integer> primes = PrimeFinder.findPrimesUpTo(limit);
        System.out.println("Prime numbers up to " + limit + ":");
        System.out.println(primes);
        System.out.println("Total primes found: " + primes.size());
    }
    
    private static void testArrayInitializer() {
        System.out.println("\n[2] Testing ArrayInitializer");
        System.out.println("-".repeat(40));
        ArrayInitializer initializer = new ArrayInitializer();
        int[] result = initializer.fillArray(5);
        System.out.println("Array filled with 5 elements:");
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    private static void testArraySorter() {
        System.out.println("\n[3] Testing ArraySorter");
        System.out.println("-".repeat(40));
        ArraySorter sorter = new ArraySorter();
        double[] unsorted = {5.5, 2.2, 8.8, 1.1, 3.3};
        System.out.print("Unsorted array: [");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i]);
            if (i < unsorted.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        double[] sorted = sorter.sortArray(unsorted);
        System.out.print("Sorted array: [");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            if (i < sorted.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    private static void testArrayAdder() {
        System.out.println("\n[4] Testing ArrayAdder");
        System.out.println("-".repeat(40));
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println("Array 1: [1, 2, 3]");
        System.out.println("Array 2: [4, 5, 6]");
        
        int[] result = ArrayAdder.concatArrays(arr1, arr2);
        System.out.print("Concatenated array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    private static void testListManipulator() {
        System.out.println("\n[5] Testing ListManipulator");
        System.out.println("-".repeat(40));
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original list: " + list);
        
        ListManipulator listManipulator = new ListManipulator();
        list = listManipulator.manipulateList(list);
        System.out.println("Manipulated list: " + list);
    }
    
    private static void testStringConcatenator() {
        System.out.println("\n[6] Testing StringConcatenator");
        System.out.println("-".repeat(40));
        StringConcatenator stringConcatenator = new StringConcatenator();
        String result = stringConcatenator.concatenate("Hello", ", ", "varArgs", "!");
        System.out.println("Input strings: \"Hello\", \", \", \"varArgs\", \"!\"");
        System.out.println("Concatenated result: \"" + result + "\"");
    }
    
    private static void testCombinations() {
        System.out.println("\n[7] Testing Combinations");
        System.out.println("-".repeat(40));
        Combinations comb = new Combinations();
        int n = 3;
        List<String> combinations = comb.combN(n);
        System.out.println("All combinations of " + n + " digits:");
        System.out.println(combinations);
        System.out.println("Total combinations: " + combinations.size());
    }
    
    private static void testArrayFilter() {
        System.out.println("\n[8] Testing ArrayFilter");
        System.out.println("-".repeat(40));
        ArrayFilter filter = new ArrayFilter();
        int[][] array = {
            {1, 2, 3},    // sum = 6
            {4, 5},       // sum = 9
            {6, 7, 8, 9}  // sum = 30
        };
        int threshold = 10;
        
        System.out.println("Original 2D array:");
        for (int[] row : array) {
            System.out.print("  [");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
        System.out.println("Filter threshold (sum >= " + threshold + ")");
        
        int[][] filtered = filter.filterBySum(array, threshold);
        System.out.println("Filtered array:");
        for (int[] row : filtered) {
            System.out.print("  [");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
    
    private static void testArrayModifier() {
        System.out.println("\n[9] Testing ArrayModifier");
        System.out.println("-".repeat(40));
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.5);
        list.add(2.5);
        list.add(3.5);
        list.add(4.5);
        list.add(5.5);
        list.add(6.5);
        
        System.out.println("Original list: " + list);
        int index1 = 2;
        int index2 = 4;
        System.out.println("Removing elements between index " + index1 + " and " + index2);
        
        ArrayList<Double> modified = ArrayModifier.removeElementsBetween(list, index1, index2);
        System.out.println("Modified list: " + modified);
    }
    
    private static void testTransformer() {
        System.out.println("\n[10] Testing Transformer");
        System.out.println("-".repeat(40));
        int[] array = {5, 2, 8, 2, 9, 1, 5, 7};
        System.out.print("Original array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        int[] transformed = Transformer.transform(array);
        System.out.println("After transformation (remove duplicates, sort desc, modify every 3rd, reverse):");
        System.out.print("Transformed array: [");
        for (int i = 0; i < transformed.length; i++) {
            System.out.print(transformed[i]);
            if (i < transformed.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
