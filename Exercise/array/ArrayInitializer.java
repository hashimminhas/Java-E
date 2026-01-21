package sprint;

public class ArrayInitializer {
    public int[] fillArray(int max) {
       if (max < 0){
        return new int[0];
       }
        int[] array = new int[max];
        for(int i = 0; i < max; i++){
            array[i] = i+ 1;
        }
        return array;
    }
}