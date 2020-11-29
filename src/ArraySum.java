public class ArraySum {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        sumArray(myArray);
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(" Suma este: " + sum);
        }
        return sum;
    }
}
