package sda.jda.ex;

public class Muzzle {

    private int size;

    public Muzzle(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Muzzle{" +
                "size=" + size +
                '}';
    }
}
