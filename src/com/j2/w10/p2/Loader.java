package com.j2.w10.p2;

public class Loader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightoff = new LightOffCommand(light);
    remote.setCommand(0,lightOn, lightoff);
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(0);
    remote.onButtonWasPushed(0);
  }
}