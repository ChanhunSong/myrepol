package com.j2.w13.after;

public class ���Ǹ޴�  implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public ���Ǹ޴�() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("�Ұ�� ",
                "��+���", true, 2.99);
        addItem("��ġ�",
                "��ġ+�", false, 2.99);
        addItem("¥���",
                "¥�� +��", false, 3.29);
        addItem("�ʹ�",
                "ȸ+��", false, 3.05);
        addItem("����",
                "����", true, 3.99);
        addItem("�쵿",
                "�����", true, 3.89);
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