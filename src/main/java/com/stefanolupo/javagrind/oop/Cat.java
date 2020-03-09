package com.stefanolupo.javagrind.oop;


public class Cat extends Animal {

  public Cat(String name, String type, int age) {
    super(name, type, age);
  }

  public void meow() {
    System.out.println("Meow " + name);
  }



}

