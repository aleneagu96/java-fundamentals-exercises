public class OddStringIndexes {
    public static void main(String[] args) {
//        String [] myArray = { "a", "b", "c", "d", "e", "f"};
//        for ( int i = 0; i < myArray.length; i++){
//            if( i % 2 == 0 ){
//                System.out.print(myArray[i]);
//            }
//        }
        StringBuilder evenIndex = new StringBuilder( " ");
        String [] myArray ={ "a", "b", "c", "d", "e"};
        for( int i = 0; i < myArray.length; i++){
            if( i % 2 == 0){
                evenIndex.append(myArray[i]);
            }
        }
        System.out.print(evenIndex);
    }
}
