public class LoopEvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i += 2) {
            System.out.printf("%d ,", i);
        }
        System.out.println();
        int i = 2;
        while(i <= 100) {
            System.out.printf("%d ,", i);
            i += 2;

        }
    }
}
