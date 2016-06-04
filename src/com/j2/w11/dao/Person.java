package com.j2.w11.dao;
public class Person {
   private String name;
   private String  birthDate;
   private String address;
   Person(String name, int birthDate, String address){
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

   public String getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(String birthDate) {
      this.birthDate = birthDate;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}