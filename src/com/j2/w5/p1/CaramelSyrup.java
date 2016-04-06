package com.j2.w5.p1;

public class CaramelSyrup extends CondimentDecorator {
    public CaramelSyrup(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", CaramelSyrup";
    }
    public double cost() {
        return .10 + beverage.cost();
    }
}
