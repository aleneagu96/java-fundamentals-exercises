import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

//        GreatestCommonDivisior greatestCommonDivisior = new GreatestCommonDivisior();
//        System.out.println( greatestCommonDivisior.gcd( 100, 100));
//    FizzBuzz fizzBuzz = new FizzBuzz();
//    fizzBuzz.fizzBuzz(20);
//        Test test = new Test();
//        test.Test(-90,64);
        Fibonacci fibonacci = new Fibonacci();
        long start = System.currentTimeMillis();
        long fib  = 0;
        long end = System.currentTimeMillis();
        System.out.println(" The result is : " +  fib + " and it took " + (end - start) + " millis");
        start = System.currentTimeMillis();
        fib = fibonacci.fib1(45 );
        end = System.currentTimeMillis();
        System.out.println(" The result is : " +  fib + " and it took " + (end - start) + " millis");





    }
}
