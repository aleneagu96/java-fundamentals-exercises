public class ArrayNumberOfOddAndEven {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        int countOdd = numberOfOdd(myArray);
        System.out.println("Odd = " + countOdd);
        int countEven = numberOfEven(myArray);
        System.out.println("Even = " + countEven);
    }
    private static int numberOfOdd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    private static int numberOfEven(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
