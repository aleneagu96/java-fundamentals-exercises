public class SwappExercise {
    public static void main(String[] args) {
//        int a = 13;
//        int b = 20;
//        int x = 0;
//
//        x = a;
//        a = b;
//        b = x;
//        System.out.println(" a is " + a);
//        System.out.println(" b is " + b);
//
////        int z = 5 * 2 + 4 * 2 - 5;
////        System.out.println( z );
//        if ( a > b ){
//            System.out.println(" a is greater");
//        }else{
//            System.out.println(" b is greater");
//        }
//         if ( a % 2 == 0){
//             System.out.println(" a is even");
//         }else{
//             System.out.println(" a is odd");
//         }
//         int year = 2020;
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//            System.out.println(" is leap year");
//        }else{
//            System.out.println(" not a leap year");
//        }
//    int a = 5;
//    if( a % 15 == 0){
//        System.out.println("FizzBuzz");
//    }else if ( a % 3 == 0){
//        System.out.println(" Fizz");
//    }else if( a % 5 == 0){
//        System.out.println(" Buzz");
//    }
//                          SUM
//        int[] myArray = {1, 7, 3, 10, 9};
//        int sum = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            sum = sum + myArray[i];
//
//}
//                 System.out.println( sum );

//                          MAX

//        int[] myArray = { 1, 4, 6, 8, 12};
//        int max = 0;
//        for( int i = 1; i < myArray.length; i++ ){
//            if( max < myArray[i]){
//                max = myArray[i];
//
//            }
//
//        }
//        System.out.println( max );

//                              AVERAGE
//
//        int[] myArray = {1, 7, 3, 10, 9};
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            sum = sum + myArray[i];
//        }
//        avg = sum / myArray.length;
//        System.out.println(avg);

//                              ODD ARRAY ELEMENTS
//     int[] myArray = { 1, 7, 3, 9, 10};
//     for( int i = 0; i < myArray.length; i++){
//         if (myArray[i] % 2 != 0) {
//             System.out.print(myArray[i] + ", ");
//
//         }
//     }

//                  REVERSE ARRAY ELEMENTS
//        int[] myArray = { 2, 4, 7, 9};
////        int[] reversedArray = new int[myArray.length];
////        int j = 0;
//        for( int i = myArray.length - 1 ; i >= 0; i--){
//            System.out.print(myArray[i] + " ");
//        }
//        for( int inter = 0; inter < reversedArray.length; inter++){
//            System.out.println(reversedArray[inter] + " ");
//        }

//                  NUMBER OF EVEN AND ODD ELEMENTS IN AN ARRAY
//        int[] myArray = { 1, 4, 6, 7, 9, 13};
//        int numberOfOdd= 0;
//        int numberOfEven= 0;
//        for( int i = 0; i < myArray.length; i++){
//            if( myArray[i] % 2 == 0){
//                numberOfEven++;
//            }
//        }
//        System.out.println(" Number of even elements is : "+ numberOfEven);
//        System.out.println(" Number of odd elements is : " + (myArray.length - numberOfEven));

//                        DUPLICATE EXERCISE
        int[] myArray = { 1, 7, 3, 7, 2, 6, 3};
        for( int i = 0; i < myArray.length; i++){
            for( int j = i + 1; j < myArray.length; j++)
                if( myArray[i] == myArray[j]){
                    System.out.print( myArray[i] + " ");
                }
        }
    }
}

