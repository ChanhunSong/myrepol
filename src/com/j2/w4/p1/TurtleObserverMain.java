
package com.j2.w4.p1;
import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;


public class TurtleObserverMain{
  public static void main(String[] args){
    BabyTurtle baby = new BabyTurtle();
    MomTurtle mom= new MomTurtle();
    DadyTurtle dad= new DadyTurtle();
    ProfessorTurtle pro= new ProfessorTurtle();
    baby.addObserver(mom);
    baby.addObserver(dad);
    baby.addObserver(pro);
    mom.moveTo(100,100);
    dad.moveTo(-100,100);
    pro.moveTo(-100,-100);
    
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObserver();
    
    baby.move(-50,150);
    baby.setChanged();
    baby.notifyObserver();
    
    baby.move(90,100);
    baby.setChanged();
    baby.notifyObserver();
    

  }
}

class MomTurtle extends Turtle implements Observer {
  Double babyCurposx;
  Double babyCurposy;
  public void update(Observable o, Object arg){
    System.out.println("update called, counted is" +((Integer)arg).intValue());
    babyCurposx=((BabyTurtle)o).myCurposx;
    babyCurposy=((BabyTurtle)o).myCurposy;
    System.out.println("x ="+babyCurposx+ ", y =" + babyCurposy);
      moveTo(babyCurposx,babyCurposy);
 }
}

class DadyTurtle extends Turtle implements Observer {
  Double babyCurposx;
  Double babyCurposy;
  public void update(Observable o, Object arg){
    System.out.println("update called, counted is" +((Integer)arg).intValue());
    babyCurposx=((BabyTurtle)o).myCurposx;
    babyCurposy=((BabyTurtle)o).myCurposy;
    System.out.println("x ="+babyCurposx+ ", y =" + babyCurposy);
      moveTo(babyCurposx,babyCurposy);
 }
}

class ProfessorTurtle extends Turtle implements Observer {
  Double babyCurposx;
  Double babyCurposy;
  public void update(Observable o, Object arg){
    System.out.println("update called, counted is" +((Integer)arg).intValue());
    babyCurposx=((BabyTurtle)o).myCurposx;
    babyCurposy=((BabyTurtle)o).myCurposy;
    System.out.println("x ="+babyCurposx+ ", y =" + babyCurposy);
      moveTo(babyCurposx,babyCurposy);
 }
}


class BabyTurtle extends Observable {
  Turtle baby;
  Double myCurposx;
  Double myCurposy;
  ArrayList<Observer>obs;
  public BabyTurtle(){
    baby = new Turtle();
    myCurposx=baby.getPos().getX();
    myCurposy=baby.getPos().getY();
    obs= new ArrayList<Observer>();
    
  }
  public void addObserver(Observer o){
    obs.add(o);
  }
  protected void setChanged(){
    myCurposx=baby.getPos().getX();
    myCurposy=baby.getPos().getY();
  }
  public void notifyObserver() {
    for (Observer o : obs)
      o.update(this,1);
  }
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
}
      