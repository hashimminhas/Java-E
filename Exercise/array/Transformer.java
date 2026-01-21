package sprint;

import java.util.*;

public class Transformer {
    
    public static int[] transform(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        
        // Step 1: Remove duplicates
        int[] uniqueArray = Arrays.stream(array)
                .distinct()
                .toArray();
        
        // Step 2: Sort in descending order
        int[] sortedArray = Arrays.stream(uniqueArray)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        
        // Step 3: Replace every third element with the sum of the two preceding elements
        int[] modifiedArray = new int[sortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            if ((i + 1) % 3 == 0 && i >= 2) {
                // Every third element (index 2, 5, 8, ...)
                modifiedArray[i] = sortedArray[i - 2] + sortedArray[i - 1];
            } else {
                modifiedArray[i] = sortedArray[i];
            }
        }
        
        // Step 4: Reverse the array
        int[] reversedArray = new int[modifiedArray.length];
        for (int i = 0; i < modifiedArray.length; i++) {
            reversedArray[i] = modifiedArray[modifiedArray.length - 1 - i];
        }
        
        return reversedArray;
    }
}