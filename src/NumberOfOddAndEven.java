public class NumberOfOddAndEven {
        public static void main(String[] args) {
            int[] myArray = { 1, 7, 3, 10, 9};
            int count = 0;
            for( int i = 0; i < myArray.length; i++){
                if( myArray[i] % 2 == 0){
                    count++;
                }
            }
            System.out.print(" Odd = "+ (myArray.length - count) + " ;");
            System.out.print("Even = " + count);

        }
    }

