public class JavaPattern {
    public static final String CHAR_J = "J";
    public static final String CHAR_A = "a";
    public static final String CHAR_V = "V";
    public static final String FOUR_SPACES = "    ";
    public static final String THREE_SPACES = "   ";
    public static final String TWO_SPACES = "  ";
    public static final String ONE_SPACE = " ";
    public static final String FIVE_SPACES = "     ";
    public static final String AAAA = "aaaaa";

    public static void main(String[] args) {
        StringBuilder firstRow = new StringBuilder(THREE_SPACES);
        firstRow.append(CHAR_J).append(FOUR_SPACES).append(CHAR_A).append(TWO_SPACES).append(CHAR_V).append(FIVE_SPACES)
                .append(CHAR_V).append(TWO_SPACES).append(CHAR_A);

        StringBuilder secondRow = new StringBuilder(THREE_SPACES);
        secondRow.append(CHAR_J).append(THREE_SPACES).append(CHAR_A).append(ONE_SPACE).append(CHAR_A).append(TWO_SPACES)
                .append(CHAR_V).append(THREE_SPACES).append(CHAR_V).append(TWO_SPACES).append(CHAR_A).append(ONE_SPACE)
                .append(CHAR_A);

        StringBuilder thirdRow = new StringBuilder(CHAR_J).append(TWO_SPACES).append(CHAR_J).append(TWO_SPACES).append(AAAA)
                .append(TWO_SPACES).append(CHAR_V).append(ONE_SPACE).append(CHAR_V).append(TWO_SPACES).append(AAAA);

        StringBuilder fourthRow = new StringBuilder(ONE_SPACE).append(CHAR_J).append(CHAR_J).append(TWO_SPACES).append(CHAR_A)
                .append(FIVE_SPACES).append(CHAR_A).append(TWO_SPACES).append(CHAR_V).append(TWO_SPACES).append(CHAR_A)
                .append(FIVE_SPACES).append(CHAR_A);

        System.out.println(firstRow);
        System.out.println(secondRow);
        System.out.println(thirdRow);
        System.out.println(fourthRow);
    }
}
