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

class Decaf extends Beverage {
 public Decaf() {
  description = "Decaf Coffee";
 }
 public double cost() {
  return 1.05;
 }
}


public class HouseBlend extends Beverage {
 public HouseBlend() {
  description = "House Blend Coffee";
 }
 public double cost() {
  return .89;
 }
}

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
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

class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public double cost() {
        return .10 + beverage.cost();
    }
}

class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public double cost() {
        return .15 + beverage.cost();
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