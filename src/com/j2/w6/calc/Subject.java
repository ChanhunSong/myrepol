package com.j2.w6.calc;

public interface Subject {
 public void registerObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObservers();
}