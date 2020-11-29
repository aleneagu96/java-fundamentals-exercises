public class ArrayDuplicateValues {
    public static void main(String[] args) {
        int[] myArray = {1, 7, 3, 7, 10, 1, 9};
        for(int i = 0; i < myArray.length; i++) {
            for( int j = i + 1; j < myArray.length; j++) {
                if( myArray[i] == myArray[j]) {
                    System.out.print(myArray[j] + " " );

                }
            }
        }

    }
}
