package com.j2.w11.dao;
public class DaoPatternDrive {
  public static void main(String[] args) {
      PersonDao personDao = new PersonData();

      for (Person person : personDao.getAllPerson()) {
         System.out.println("Person: name : " + person.getName()+  ", birth date : " + person.getBirthDate() + " , adress:" + person.getAddress() );
      }

      Person person =personDao.getAllPerson().get(0);
      person.setName("haha");
      person.setAddress("Busan");
      personDao.updatePerson(person);

      personDao.getPerson(0);
      System.out.println("Person: name : " + person.getName()+  ", birth date : " + person.getBirthDate() + " , adress:" + person.getAddress() );
   }
}
