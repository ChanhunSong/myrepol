package com.j2.w5.p2;

public abstract class SolidDecorator extends HotelSetting {
    HotelSetting hotelSetting;
    public abstract String getMenu();
    public abstract String getSetting();
}
