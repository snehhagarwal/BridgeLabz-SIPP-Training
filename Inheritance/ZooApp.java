package Inheritance;

public class ZooApp {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);
        Animal myBird = new Bird("Tweety", 1);

        myDog.displayInfo();
        myDog.makeSound();

        myCat.displayInfo();
        myCat.makeSound();

        myBird.displayInfo();
        myBird.makeSound();
    }
}
