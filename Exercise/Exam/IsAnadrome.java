public class IsAnadrome {
    
    public String checkAnagramAndPalindrome(String str) {
        // Handle null or empty
        if (str == null || str.isEmpty()) {
            return "Palindrome";
        }
        
        // Convert to lowercase and remove non-letters
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Check if it's a palindrome first
        if (isPalindrome(cleaned)) {
            return "Palindrome";
        }
        
        // Check if it's an anagram of a palindrome
        if (canFormPalindrome(cleaned)) {
            return "Anagram of palindrome";
        }
        
        return "Neither";
    }
    
    // Helper: Check if string is a palindrome
    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Helper: Check if string can form a palindrome (is an anagram of palindrome)
    private boolean canFormPalindrome(String str) {
        // Count frequency of each character
        int[] charCount = new int[26]; // For a-z
        
        for (char c : str.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // For a string to form a palindrome:
        // - At most ONE character can have odd frequency (middle character)
        int oddCount = 0;
        
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        
        // If more than one character has odd frequency, can't form palindrome
        return oddCount <= 1;
    }
}