package linkedin.Chapter1.Challenge;

// Create a class with 3 attributes and 3 functions that represent a dog
// Create a dog class with a bark method, which prints "Bark!" into console
// Use the main method in the Main class to create and use an instance of your class

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Frenchie", "Pale", "Ozzy", 2);
        System.out.println("Bread of my dog is : " + myDog.breadDog);

        Dog neighbourDog = new Dog("Husky", "Black", "Buran", 5);
        System.out.println("Age of neighbour dog is : " + neighbourDog.ageDog);

        myDog.bark();
        neighbourDog.chase();

    }
}
