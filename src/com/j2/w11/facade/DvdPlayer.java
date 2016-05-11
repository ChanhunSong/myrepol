package com.j2.w11.facade;

public class DvdPlayer{
  Amplifier amp;
  DvdPlayer(Amplifier amp){
    this.amp= amp;
  }
  void on(){
    System.out.println("DvdPlayer on");
  }
  void off(){
    System.out.println("DvdPlayer off");
  }
  void play(String str){
    System.out.println(str +"play");
  }  
  void stop(){
    System.out.println("DvdPlayer stop");
  }    
  void eject(){
    System.out.println("DvdPlayer eject");
  }      
}
