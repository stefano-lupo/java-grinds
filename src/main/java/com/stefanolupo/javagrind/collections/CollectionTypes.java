package com.stefanolupo.javagrind.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTypes {

  public static void main(String[] args) {
//    arrays();
//    lists();
//    sets();
    maps();
  }

  private static void maps() {
    // Maps: allow us to store key --> value pairs
    // Very fast lookups
    // Insanely handy
    Map<String, Integer> agesByName = new HashMap<>();
    agesByName.put("Stefano", 24);
    agesByName.put("Frank", 55);

    // Get the age of stefano
    System.out.println("Stefano is " + agesByName.get("Stefano") + " years old");
    System.out.println("Frank is " + agesByName.get("Frank") + " years old");



    if (agesByName.containsKey("Kevin")) {
      System.out.println("Kevins age is " + agesByName.get("Kevin"));
    } else {
      System.out.println("Don't know what age kevin is");
    }

    if (agesByName.containsValue(24)) {
      System.out.println("Found some one who is 24");
    }
  }

  private static void sets() {
    // Sets (think mathematical sets)
    // No duplicates
    // No guaranteed iteration order
    // Backed by hash table so constant order lookups
    Set<Integer> mySet = new HashSet<>();
    mySet.add(100);
    mySet.add(100);
    mySet.add(300);

    // For each any collection
    for (Integer thingInSet : mySet) {
      System.out.println(thingInSet);
    }

    // Does a set contain an item?
    if (mySet.contains(100)) {
      System.out.println("Found 100 in set");
    }

    System.out.println();
    System.out.println();
  }

  private static void lists() {
    // Lists can dynamically grow and shrink
    List<Integer> myList = new ArrayList<>();
    myList.add(100);
    myList.add(100);
    myList.add(200);
    // ...

    myList.set(2, 400);

    myList.contains(100);


    // For each loops are better
    for (Integer x : myList) {
      System.out.println(x);
    }

    // Does a list contain an item?
    for (Integer x : myList) {
      if (x == 100) {
        System.out.println("Found 100 in list");
      }
    }

    System.out.println();
    System.out.println();
  }

  private static void arrays() {
    // Arrays can only hold a specific number of items (think malloc)
    int[] myArr = new int[5];
    myArr[0] = 100;
    myArr[1] = 200;
    // ....

    // for loops are gross
    for (int i=0; i<myArr.length; i++) {
      System.out.println(myArr[i]);
    }

    System.out.println();
    System.out.println();
  }

}
