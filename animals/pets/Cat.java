package animals.pets;
import data.ColorData;
import animals.Animal;

public class Cat extends Animal {
    public Cat (int age, String name,int weight, ColorData colorData) {
        super(age, name, weight, colorData);
    }

    public Cat() {
    }

    public void say() {
        System.out.println( "Мяу");

    }
}
