package com.j2.w7.pizzaaf;

public abstract class Pizza{
  String name;
  Dough dough;
  Cheese cheese;
  void prepare(){
    System.out.println("prepare" +name);
  }
  void bake(){
    System.out.println("bake");
  }
  void cut(){
    System.out.println("cut");
  }
   void box(){
    System.out.println("box");
  }
   public String getName(){
     return name;
   }
   void setName(String name) {
     this.name = name;
   }
}