package com.stefanolupo.javagrind.oop;

public class MyProgramRunner {

  public static void main(String[] args) {


    // Create (instantiating) an animal
    Animal myAnimal = new Animal("joe", "lion", 9);

    Animal otherAnimal = new Animal("Pete", "dog", 18);

    Zoo zoo = new Zoo();
    zoo.myAnimals.add(myAnimal);
    zoo.myAnimals.add(otherAnimal);


    zoo.getAnimalsToSayHi();

//    System.out.println(myAnimal.age);
//    System.out.println(otherAnimal.age);

//    makeAnimalSayHi(myAnimal);
//    makeAnimalSayHi(otherAnimal);
//

//    Animal myOtherAnimal = new Animal();
  }


}
