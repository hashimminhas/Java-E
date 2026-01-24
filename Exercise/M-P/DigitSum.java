package sprint;

public class DigitSum {
    public static int sumOfDigits(int number) {

        if ( number < 0 ){
          number = -number ;
        }

      int sum = 0;

      while(number > 0){
        sum += number % 10;
        number /= 10;
      }
      return sum;
    }
}