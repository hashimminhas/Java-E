package sprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberFilter {
    
    private List<Integer> numbers;

    public NumberFilter(int count, long seed) {
        this.numbers = generateRandomNumbers(count, seed);
    }

    private List<Integer> generateRandomNumbers(int count, long seed) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random(seed);
        
        for (int i = 0; i < count; i++) {
            // Generate random numbers in range [-1000, 1000]
            int number = random.nextInt(2001) - 1000;
            randomNumbers.add(number);
        }
        
        return randomNumbers;
    }

    public List<Integer> getAllPrimeNumbers() {
        List<Integer> primes = new ArrayList<>();
        
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        
        return primes;
    }

    private boolean isPrime(int number) {
        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }
        
        // 2 and 3 are prime
        if (number == 2 || number == 3) {
            return true;
        }
        
        // Even numbers and multiples of 3 are not prime
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        // Check for divisors up to sqrt(number)
        // Only check numbers of form 6k ± 1
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    public List<Integer> getDivisibleBy3ButNot5() {
        List<Integer> result = new ArrayList<>();
        
        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 5 != 0) {
                result.add(number);
            }
        }
        
        return result;
    }

    public List<Integer> getSortedRemainingNumbers() {
        List<Integer> remaining = new ArrayList<>();
        
        for (Integer number : numbers) {
            // Include numbers that are NOT divisible by 3 or by 5
            if (number % 3 != 0 && number % 5 != 0) {
                remaining.add(number);
            }
        }
        
        // Sort in descending order
        remaining.sort((a, b) -> b - a);
        
        return remaining;
    }

    public double computeAverageOfRemainingNumbers() {
        List<Integer> remaining = getSortedRemainingNumbers();
        
        // Empty list returns 0
        if (remaining.isEmpty()) {
            return 0.0;
        }
        
        // Calculate sum
        long sum = 0;
        for (Integer number : remaining) {
            sum += number;
        }
        
        // Return average
        return (double) sum / remaining.size();
    }
}
