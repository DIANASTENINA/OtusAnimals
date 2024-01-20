package animals.pets;
import data.ColorData;
import animals.Animal;

public class Dog  extends Animal {

    public Dog() {
    }

    public Dog (int age, String name, int weight, ColorData colorData) {
            super(age, name, weight, colorData);
        }


        public void say() {
            System.out.println("Гав");
        }
}
