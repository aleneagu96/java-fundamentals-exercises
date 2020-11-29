public class SumOfIntegerDigits {
    public static void main(String[] args) {
        int testNumber = 435;
        System.out.printf(" Sum of digits for the number %d is : %d", testNumber, SumOfDigits(testNumber));

    }
    private static int SumOfDigits (int number) {
//    % 10 returns the last digit of a number
//    / 10 to drop the last digit
//    repeat while the number is greater than 0
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
//            sau sum += lastDigit;
            number = number / 10;
        }
        return sum;

    }
}
