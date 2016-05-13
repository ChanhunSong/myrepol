package com.j2.w11.smartHome;

public class Desktop{
  Git git;
  Drjava drjava;
  Desktop(Git git,Drjava drjava){
    this.git = git;
    this.drjava = drjava;
  }
    void on(){
    System.out.println("Desktop on");
  }
  void off(){
    System.out.println("Desktop off");
  }      
}