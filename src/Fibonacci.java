public class Fibonacci {
    public int fib( int n ) {
        if ( n == 0) {
            return 0;
        }if ( n == 1) {
            return 1;
        }
        return fib( n - 1) + fib( n - 2);
    }
    public long fib1( int n ) {
        long [] partialResults = new long [n+1];
        partialResults[1] = 1 ;

        for (int i = 2; i <= n; i++) {
            partialResults[i] = partialResults[i-1] + partialResults[i-2];

        }
        return partialResults[n];
    }
}
