public class LoopPowerOfNumbers {
    public static void main(String[] args) {
        int number = 3;
        System.out.print("The powers of 3 are: ");
        printPowersOfNumber(number);

    }
    private static void printPowersOfNumber(int number) {
        final int copyOfNumber = number;
        if( number <= 0)
            return;
        do {
            System.out.print(number + " ");
            number *= copyOfNumber;
        }  while(number <= 100);
    }

}
