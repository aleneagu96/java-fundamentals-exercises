public class CompareStrings {
    public static void main(String[] args) {
        String firstString = "This is a comparison ";
        String secondString = "   THIS is A Comparison";
        System.out.println(compareStringsIgnoreCase(firstString, secondString));
    }
    private static boolean compareStringsIgnoreCase( String inputOne, String inputTwo) {
        if ( inputOne != null && inputTwo != null) {
            return inputOne.trim().equalsIgnoreCase(inputTwo.trim());
        }
        return false;
    }
}
