package com.j2.w7.pizzaaf;

public class ChicagoPizzaIngredientFactory   implements PizzaIngredientFactory {

 public Dough createDough() {
  return new ThickCrustDough();
 }

 public Cheese createCheese() {
  return new MozzarellaCheese();
 }

}