public class CountStringElements {
    public static void main(String[] args) {
        String newString = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33" ;
        System.out.println(newString);
        count(newString);

    }

    private static void count( String myString) {
        char[] character = myString.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int others = 0;
        for (int i = 0; i <myString.length() ; i++) {
            if(Character.isLetter(character[i])){
//                if(Character.isletter( x.charAt(i))){
                letter ++ ;

            }else if(Character.isSpaceChar(character[i])){
                space ++ ;
            }else if(Character.isDigit(character[i])){
                num ++ ;
            }else {
                others ++ ;
            }

        }
        System.out.print(letter + " letters, ");
        System.out.print(space + " spaces, ");
        System.out.print(num + " numbers, ");
        System.out.print(others + " others");

    }
}

