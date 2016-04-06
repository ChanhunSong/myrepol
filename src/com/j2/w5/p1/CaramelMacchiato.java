package com.j2.w5.p1;

public class CaramelMacchiato {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new CaramelSyrup(beverage);
        System.out.println("CaramelMacchiato: " + beverage.getDescription() 
                        + " $" + beverage.cost());
    }

}
