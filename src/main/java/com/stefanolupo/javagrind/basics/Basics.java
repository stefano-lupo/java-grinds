package com.stefanolupo.javagrind.basics;

public class Basics {

  /*
    1 - Basic nonsense
    2 - Conditional, loops
    3 - Functions
    4 - Collections
    5 - Object oriented programming
    5b - Enums
    6 - Polymorphism
    7 - Inheritance (maybe inheritance vs composition)
    8 - Streams
    9 - Functional Interfaces


   */

  public static void main(String[] args) {

    String animalName = "Donald";
    String animalType = "Lion";
    int animalAge = 15;

    System.out.println("Hello I'm " + animalName + ", I am a " + animalType + " who is " + animalAge + " years old.");

    String animalName2 = "Fred";
    String animalType2 = "Dog";
    int animalAge2 = 4;

    System.out.println("Hello I'm " + animalName2 + ", I am a " + animalType2 + " who is " + animalAge2 + " years old.");

    int ageDifference = sayHelloToOtherAnimal(animalName, animalType, animalAge, animalName2, animalType2, animalAge2);

  }

  static int sayHelloToOtherAnimal(String myName, String myType, int myAge,
                             String otherAnimalName, String otherAnimalType, int otherAnimalAge) {
    System.out.println("Hello " + otherAnimalName);

    if (otherAnimalType.equals(myType)) {
      System.out.println("Wow, we're the same animal");
    } else {
      System.out.println("I notice that youre a " + otherAnimalType);
    }

    int ageDifference = otherAnimalAge - myAge;
    System.out.println("age difdferecne " + ageDifference);

    return ageDifference;
  }
}
