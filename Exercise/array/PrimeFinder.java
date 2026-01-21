package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    public static List<Integer> findPrimesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();
        
        if (limit < 2) {
            return primes;
        }
        
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        
        return primes;
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
