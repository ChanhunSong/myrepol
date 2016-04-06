package com.j2.w5.p2;

public class Steak extends SolidDecorator{
    public Steak(HotelSetting hotelSetting) {
        this.hotelSetting = hotelSetting;
    }
     public String getMenu() {
        return hotelSetting.getMenu() + "+Steak";
    }
    public String getSetting() {
        return hotelSetting.getSetting() + "+ main knife + main fork";
    }
    
}
