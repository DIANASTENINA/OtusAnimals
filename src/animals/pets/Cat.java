package animals.pets;
import animals.Animal;

public class Cat extends Animal {
    @Override
    public void say() {
        super.say();
        System.out.println("Мяу");
    }
    public void go() {
        System.out.println("Я иду");
    }
    public void drink() {
        System.out.println("Я пью молоко");
    }
    public void eat() {
        System.out.println("Я ем мышей");
    }
}