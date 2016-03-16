package headfirst.strategy;

public MallardDuck extends Duck{
  public MallardDuck() {
    quackBehavior = Quack;
    flyBehavior= new flyBehavior();
  }
  