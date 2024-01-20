package animals.birds;
import data.ColorData;
import animals.Animal;

public class  Duck extends Animal implements Animals.birds.IFLY {

    public Duck(int age, String name, int weight, ColorData colorData) {
        super(age, name, weight, colorData);
    }

    public Duck() {
    }

    public void fly() {
        System.out.println("Я лечу");
    }
}