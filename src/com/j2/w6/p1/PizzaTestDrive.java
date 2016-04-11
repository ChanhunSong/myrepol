package com.j2.w6.p1;

public class PizzaTestDrive{
   public static void main(String[] args) {
     PizzaStore nyStore = new NYPizzaStore();
     Pizza pizza = nyStore.orderPizza("cheese");
     pizza.getName();
   }
}