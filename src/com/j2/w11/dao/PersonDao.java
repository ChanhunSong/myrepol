package com.j2.w11.dao;
import java.util.List;

public interface PersonDao {
   public List<Person> getAllPerson();
   public void modifyPerson(Person person1, Person person2);
   public void updatePerson(Person person);
   public void deletePerson(Person person);
}