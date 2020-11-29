public class StringReverse {
    public static void main(String[] args) {
       String exampleString = "avaJ";
       reverseString(exampleString);
        System.out.println(reverseString(exampleString));

    }

    private static String reverseString(String exampleString) {
        if( exampleString != null){
            StringBuilder reversal = new StringBuilder(exampleString);
            return reversal.reverse().toString();
        }
        return "";
    }
}
