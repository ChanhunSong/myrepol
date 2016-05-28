package com.j2.w13.after;
import java.util.ArrayList;

public class CafeMenu implements Menu {
  ArrayList menuItems;
  
  public CafeMenu() {
    menuItems = new ArrayList();
    
    addItem("Coffee", 
            "Coffee", true, 2.99);
    addItem("Milk", 
            "Milk", false, 2.99);
    addItem("Water",
            "Water", true, 3.49);
    addItem("Waffles",
            "Waffles", true, 3.59);
  }
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems() {
    return menuItems;
  }
  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
  public String toString() {
    return "CafeMenu";
  }
}