package com.j2.w12.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive {
  
  public static void main(String[] args) {
    Duck[] ducks = { 
      new Duck("A", 3), 
      new Duck("B", 1),
      new Duck("C", 6),
      new Duck("D", 2),
      new Duck("E", 7), 
      new Duck("F", 5)
    };
    System.out.println("Before :");
    display(ducks);
    Arrays.sort(ducks);
    System.out.println("\nAfter :");
    display(ducks);
    
    Duck[] duckss = { 
      new Duck("A", 3), 
      new Duck("B", 1),
      new Duck("C", 6),
      new Duck("D", 2),
      new Duck("E", 7), 
      new Duck("F", 5)
    };
    Arrays.sort(duckss, new DuckComparator());
    System.out.println("\nAfter :");
    display(duckss);
  }
  public static void display(Duck[] ducks) {
    for (int i = 0; i < ducks.length; i++) {
      System.out.println(ducks[i]);
    }
  }
}