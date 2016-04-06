package com.j2.w5.p2;

public class Water extends LiquidDecorator{
    public Water(HotelSetting hotelSetting) {
        this.hotelSetting = hotelSetting;
    }
     public String getMenu() {
        return hotelSetting.getMenu() + "+ Water";
    }
    public String getSetting() {
        return hotelSetting.getSetting() + "+ goblet";
    }
    
}
