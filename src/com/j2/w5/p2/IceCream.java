package com.j2.w5.p2;

public class IceCream extends SolidDecorator{
    public IceCream(HotelSetting hotelSetting) {
        this.hotelSetting = hotelSetting;
    }
     public String getMenu() {
        return hotelSetting.getMenu() + "+IceCream";
    }
    public String getSetting() {
        return hotelSetting.getSetting() + " + dessert spoon";
    }
    
}
