package com.j2.w13.after;
import java.util.*;

public class MenuTestDrive {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    ���Ǹ޴�  sdf= new ���Ǹ޴�();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}