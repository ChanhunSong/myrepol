package com.j2.w7.single;

public class Singleton1 {
  private static Singleton1 uniqueInstance= new Singleton1();
  private static int numCalled=0;
 
  private Singleton1() {}
  public static Singleton1 getInstance() {
    System.out.println("numCalled: "+numCalled++);
    return uniqueInstance;
  }
}