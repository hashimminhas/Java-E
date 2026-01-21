package sprint;

public class ArrayFilter {
    public int[][] filterBySum(int[][] array, int value) {
        if (array == null) {
            return null;
        }

        int count = 0;
        for (int[] row : array) {
            int sum = 0;
            if (row != null) {
                for (int num : row) {
                    sum += num;
                }
            }
            if (sum >= value) {
                count++;
            }
        }

        int[][] result = new int[count][];
        int index = 0;
        for (int[] row : array) {
            int sum = 0;
            if (row != null) {
                for (int num : row) {
                    sum += num;
                }
            }
            if (sum >= value) {
                result[index++] = row;
            }
        }

        return result;
    }
}
