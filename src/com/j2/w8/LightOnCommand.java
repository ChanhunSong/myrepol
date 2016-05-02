package com.j2.w8;


class LightOnCommand implements Command{
  Light light;
  LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
   light.on();
 };
}