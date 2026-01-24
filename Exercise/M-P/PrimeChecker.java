package sprint;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <=1){
          return false;
        }
        if (number % 2 == 0){
          return number == 2 ;
        }
      for (int d = 3; d < number ; d += 2 ){
        if (number % d == 0){
          return false;
        }
      }
      return true;
    }
}