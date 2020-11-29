public class LoopDivisibleNumbers {
    public static void main(String[] args) {
        System.out.print("Divided by 3: ");
        extractAndPrintMultipliers(3);
        System.out.println();
        System.out.print("Divided by 5: ");
        extractAndPrintMultipliers(5);
        System.out.println();
        System.out.print("Divided by 3 and 5: ");
        extractAndPrintMultipliers(15);
    }
    private static void extractAndPrintMultipliers(int num) {
        for (int i = 1; i < 100; i++) {
            if(i % num == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
