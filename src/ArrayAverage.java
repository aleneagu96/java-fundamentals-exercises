public class ArrayAverage {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < myArray.length ; i++) {
            sum += myArray[i];
            avg = sum / myArray.length;

        }
        System.out.println(avg);
    }
}
