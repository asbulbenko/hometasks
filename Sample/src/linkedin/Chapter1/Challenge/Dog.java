package linkedin.Chapter1.Challenge;

public class Dog {
    String breadDog;
    String colorDog;
    String nameDog;
    int ageDog;

    public Dog(String bread, String color, String name, int age) {
        this.breadDog = bread;
        this.colorDog = color;
        this.nameDog = name;
        this.ageDog = age;
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public void chase() {
        System.out.println("Dog is chasing smb");
    }
}
