package com.j2.w11.facade;

public class Projector{
  DvdPlayer dvdPlayer;
  Projector(DvdPlayer dvdPlayer){
    this.dvdPlayer= dvdPlayer;
  }
  void on(){
    System.out.println("Projector on");
  }
  void off(){
    System.out.println("Projector off");
  }
  void wideScreenMode(){
    System.out.println("wideScreenMode");
  }  
}
  
  