package sprint;

public class Factorial {

    public int calculateFactorial(int n) {
        if(n < 0){
            return 0;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        if(n > 1){
            return n * calculateFactorial(n-1);
        }
        return 0;
    }

}