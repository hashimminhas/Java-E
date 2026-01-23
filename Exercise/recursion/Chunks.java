package sprint;

public class Chunks {

    public static int search(int[] sortedArray, int target) {
       
        if (sortedArray == null || sortedArray.length == 0) {
            return 0;
        }
        
        // Start binary search from the full array range
        return binarySearch(sortedArray, target, 0, sortedArray.length - 1, 0);
    }
    
    private static int binarySearch(int[] arr, int target, int left, int right, int steps) {
        // Base case: search space is exhausted
        if (left > right) {
            return steps;
        }
        
        // Increment steps for this iteration
        steps++;
        
        // Calculate middle index
        // For even number of elements, use (left + right) / 2 which gives half - 1
        int mid = left + (right - left) / 2;
        
        // Found the target
        if (arr[mid] == target) {
            return steps;
        }
        
        // Target is in the left half
        if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1, steps);
        }
        
        // Target is in the right half
        return binarySearch(arr, target, mid + 1, right, steps);
    }
}