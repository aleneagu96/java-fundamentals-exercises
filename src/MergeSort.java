import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 2, 90, 28, 17, 3, 24, 102, -5};
        int[] sorted = mergeSort(array);
        System.out.println(Arrays.toString(sorted));
    }
    public static int[] mergeSort(int[] A) {
//        System.out.println(Arrays.toString(A));

        if(A.length == 1) {
            return A;
        }
        int[] left = new int[A.length / 2];
        int[] right = new int[A.length - A.length / 2];

        for (int i = 0; i < A.length / 2; i++) {
            left[i] = A[i];
        }
        for (int i = 0; i < A.length - A.length / 2; i++) {
            right[i] = A[A.length / 2 + i];
        }
        int[] leftSorted = mergeSort(left);
        int[] rightSorted = mergeSort(right);

        int leftPointer = 0;
        int rightPointer = 0;
        int targetPointer = 0;

        while(targetPointer < A.length) {
            if(leftPointer == leftSorted.length) {
                A[targetPointer] = rightSorted[rightPointer];
                targetPointer++;
                rightPointer++;
            } else if (rightPointer == rightSorted.length) {
                A[targetPointer] = leftSorted[leftPointer];
                targetPointer++;
                rightPointer++;
            } else if( leftSorted[leftPointer] < rightSorted[rightPointer]) {
                A[targetPointer] = leftSorted[leftPointer];
                targetPointer++;
                leftPointer++;
            } else {
                A[targetPointer] = rightSorted[rightPointer];
                targetPointer++;
                rightPointer++;
            }
        }
        return A;
    }
}
