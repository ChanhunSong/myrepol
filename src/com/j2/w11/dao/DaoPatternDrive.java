package com.j2.w11.dao;
public class DaoPatternDrive {
  public static void main(String[] args) {
      PersonDao personDao = new PersonData();

      for (Person person : personDao.getAllPerson()) {
         System.out.println("Person: name : " + person.getName()+  ", Phone Number : " + person.getPhoneNum() + " , adress:" + person.getAddress() );
      }

      Person person =personDao.getAllPerson().get(0);
      person.setName("haha");
      person.setAddress("Busan");
      personDao.updatePerson(person);
      
      Person person1 =personDao.getAllPerson().get(0);
      personDao.modifyPerson(person1, person);
      
      System.out.println("Person: name : " + person.getName()+   ", Phone Number : " + person.getPhoneNum() + " , adress:" + person.getAddress() );
      personDao.deletePerson(person);
      for (Person person3 : personDao.getAllPerson()) {
         System.out.println("Person: name : " + person3.getName()+  ", Phone Number : " + person3.getPhoneNum() + " , adress:" + person3.getAddress() );
      }
   }
}
