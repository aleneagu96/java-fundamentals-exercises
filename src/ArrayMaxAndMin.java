public class ArrayMaxAndMin {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 10, 9};
        int max = maxElement(myArray);
        System.out.println(max);
        int min = minElement(myArray);
        System.out.println(min);
    }
    private static int maxElement( int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if( array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    private static int minElement( int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
