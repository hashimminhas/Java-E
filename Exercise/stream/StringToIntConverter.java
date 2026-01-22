package sprint;

import java.util.List;


public class StringToIntConverter {
    public List<Integer> convertStringListToIntList (List<String> strings){
        return strings.stream()
              .map(Integer :: parseInt)
              .toList();
    }
}