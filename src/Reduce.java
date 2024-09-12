public class Reduce {
    public static void main(String[] args) {
        // initialize a value of n = 100, amd have it go down to 0.
        int n = 100;
        int steps = 0;
        while(n > 0) {
            if (n % 2 == 0){
                n = n/2;
            } else {
                n = n-1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
