package sprint;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<String> combN(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0 || n > 10) {
            return result;
        }

        StringBuilder current = new StringBuilder();
        buildCombinations(0, n, current, result);
        return result;
    }

    private void buildCombinations(int startDigit, int remaining, StringBuilder current, List<String> result) {
        if (remaining == 0) {
            result.add(current.toString());
            return;
        }

        for (int digit = startDigit; digit <= 10 - remaining; digit++) {
            current.append((char) ('0' + digit));
            buildCombinations(digit + 1, remaining - 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
