package com.j2.w11.adapter;
import java.util.*;

public class EnumerationIterator implements Iterator {
  Enumeration enu;
  
  public EnumerationIterator(Enumeration enu) {
    this.enu = enu;
  }
  public boolean hasNext() {
    return enu.hasMoreElements();
  }
  public Object next() {
    return enu.nextElement();
  }
  public void remove() {
    throw new UnsupportedOperationException();
  }
}