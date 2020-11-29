public class ArraySecondLargestElement {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        int secondLargest = myArray.length;
        printTheSecondLargestElement(myArray,secondLargest);
    }

    private static void printTheSecondLargestElement(int[] array, int arrayLenght) {
        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if( array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println( secondLargest);
    }
}
