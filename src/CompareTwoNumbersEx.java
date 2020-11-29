public class CompareTwoNumbersEx {
    public static void main(String[] args) {
        int a = 25;
        int b = 25;
        compareNumbers(25,28);
    }
    public static void compareNumbers( int a, int b) {
        if ( a == b){
            System.out.println( a + " = " + b);
        } else {
            System.out.println( a + " != " + b);
        }
        if ( a < b){
            System.out.println(a + " < " + b);
        } else  {
            System.out.println(a + " >= " + b);
        }if( a <= b){
            System.out.println(a + " <= " + b);
        }else {
            System.out.println(a + ">" + b);
        }

    }
}


// Write a Java program to compare two numbers and print if they are equal or different,
// smaller, larger, smaller or equal, larger or equal: 25; 39 25 != 39
//25 < 39
//25 <= 39