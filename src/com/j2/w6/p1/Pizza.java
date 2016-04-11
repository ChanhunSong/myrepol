package com.j2.w6.p1;

public abstract class Pizza{
  String name;
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
}