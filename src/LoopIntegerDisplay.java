public class LoopIntegerDisplay {
    public static void main(String[] args) {
        int n = 3;
        numberPrinter(n);

    }
    private static void numberPrinter(int number) {
        int i = 1;
        int copyOfNumber = number ;
// 5 * 10 + 5 = 55;
// 55 * 10 + 5 = 555;
// 555 * 10 + 5 = 5555
        do {
            System.out.println(number + " ");
            number = number * 10 + copyOfNumber;
            i++;

        } while ( i <= copyOfNumber);

    }
}
