package com.j2.w6.calc;
import java.util.*;

public class CalcData implements Subject  {


 private ArrayList observers;
 private String str="0";
 
 public CalcData() {
  observers = new ArrayList();
 }
 
 public void registerObserver(Observer o) {
  observers.add(o);
 }
 
 public void removeObserver(Observer o) {
  int i = observers.indexOf(o);
  if (i >= 0) {
   observers.remove(i);
  }
 }
 
 public void notifyObservers() {
  for (int i = 0; i < observers.size(); i++) {
   Observer observer = (Observer)observers.get(i);
   observer.update(str);
  }
 }
 
 public void measurementsChanged() {
  notifyObservers();
 }
 
 public void setMeasurements(String str) {
  this.str = str;
  measurementsChanged();
 }
 
 public String getString() {
  return str;
 } 
}