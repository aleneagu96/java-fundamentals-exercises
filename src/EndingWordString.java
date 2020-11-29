public class EndingWordString {
    public static void main(String[] args) {
        String firstString = "Java Exercises";
        String secondString = "ses";
        String thirdString = "Jav";
        endsWithString(firstString, secondString);
        startsWithString(firstString,secondString);
        System.out.println(firstString.endsWith(secondString));
        System.out.println(firstString.startsWith(thirdString));
    }

    private static boolean endsWithString(String input, String sufix) {
        if (input != null && sufix != null) {
            return input.endsWith(sufix);
        }
        return false;
    }

    //    create the same method which will check that the first string begins with the second one( prefix)

    private static boolean startsWithString( String input, String prefix) {
        if( input != null && prefix != null) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
