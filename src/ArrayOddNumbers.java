public class ArrayOddNumbers {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        for (int i = 0; i < myArray.length ; i++) {
            if( myArray[i] % 2 != 0) {
                System.out.print(myArray[i] + ",");
            }

        }
    }
}
