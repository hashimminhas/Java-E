package sprint;

import java.util.ArrayList;

public class ArrayModifier {
    public static ArrayList<Double> removeElementsBetween(ArrayList<Double> list, int index1, int index2) {
        if (list == null) {
            return null;
        }

        int size = list.size();
        if (index1 > index2){
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }

        if(index1 < 0){
            index1 = 0;
        }else if (index1 > size){
            index1 = size;
        }

        if(index2 < 0){
            index2 = 0;

        } else if (index2 > size){
            index2 = size;
        }
        for (int i = index2 - 1; i >= index1; i--) {
            list.remove(i);
        }
        return list;
    }
}