public class AverageArray {
        public static void main(String[] args) {
//            AVERAGE EXERCISE

            int[] myArray = {1, 7, 3, 10, 9};
            avgArray(myArray);

        }
            private static int avgArray(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int avg = sum / arr.length;
            System.out.println(" Media este: " + avg);
        return avg;
        }
}

