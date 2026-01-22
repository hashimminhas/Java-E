package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    
    public static List<Integer> findPrimesUpTo(int limit){
        List <Integer> primes = new ArrayList<>();

            for (int number = 2; number <= limit; number++){
                if(isPrime(number)){
                    primes.add(number);
                }
            }
            return primes;
        }
    
        private static boolean isPrime(int number){
            if (number < 2){
                return false;
            }
            if( number == 2 ){
                return true;
            }
            if (number % 2 == 0){
                return false;
            }
        int divisor;

            for (divisor = 3; divisor * divisor <= number; divisor += 2){
                if(number % divisor == 0)
                    return false;
            }
            return true;

        }
}