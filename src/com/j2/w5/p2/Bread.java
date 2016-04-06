package com.j2.w5.p2;

public class Bread extends SolidDecorator{
    public Bread(HotelSetting hotelSetting) {
        this.hotelSetting = hotelSetting;
    }
     public String getMenu() {
        return hotelSetting.getMenu() + "+Bread";
    }
    public String getSetting() {
        return hotelSetting.getSetting() + "+ dessert knife";
    }
    
}
