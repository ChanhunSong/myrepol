package com.j2.w13.after;

public class 나의메뉴  implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public 나의메뉴() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("불고기 ",
                "불+고기", true, 2.99);
        addItem("김치찌개",
                "김치+찌개", false, 2.99);
        addItem("짜장면",
                "짜장 +면", false, 3.29);
        addItem("초밥",
                "회+밥", false, 3.05);
        addItem("스프",
                "좋다", true, 3.99);
        addItem("우동",
                "우웅동", true, 3.89);
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);//upcasting
    }
}