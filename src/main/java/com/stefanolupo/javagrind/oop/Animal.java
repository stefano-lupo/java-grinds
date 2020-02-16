package com.stefanolupo.javagrind.oop;

public class Animal {

  public String name;
  public String type;
  public int age;

  // Constructor's make instances of the animal class
  public Animal(String name, String type, int age) {
    this.name = name;
    this.type = type;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hey Im " + name);
  }


}
