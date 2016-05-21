package com.j2.w12.before;

public class Tea{
    
  void prepareRecipe() {
  boilWater();
  steepTeaBag();
  pourInCup();
  addLemon();
 }

 void boilWater() {
  System.out.println("Boiling water");
 }
 void pourInCup() {
  System.out.println("Pouring into cup");
 }
  public void steepTeaBag() {
  System.out.println("steepTeaBag");
 }
 public void addLemon() {
  System.out.println("addLemon");
 }
}