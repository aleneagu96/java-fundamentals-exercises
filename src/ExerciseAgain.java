public class ExerciseAgain {
    public static void main(String[] args) {
        int [] myArray = { 1, 4, 5, 6, 7, 9, 11};
        int number = 0;
        for( int i = 0; i < myArray.length; i++){
            if( myArray[i] % 2 == 0){
                number++;


            }


        }
        System.out.println(" The number of even elements is " + number);
        System.out.println(" The number of odd elements is " + (myArray.length- number));
    }


    }

