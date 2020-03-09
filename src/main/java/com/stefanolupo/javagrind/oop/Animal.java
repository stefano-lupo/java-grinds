package com.stefanolupo.javagrind.oop;

public class Animal implements CanTalk {

  public String name;
  public String type;
  public int age;

  // Constructor's make instances of the animal class
  public Animal(String name, String type, int age) {
    this.name = name;
    this.type = type;
    this.age = age;
  }

  public void talk(String message) {
    System.out.println("Animal: " + message);
  }

  public void derp() {

  }

}
