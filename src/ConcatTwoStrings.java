public class ConcatTwoStrings {
    public static void main(String[] args) {
        stringConcatenation("Java", "Fundamentals");
        String concatString = stringConcatenation("Java", "Fundamentals");
        System.out.println(concatString);
    }

    private static String stringConcatenation(String java, String fundamentals) {
        if( java == null || fundamentals == null ) {
            return "" ;

        }
        if( java.length() <= 1 || fundamentals.length() <= 1){
            return "" ;
        }
        String firstModified = java.substring(1);
        String secondModified = fundamentals.substring(1);
        return firstModified.concat(secondModified);

    }
}
