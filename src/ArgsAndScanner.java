import java.util.Scanner;
public class ArgsAndScanner {
    public static void main(String[] args) {
//        System.out.println("My name is " + args[0]);
//        System.out.println("My age is " + args[1]);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your name: ");
        String name = scanner.nextLine();
        System.out.println("Introduce your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + name + " and you've got " + age + " years");

    }
}
