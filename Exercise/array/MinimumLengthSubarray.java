import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findMinimumLengthSubarray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static int findMinimumLengthSubarray(List<Integer> arr, int k) {
        int n = arr.size();
        
        // If k is greater than the number of elements, it's impossible
        if (k > n) {
            return -1;
        }
        
        // Map to store frequency of elements in current window
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        
        // Expand window with right pointer
        for (int right = 0; right < n; right++) {
            // Add current element to the window
            int rightVal = arr.get(right);
            freqMap.put(rightVal, freqMap.getOrDefault(rightVal, 0) + 1);
            
            // Try to shrink window from left while we have at least k distinct elements
            while (freqMap.size() >= k) {
                // Update minimum length
                minLength = Math.min(minLength, right - left + 1);
                
                // Remove leftmost element
                int leftVal = arr.get(left);
                freqMap.put(leftVal, freqMap.get(leftVal) - 1);
                if (freqMap.get(leftVal) == 0) {
                    freqMap.remove(leftVal);
                }
                left++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

}

public class MinimumLengthSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.findMinimumLengthSubarray(arr, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
