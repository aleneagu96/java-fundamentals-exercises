public class LowerCaseString {
    public static void main(String[] args) {
        String testString = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG" ;
//        toLowerCase(testString);
        System.out.println(toLowerCase(testString));
//        toLowerCase(null);
        System.out.println(toLowerCase(null)) ;

    }
    private static String toLowerCase( String input) {
        if(input != null) {
            return input.toLowerCase();
        }
        return "";

    }

}
