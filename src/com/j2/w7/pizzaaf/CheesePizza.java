package com.j2.w7.pizzaaf;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;
  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
 
  void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    cheese = ingredientFactory.createCheese();
  }
}
