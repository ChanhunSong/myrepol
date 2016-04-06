package com.j2.w5.p2;

public class Manual {
    public static void main(String args[]) {
        HotelSetting hotelSetting = new Buffet();
        hotelSetting =new Bread(hotelSetting);
        hotelSetting =new Coffee(hotelSetting);
        hotelSetting =new Water(hotelSetting);
        hotelSetting =new Steak(hotelSetting);
        hotelSetting =new IceCream(hotelSetting);
        System.out.println(hotelSetting.getMenu()  +" setting: " +hotelSetting.getSetting());
         
        HotelSetting hotelSetting1 = new Party();
        hotelSetting1=new Bread(hotelSetting1);
        hotelSetting1 =new Coffee(hotelSetting1);
        hotelSetting1 =new Water(hotelSetting1);
        hotelSetting1 =new Steak(hotelSetting1);
        hotelSetting1 =new Wine(hotelSetting1);
        System.out.println(hotelSetting1.getMenu() +" setting: "  +hotelSetting1.getSetting());

    }
}
