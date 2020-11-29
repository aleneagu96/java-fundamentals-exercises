public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = { 1, 7, 3, 10, 9};
        int[] reversedArray = new int[myArray.length];
        int j = 0;
        for( int i = myArray.length - 1; i > 0; i--){
//            System.out.print(myArray[i] + " ");
            reversedArray[j] = myArray[i];
            j++;
        }

        for( int iter = 0; iter < reversedArray.length; iter++){
            System.out.print(" " + reversedArray[iter] + " ");
        }

    }
}
