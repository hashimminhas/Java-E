package sprint;

public class ParenthesesBalanceChecker {
    
    public boolean isBalanced(String str) {
        // Handle null input
        if (str == null) {
            return false;
        }
        
        // Start checking from index 0 with balance 0
        return checkBalance(str, 0, 0);
    }

    private boolean checkBalance(String str, int index, int balance) {
        // Base case: reached end of string
        if (index == str.length()) {
            // Balanced only if balance is 0
            return balance == 0;
        }
        
        // If balance goes negative, we have more closing than opening
        // This catches cases like ")(" early
        if (balance < 0) {
            return false;
        }
        
        char currentChar = str.charAt(index);
        
        // Update balance based on current character
        if (currentChar == '(') {
            balance++;
        } else if (currentChar == ')') {
            balance--;
        }
        // Ignore all other characters
        
        // Recursive case: move to next character
        return checkBalance(str, index + 1, balance);
    }
}