package com.j2.w13.after;
import java.util.*;

public class MenuTestDrive {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    나의메뉴  sdf= new 나의메뉴();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}