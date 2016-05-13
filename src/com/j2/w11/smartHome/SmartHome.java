package com.j2.w11.smartHome;

public class SmartHome{
  Monitor monitor;
  Desktop desktop;
  Git git;
  Drjava drjava;
  
  SmartHome(Monitor monitor, Desktop desktop, Git git, Drjava drjava){
    this.monitor = monitor;
    this.desktop = desktop;
    this.git = git;
    this.drjava = drjava;
  }
  void beginStudy(){
    System.out.println("beginStudy:");
    monitor.on();
    desktop.on();
    git.open();
    git.pull();
    drjava.open();
    drjava.newClass();
  }
  void endStudy(){
    System.out.println("endStudy:");
    git.add();
    git.commit();
    git.push();
    git.close();
    drjava.saveClass();
    drjava.close();
    desktop.off();
    monitor.off();
  }
  
}