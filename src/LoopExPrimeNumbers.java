public class LoopExPrimeNumbers {
    public static void main(String[] args) {
        int n = 10;
        printPrimeNumbers(n);
    }

    /**
     * the method counts and shows the prime numbers
     * @param nrOfTimes
     */
    private static void printPrimeNumbers( int nrOfTimes) {
        int number = 2;
        int count = 0;
        while( count < nrOfTimes) {
            if(isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    /**
     * the method verifies if the numbers is prime
     * @param num
     * @return
     */
    private static boolean isPrime( int num) {
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if( num % i == 0)
                return false;
        }
        return true;
    }
}









//        for( int i = 2 ; i <= n; i++) {
//            for( int j = 2; j <=i; j++) {
//                if( j == i) {
//                    System.out.print(i + " ");
//                }else if (i % j == 0) {
//                    break;
//                }
//            }
//        }