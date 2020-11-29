public class StringLenght {
    public static void main(String[] args) {
        String expression = "This is Java!" ;
        System.out.println(stringLenght(expression) + " characters");

    }
    private static int stringLenght( String input ) {
        if( input != null) {
            return input.length();

        }
        return 0;

    }
}
