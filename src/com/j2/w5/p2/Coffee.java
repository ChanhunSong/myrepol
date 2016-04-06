package com.j2.w5.p2;

public class Coffee extends LiquidDecorator{
    public Coffee(HotelSetting hotelSetting) {
        this.hotelSetting = hotelSetting;
    }
     public String getMenu() {
        return hotelSetting.getMenu() + "+ Coffee";
    }
    public String getSetting() {
        return hotelSetting.getSetting() + "+ mug";
    }
    
}
