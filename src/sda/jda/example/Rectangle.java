package sda.jda.example;

public class Rectangle extends Shape {

    public Rectangle() { // daca nu punem nimic se apeleaza constructorul de cla clasa parinte
        System.out.println("SHape rectangle 1: " + super.toString());
    }

    public double getArea() {
        return super.getLenght() + super.getWidth();
    }
}
