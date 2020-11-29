public class LoopPrimeNumbers {
    public static void main(String[] args) {
        int n = 4;
        int status = 1;
        int num = 3;
        System.out.print("First n prime numbers are: ");
//        2 e singurul numar prim par
        System.out.print(2 + " ");
        for ( int i = 2 ; i <= n ; i++) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num%j == 0 ) {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                System.out.print(num + " ");
                i++;
            }
            status = 1;
            num++;
        }
    }
}
