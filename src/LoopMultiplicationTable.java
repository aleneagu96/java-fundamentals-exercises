public class LoopMultiplicationTable {
    public static void main(String[] args) {
        int number = 8;
        multiplication(number);
        
    }
    private static void multiplication(int num) {
        for (int i = 1; i <= 10 ; i++) {
            int multiplied = num * i ;
            System.out.printf("%d x %d = %d \n", num, i, multiplied);
            
        }
        
    }
}
