package com.j2.w12.after;

public abstract class CaffeineBeverage {
  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater() {
    System.out.println("Boiling water");
  }
  
  void pourInCup() {
    System.out.println("Pouring into cup");
  }
}