package com.j2.w11.dao;
import java.util.ArrayList;
import java.util.List;

public class PersonData implements PersonDao {

   List<Person> people;

   public PersonData(){
      people = new ArrayList<Person>();
      Person person1 = new Person("song chan hun",950829, "seoul");
      Person person2 = new Person("song chan bin",900302,"seoul");
      people.add(person1);
      people.add(person2);  
   }
   
   public void deletePerson(Person person) {
      people.remove(person.getBirthDate());
      System.out.println("deleted from database");
   }

   public List<Person> getAllPerson() {
      return people;
   }

   public Person getPerson(int birthDate) {
      return people.get(birthDate);
   }
   
   public void updatePerson(Person person) {
      people.get(person.getBirthDate()).setName(person.getName());
      System.out.println("updated in the database");
   }
}