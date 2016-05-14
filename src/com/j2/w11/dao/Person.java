package com.j2.w11.dao;
public class Person {
   private String name;
   private int  birthDate;
   private String address;
   Student(String name, int birthDate, String address){
      this.name = name;
      this.birthDate = birthDate;
      this.address = address;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(int birthDate) {
      this.birthDate = birthDate;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}