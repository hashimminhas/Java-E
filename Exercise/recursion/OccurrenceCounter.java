package sprint;

public class OccurrenceCounter {

     public int countOccurrences(int[] arr, int element, int index) {
        if (arr == null){
            return 0;
        }
        if (arr.length == 0){
            return 0;
        }
        if (index < 0){
            return 0;
        }
        if (index >= arr.length){
            return 0;
        }

        int currentCount = (arr[index] == element) ? 1 : 0;
        return currentCount + countOccurrences(arr, element, index +1);

     }
        // solution code here
        // remember: no loops allowed!
}