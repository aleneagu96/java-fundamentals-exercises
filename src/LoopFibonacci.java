public class LoopFibonacci {
    public static void main(String[] args) {
//  a = 0; b = 1;
//  print a;
//  aux = b;
//  b = a + b;
//  a = aux;
        int n = 10;
        int a = 0;
        int b = 1;
        int aux = 0;
        int counter = 0;
        while(counter < n) {
            System.out.print(a + " ");
            aux = b;
            b = a + b;
            a = aux;
            counter++;
        }
    }
}