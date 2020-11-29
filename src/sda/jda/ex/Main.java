package sda.jda.ex;

public class Main {
    public static void main(String[] args) {
        Dog a = new Dog(true, "goldenRetriver" );
        Dog b = new Dog("Rex", 3, false, "labrador", 20, 12 );
        System.out.println("a = " + a.getName());
        System.out.println("b = " + b.getName());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b.setWeight(-15);
        System.out.println("b = " + b);

        a.getMuzzle();
        System.out.println("a muzzle: " + a.getMuzzle());

    }
}
