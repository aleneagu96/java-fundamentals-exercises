public class Sufixing {
    public static void main(String[] args) {
//        String word = "home";
//        String wordSufix = word + "inc";
//        System.out.println(wordSufix);
//   System.out.println(prefixAndSufix("abc"));

        String prefixAndSufix =prefixAndSufix("abc");
        System.out.println(prefixAndSufix);
        String noPrefixAndSufix = prefixAndSufix.substring(3, prefixAndSufix.length() - 3);
        System.out.println(noPrefixAndSufix);
    }
    public static String prefixAndSufix (String input){
        StringBuilder fragment = new StringBuilder("inc");
        fragment.append(input).append("inc");

        return fragment.toString();
    }

}

