public class WildcardCompare {
    
    public boolean compare(String str1, String str2) {
        return wildcardMatch(str1, str2, 0, 0);
    }
    
    private boolean wildcardMatch(String str, String pattern, int sIndex, int pIndex) {
        // Base case: both strings exhausted
        if (sIndex == str.length() && pIndex == pattern.length()) {
            return true;
        }
        
        // Pattern exhausted but string remains
        if (pIndex == pattern.length()) {
            return false;
        }
        
        // String exhausted but pattern remains
        if (sIndex == str.length()) {
            // Check if remaining pattern is all wildcards
            for (int i = pIndex; i < pattern.length(); i++) {
                if (pattern.charAt(i) != '*') {
                    return false;
                }
            }
            return true;
        }
        
        // Current character in pattern is wildcard
        if (pattern.charAt(pIndex) == '*') {
            // Try two options:
            // 1. Wildcard matches zero characters (skip wildcard)
            // 2. Wildcard matches one or more characters (consume string char)
            return wildcardMatch(str, pattern, sIndex, pIndex + 1) ||  // Skip *
                   wildcardMatch(str, pattern, sIndex + 1, pIndex);     // Use *
        }
        
        // Regular character matching
        if (str.charAt(sIndex) == pattern.charAt(pIndex)) {
            return wildcardMatch(str, pattern, sIndex + 1, pIndex + 1);
        }
        
        // Characters don't match
        return false;
    }
}