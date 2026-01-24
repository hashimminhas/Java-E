package sprint;

public class SmallestDivisor {
    public int smallestDivisor(int number) {

      if (number < 1){
        return 0;
      }

      for (int d = 2; d * d <= number; d++)
        if (number % d == 0 ){
          return d;
        }
  return number;
    }

}