package com.j2.w11.smartHome;

public class SmartHomeDrive{
  public static void main(String[] args) {
    Monitor monitor = new Monitor();
    Git git = new Git();
    Drjava drjava = new Drjava();
    Desktop desktop = new Desktop(git,drjava);
    SmartHome smartHome  = new SmartHome(monitor, desktop, git, drjava);
    smartHome.beginStudy();
    smartHome.endStudy();
  }
}