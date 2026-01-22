package sprint;

import java.util.Arrays;

public class AnagramChecker {
    
    public static boolean areAnagrams(String str1, String str2) {

        if( str1 == null || str2 == null ){
            return false;
        }

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if (s1.length() != s2.length()){
            return false;
        }
        
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}