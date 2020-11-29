public class ArrayPairSum {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;
        System.out.println(pairSum(myArray, sum));
    }

    private static int pairSum(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if( array[i] + array[j] == sum) {
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                }
            }
        }
        return sum;
    }
}
