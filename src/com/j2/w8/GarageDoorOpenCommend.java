package com.j2.w8;


class GarageDoorOpenCommend implements Command{
  GarageDoor garageDoor;
  GarageDoorOpenCommend(GarageDoor garageDoor){
    this.garageDoor = garageDoor;
  }
  public void execute(){
   garageDoor.up();
 };
}