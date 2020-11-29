public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] myArray = {1, 7, 3, 10, 2, 9 };
        int max = myArray[0];
        int secondMax = myArray[1];
        for( int i = 1; i < myArray.length ; i++){
            for( int j = 1; j < myArray.length; j++){
                if( myArray[i] > max){
                    max = myArray[i];
                }
                if(  myArray[j] < max  ){
                    secondMax =  max--;

                }

            }
        }
        System.out.println(" Second largest number is: " + secondMax);
    }
}
