public class CharOccurrences {
    
    public int countChars(String str, char target) {
        // Handle null or empty string
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        
        // Check each character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        
        return count;
    }
}