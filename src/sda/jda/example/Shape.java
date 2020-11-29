package sda.jda.example;

import java.util.Objects;

public class Shape extends Object {

    public final static String MM = "mm";
    public final static String CM = "cm";

    private final static String UM_DEFAULT = MM;

    private String um = UM_DEFAULT;

    private int width;
    private int lenght;

    public Shape(String um, int width, int leght) {
        this.um = um;
        this.width = width;
        this.lenght = leght;
    }

    public Shape(int width, int lenght) {
        this(UM_DEFAULT, width, lenght);

    }

    public Shape() {
        System.out.println("Shape created: " + super.toString());

    }

    public void setUm(String newUm) {
        if (newUm.equalsIgnoreCase(MM) || newUm.equalsIgnoreCase(CM) ) {
            if(!this.um.equalsIgnoreCase(newUm)) {
           width = getWidth(newUm);
           lenght = getLenght(newUm);
           this.um = newUm.toLowerCase();

            }
        }
    }

    public String getUm() {
        return um;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    private int getWidth( String inUm) {
        int result = width;
        if (um.equalsIgnoreCase(inUm)) {
            result= width;
        } else if (inUm.equalsIgnoreCase(Shape.MM)) {
            result = width * 10;
        } else {
            result = lenght / 10;
        }
        return result;
    }

    private int getLenght( String inUm) {
        int result = lenght;
        if (um.equalsIgnoreCase(inUm)) {
            result= width;
        } else if (inUm.equalsIgnoreCase(Shape.MM)) {
            result = width * 10;
        } else {
            result = lenght / 10;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "um='" + um + '\'' +
                ", width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return  this.getWidth(shape.um) == shape.width &&
                this.getLenght(shape.um) == shape.lenght;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(Shape.MM), this.getLenght(Shape.MM));
    }
}