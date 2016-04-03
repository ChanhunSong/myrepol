package headfirst.decorator.starbuzz;

abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

class Espresso extends Beverage {
  
  public Espresso() {
    description = "Espresso";
  }
  public double cost() {
    return 1.99;
  }
}  

class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast Coffee";
  }
  public double cost() {
    return .99;
  }
}

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();//super class fountion die
}    


class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage b) {//ex1
        beverage = b;
    }
    public String getDescription() {//ex2
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return  beverage.cost() + .20 ;
    }
}

class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage b) {
        beverage = b;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public double cost() {
        return .10 + beverage.cost();
    }
}

public class StarbuzzCoffee {
    public static void main(String args[]) {
      
        Beverage b = new DarkRoast();//ex3
        Beverage mb= new Mocha(b);
        Beverage wmb = new Whip(mb);
        System.out.println(wmb.getDescription());
        System.out.println(wmb.cost());
 
 
    }
}