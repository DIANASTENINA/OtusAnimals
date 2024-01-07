package animals.birds;
import animals.Animal;

public class Duck extends Animal implements IFLY {

    @Override
    public void say() {
        System.out.println("Кря");
    }
    public void fly() {
        System.out.println("Я лечу");
    }
    public void eat() {
        System.out.println("Я ем хлеб");
    }
    public void drink() {
        System.out.println("Я пью воду");
    }
    public void go() {
        System.out.println("Я хожу хожу переваливаясь");
    }
}