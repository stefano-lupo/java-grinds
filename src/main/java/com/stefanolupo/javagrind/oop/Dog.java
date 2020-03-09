package com.stefanolupo.javagrind.oop;

public class Dog extends Animal {

  public Dog(String name, String type, int age) {
    super(name, type, age);
  }

  public void bark() {
    System.out.println("Bark " + name);
  }


  @Override
  public void derp() {

  }
}
