package sda.jda.example;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape(Shape.CM, 10, 10);
        System.out.println("s1: " + s1 );

        Shape s2 = new Shape(Shape.MM, 100, 100);
        System.out.println("s2: " + s2 );

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        s1.setUm(Shape.MM);
        System.out.println("s1: " + s1 );
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

    }



}

