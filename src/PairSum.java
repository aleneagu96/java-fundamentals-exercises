public class PairSum {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 7, 3, 10, 2, 9, 0, 4};
        for( int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == 4) {
                    System.out.print(myArray[i] + "-");
                    System.out.print(myArray[j] + "= ");
                    System.out.println(myArray[i] + myArray[j]);
                }
            }
        }

    }
}
