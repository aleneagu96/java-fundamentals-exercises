public class LoopFibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(0));
        System.out.println(recursiveFibonacci(1));
        System.out.println(recursiveFibonacci(2));
        System.out.println(recursiveFibonacci(3));
        System.out.println(recursiveFibonacci(4));
        System.out.println(recursiveFibonacci(5));
        System.out.println(recursiveFibonacci(6));
        System.out.println(recursiveFibonacci(7));



    }
    private static int recursiveFibonacci( int number) {
//        0, 1, 1, 2, 3
        if(number == 1 || number == 0) {
            return number;
        } else {
            return recursiveFibonacci(number -1) + recursiveFibonacci(number - 2);
        }
    }
}
