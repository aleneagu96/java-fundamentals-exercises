public class UpCase {
    public static void main(String[] args) {
        String[] array = { " Asd", "abc", " ACb"};

        for( int i = 0; i < array.length; i++){

            array[i]= array[i].toUpperCase();
            System.out.print(array[i]+ " ");
        }


    }
}
