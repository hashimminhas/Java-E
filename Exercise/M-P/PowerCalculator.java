package sprint;

public class PowerCalculator {
    public int calculatePower(int base, int exponent) {
       if (exponent < 0){
         return 0;
       }
      int result = 1;
        for (int i = 0 ; i < exponent; i++){
         result*= base;
        }
        return result;
    }
}