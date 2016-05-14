package com.j2.w11.dao;
import java.util.ArrayList;
import java.util.List;

public class PersonData implements PersonDao {

   List<Person> Person;

   public PersonData(){
      people = new ArrayList<Person>();
      Student person1 = new Person("song chan hun",950829, "seoul");
      Student person2 = new Person("song chan bin",900302,"seoul");
      people.add(student1);
      people.add(student2);  
   }
   
   public void deletePerson(Person person) {
      people.remove(person.getBirthDate());
      System.out.println("deleted from database");
   }

   public List<Student> getAllStudents() {
      return people;
   }

   public Student getPerson(int rollNo) {
      return people.get(rollNo);
   }
   
   public void updatePerson(Person person) {
      people.get(person.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}