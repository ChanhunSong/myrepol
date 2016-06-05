package com.j2.w11.dao;
public class Person {
   private String name;
   private String phoneNum;
   private String address;
   Person(String name, String phoneNum, String address){
      this.name = name;
      this.phoneNum = phoneNum;
      this.address = address;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhoneNum() {
      return phoneNum;
   }

   public void setPhoneNum(String phoneNum) {
      this.phoneNum = phoneNum;
   }
   
   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}