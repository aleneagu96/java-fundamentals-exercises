import java.util.Arrays;

public class AgainEx {
    public static void main(String[] args) {
//        System.out.println("     1");
//        System.out.println("    222");
//        System.out.println("   33333");
//        System.out.println("  4444444");
//        System.out.println(" 5555555555");
//         for the rows:
        for( int i = 1; i<= 5; i++) {
            for( int j = 1; j <= i ;j--) {
                System.out.print(" " +i);
            }
            System.out.println();
        }
    }
}