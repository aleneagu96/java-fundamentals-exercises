public class ExtractString {
    public static void main(String[] args) {
        String input = "Programmer";
        System.out.println(extractString(input));

    }
    private static String extractString( String input) {
        if ( input != null ) {
            String firstS = input.substring(0, input.length()/2);
            return firstS;

        }
        return "";
    }
}
