package sprint;

public class GCDRecursive {
    public int gcd(int a, int b) {

        if(a == 0 && b == 0){
            return 0;
        }
        
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // remember: no loops allowed!
}