package animals.pets;
import animals.Animal;

public class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("Гав");
    }
    public void go() {
        System.out.println("Я гуляю на поводке");
    }

    public void drink() {
        System.out.println("Я пью воду");
    }

    public void eat() {
        System.out.println("Я ем кошек");
    }
}