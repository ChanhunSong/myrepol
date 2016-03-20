package headfirst.strategy;

public abstract class Duck{
  FlyBehavior flyBehavior;
  QuackBevavior quackBehavior;

  public Duck() {}
  public void FlyBehavior(FlyBehavior fb) {
    flyBehavior= fb;
  }
  public void QuackBehavior(QuackBehavior qb){
    QuackBehavior= qb;
 } 
  abstract void display();
 
  public void performFly() {  
    flyBehavior.fly();
  }
   public void performQuack() {
     quackBehavior.quack();
   }
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
 }