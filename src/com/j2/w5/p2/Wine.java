package com.j2.w5.p2;

public class Wine extends LiquidDecorator{
    public Wine(HotelSetting hotelSetting) {
        this.hotelSetting = hotelSetting;
    }
     public String getMenu() {
        return hotelSetting.getMenu() + "+ Wine";
    }
    public String getSetting() {
        return hotelSetting.getSetting() + "+ glass";
    }
    
}
