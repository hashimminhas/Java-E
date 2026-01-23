public class CountUpper {
    
    public int countChars(String str) {
        // Handle null or empty string
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        
        // Check each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Check if character is uppercase Latin letter (A-Z)
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        
        return count;
    }
}