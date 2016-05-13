package com.j2.w11.adapter;
import java.util.*;

public class EnumerationIteratorTestDrive {
  public static void main (String args[]) {
    Vector vec = new Vector(Arrays.asList(args));
    Iterator ite = new EnumerationIterator(vec.elements());
    while (ite.hasNext()) {
      System.out.println(ite.next());
    }
  }
}