package sda.jda.ex;

public class Dog {
    private String name;
    private int age;
    private boolean gender; // true = female, false = male
    private String race;
    private int weight;

    private Muzzle muzzle;

    public Dog(String name, int age, boolean gender, String race, int weight, int muzzleSize) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
        Muzzle muzzle = new Muzzle(muzzleSize);
        this.muzzle = muzzle;
    }

    public Dog(boolean gender, String race) {
        this("noName", 0, gender, race, 2, 15);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name + " " + race + " " + age + " " + weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }
}
