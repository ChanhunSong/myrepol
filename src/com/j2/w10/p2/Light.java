package com.j2.w10.p2;

public class Light {
  int level;

  public void on() {
    level = 100;
    System.out.println("on");
  }

  public void off() {
    level = 0;
    System.out.println("off");
  }

  public void dim(int level) {
    this.level = level;
    if (level == 0) {
      off();
    }
    else {
     System.out.println("Light is dimmed to " + level);
    }
  }

  public int getLevel() {
    return level;
  }
}