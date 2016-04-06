package com.j2.w5.p2;

public abstract class LiquidDecorator extends HotelSetting {
    HotelSetting hotelSetting;
    public abstract String getMenu();
    public abstract String getSetting();
}