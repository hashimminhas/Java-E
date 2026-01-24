package sprint;

public class StringEncryption  {

    public int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;

        // handle optional leading '-'
        if (str.charAt(0) == '-') {
            sign = -1;
            i = 1;
            if (str.length() == 1) { // string is just "-"
                return 0;
            }
        }

        int result = 0;

        for (; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if not a digit, stop or return 0 (depends on spec; safest: return 0)
            if (ch < '0' || ch > '9') {
                return 0;
            }

            int digit = ch - '0';
            result = result * 10 + digit;
        }

        return result * sign;
    }

    public String itoa(int num) {
        // special case
        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;

        // Work in negative space to avoid overflow for Integer.MIN_VALUE
        int n = num;
        if (!negative) {
            n = -n;
        }

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int digit = -(n % 10);           // make digit positive
            sb.append((char) ('0' + digit)); // append digit char
            n /= 10;
        }

        if (negative) {
            sb.append('-');
        }

        // reverse manually (no built-in reverse requirement? StringBuilder.reverse is allowed,
        // but we'll do manual to be safe.)
        char[] arr = new char[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            arr[i] = sb.charAt(sb.length() - 1 - i);
        }

        return new String(arr);
    }
}