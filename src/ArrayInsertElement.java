import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsertElement {
    public static void main(String[] args) {
//            need to insert an element in an array on a certain position
//            inseram elem 4 in poz 2
        Integer[] myArray = {1, 7, 3, 10, 9};
        int element = 4;
        int position = 2;
        addElement(myArray, element, position);
    }
//        create method that will add the element
    private static void addElement(Integer[] array, int element, int position) {
//        convert the array to list
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
//        add the element
        list.add(position - 1, element);
//        converting the list back to an array
        array = list.toArray(array);
//        print the updated array
        System.out.println(Arrays.toString(array));
    }
}
