package com.stefanolupo.javagrind.oop;

public class Human implements CanTalk {

  String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public void talk(String message) {
    System.out.println("Human: " + message);
  }

}
