public class ArrayReverse {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};

        for (int i = myArray.length - 1 ; i <= myArray.length; i--) {
            if (i >= 0) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}
