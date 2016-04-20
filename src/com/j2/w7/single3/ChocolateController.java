package com.j2.w7.single3;

public class ChocolateController {
  public static void main(String args[]) {
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
  }
}
