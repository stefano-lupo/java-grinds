package com.stefanolupo.javagrind.oop;

import java.util.ArrayList;
import java.util.List;

public class MyProgramRunner {

  public static void main(String[] args) {


    // Create (instantiating) an animal
    Animal myAnimal = new Animal("joe", "lion", 9);

    Animal otherAnimal = new Animal("Pete", "dog", 18);

    Zoo zoo = new Zoo();
    zoo.myAnimals.add(myAnimal);
    zoo.myAnimals.add(otherAnimal);

    String x = "hi";

    Class<?> theAniamalClass = Animal.class;

    zoo.getAnimalsToSayHi();

//    System.out.println(myAnimal.age);
//    System.out.println(otherAnimal.age);

//    makeAnimalSayHi(myAnimal);
//    makeAnimalSayHi(otherAnimal);
//

//    Animal myOtherAnimal = new Animal();

    Dog bobby = new Dog("Bobby", "DOG", 10);
    bobby.bark();

    Cat jessie = new Cat("jessie", "CAT", 9);
    jessie.meow();
    jessie.talk("hello world");

    List<Animal> myPets = new ArrayList<>();
    myPets.add(bobby);
    myPets.add(jessie);

    for (Animal pet : myPets) {
      pet.talk(" wow");
    }

    Human stefano = new Human("Stefano");

    List<CanTalk> talkingThings = new ArrayList<>();
    talkingThings.add(stefano);
    talkingThings.add(bobby);

    for (CanTalk thingThatCanTalk : talkingThings) {
      thingThatCanTalk.talk("Wow");
    }

    Animal oneOfMyPets = myPets.get(0);
    Dog oneOfMyPetsAsDog = (Dog) oneOfMyPets;

    CanTalk alien = new CanTalk() {
      @Override
      public void talk(String message) {
        System.out.println("Alien: " + message);
      }
    };

    talkingThings.add(alien);

  }


}
