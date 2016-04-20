package com.j2.w7.single3;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
 
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }
   public static ChocolateBoiler getInstance() {
     if (uniqueInstance == null) {
       System.out.println("Creating unique instance of Chocolate Boiler");
       uniqueInstance = new ChocolateBoiler();
     }
     return uniqueInstance;
   }
   public void fill() {
     if (isEmpty()) {
       empty = false;
       boiled = false;
     }
   }
   public boolean isEmpty() {
     return empty;
   }
}
