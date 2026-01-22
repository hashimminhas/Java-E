
package sprint;

public class PalindromeChecker {
    
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if (cleaned.isEmpty()) {
            return true;
        }
        
        // Compare with reversed string
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}