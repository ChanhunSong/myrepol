package com.j2.w6.calc;

public class CurrentConditionsDisplay implements Observer {
 private String str;
 private Subject CalcData;
 
 public CurrentConditionsDisplay(Subject CalcData) {
  this.CalcData = CalcData;
  CalcData.registerObserver(this);
 }
 
 public void update(String str) {
  this.str = this.str;
 }
}