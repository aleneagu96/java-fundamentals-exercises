import java.util.Arrays;
public class ArrayInsEl {
    public static void main(String[] args) {
        int[] myArray ={ 1, 7, 3, 10, 9};
        int pos = 2;
        myArray = inserttoArray(myArray, 4, pos);
        for (int i = 0; i < myArray.length ; i++) {
        }
        System.out.println(Arrays.toString(myArray));
    }
    public static int[] inserttoArray(int[] arr, int element, int pos) {
        int[] newArray = new int[arr.length + 1];
//        for (int i = 0; i < pos; i++) {
//            newArray[i] = arr[i];
//        }
//        newArray[pos] = element;
//        for (int i = pos + 1; i <= arr.length ; i++) {
//            newArray[i] = arr[i - 1];
//        }
//        return newArray;
        for (int i = 0; i <= arr.length; i++) {
            if(i < pos) {
                newArray[i] = arr[i];
            }else if(i == pos) {
                newArray[i] = element;
            }else {
                newArray[i] = arr[i - 1];
            }
        }
    return newArray;
    }
}
