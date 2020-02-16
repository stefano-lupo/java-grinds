package com.stefanolupo.javagrind.oop;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

  public List<Animal> myAnimals = new ArrayList<>();

  public Zoo() {

  }

  public void getAnimalsToSayHi() {
    for (Animal theAnimal : myAnimals) {
      theAnimal.sayHello();
    }
  }

}
