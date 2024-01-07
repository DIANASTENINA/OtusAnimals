package animals;

import validators.NumberValidator;
import  java.util.Scanner;
import  java.util.regex.Pattern;

public abstract class Animal {
   private int age = -1;
   private String name = "";
   private int weight = -1;
   private String color = "";

private NumberValidator numberValidator = new NumberValidator();
   public void say() {
      System.out.println("Я говорю");
   }
   public void go() {
      System.out.println("Я иду");
   }
   public void drink() {
      System.out.println("Я пью");
   }
   public void eat() {
      System.out.println("Я ем");
   }

   public void setName(String name) {
      this.name = name;
   }
   public void setAge(int age) {

      this.age = age;
   }
   public void setWeight(int weight) {
      this.weight = weight;
   }
   public void setColor(String color) {
      this.weight = weight;
   }


   public String getName() {
      return name = name;
   }
   public int getAge() {
      return age = age;
   }
   public int getWeight() {
      return weight = weight;
   }
   public String getColor() {
      return color = color;
   }

   @Override
   public String toString() {
      String yearCase = getYearCase();
      if (yearCase == null) {
         return "Возраст неверный";
      }

      return String.format("Привет! меня зовут %s, мне %d %S, я вешу - %d кг, мой цвет - %s",
              this.name,
              this.age,
              yearCase,
              this.weight,
              this.color
      );
   }
   private String getYearCase() {

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

       return "года";
   }
}

