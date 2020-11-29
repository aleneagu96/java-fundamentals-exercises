public class LoopIncrementN {
    public static void main(String[] args) {
        incrementNumber(4);

    }
    private static void incrementNumber(int number) {
        int num = number;
        int count = 0;
        while( count < number) {
            System.out.print(num + " ");
            count++;
            num+= number;
        }
    }
}



//        int number = 4;
//        int incrementUntil = 16;
//        int copyOfNumber = number;
//        System.out.println(number);
//        for (int i = 0; i <= number; i++) {
//            if (number < incrementUntil) {
//                number += copyOfNumber;
//                System.out.println(number);
//            }
//        }