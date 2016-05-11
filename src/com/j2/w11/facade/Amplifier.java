package com.j2.w11.facade;

public class Amplifier {
  Tuner tuner;
  DvdPlayer dvd;
  public void on() {
    System.out.println("Amplifier" + " on");
  }
  public void off() {
    System.out.println("Amplifier" + " off");
  }
  public void setDvd(DvdPlayer dvd) {
    System.out.println("Amplifier"+ " setting DVD player to " + dvd);
    this.dvd = dvd;
  }
  public void setTuner(Tuner tuner) {
    System.out.println("Amplifier" + " setting tuner to " + dvd);
    this.tuner = tuner;
  }
  public void setVolume(int level) {
    System.out.println("Amplifier" + " setting volume to " + level);
  }
}