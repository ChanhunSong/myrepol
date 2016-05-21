package com.j2.w12.before;

public class Coffee{
    
  void prepareRecipe() {
  boilWater();
  brew();
  pourInCup();
  addCondiments();
 }

 void boilWater() {
  System.out.println("Boiling water");
 }
  
 void pourInCup() {
  System.out.println("Pouring into cup");
 }
  public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 public void addCondiments() {
  System.out.println("Adding Sugar and Milk");
 }
}
  

