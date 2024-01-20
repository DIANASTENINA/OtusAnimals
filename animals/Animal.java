package animals;
import data.ColorData;

public abstract class Animal {
   private int age = -1;
   private String name = "";
   private int weight = -1;
   private ColorData color = null;

   public Animal(int age, String name, int weight, ColorData colorData) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.color = colorData;
   }

   public Animal() {
   }

   public void say() {
      System.out.println("Я ем");
   }

   ;

   public void go() {
      System.out.println("Я иду");
   }

   ;

   public void drink() {
      System.out.println("Я пью");
   }

   ;

   public void eat() {
      System.out.println("Я ем");
   }

   ;

   public void setName(String name) {
      this.name = name;
   }


   public void setAge(int age) {
      this.age = age;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public void setColor(ColorData color) {
      this.color = color;
   }

   public String getName() {
      return name;
   }


   public int getAge() {
      return age;
   }

   public int getWeight() {
      return weight;
   }

   public ColorData getColor() {
      return color;
   }

   @Override
   public String toString() {

      String yearPadeg = getYearPadej();
      if (yearPadeg == null) {
         return "Возраст введен неверно";
      }

      return String.format("Привет! меня зовут %s, мне %d %S, я вешу - %d кг, мой цвет - %s",
              this.name,
              this.age,
              yearPadeg,
              this.weight,
              this.color.getName()
      );
   }

   private String getYearPadej() {

      if (this.age <= 0 || this.age > 50) {
         return null;
      }


      if (this.age >= 11 && this.age <= 19) {
         return "лет";
      }

      int ostatok = this.age % 10;
      if (ostatok == 0 || ostatok >= 5) {
         return "лет";
      }

      if (ostatok == 1) {
         return "год";
      }

       return null;
   }
}







