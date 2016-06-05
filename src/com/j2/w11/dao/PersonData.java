package com.j2.w11.dao;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class PersonData implements PersonDao {
  
  List<Person> people;
  
  public PersonData(){
    people = new ArrayList<Person>();
      Person person1 = new Person("song chan hun", "01041851895", "seoul");
      Person person2 = new Person("song chan bin", "01041851896", "seoul");
      people.add(person1);
      people.add(person2); 
  }
  
  public void deletePerson(Person person) {
    int flag = personSearch(person);
    if(flag < people.size()){
      people.remove(flag);
      dataUpload(people);
      System.out.println("deleted from database");
    }
    else{
      System.out.println("person is nonexistent in database");
    }
  }
  
  public List<Person> getAllPerson() {
    return people;
  }
  
  public void updatePerson(Person person) {
    people.add(person);
    dataUpload(people);
    System.out.println("updated in the database");
  }
  
  public void modifyPerson(Person person1, Person person2) {
    int flag = personSearch(person1);
    if(flag < people.size()){
      people.remove(flag);
      people.add(flag, person2);
      System.out.println("modify");
    }
     else{
      System.out.println("input is nonexistent in database");
    }
  }
  
  public int personSearch(Person person){
    int flag = people.size() +1;
    for(int i =0 ; i < people.size(); i++) {
      if(people.get(i).getPhoneNum() == person.getPhoneNum()){
        flag = i;
      }
    }
    return flag; 
  }
  
  public void dataUpload(List<Person> people){
        // 파일입력문자스트림 열기
        //FileWriter fwt = new FileWriter("data.txt");  // 파일출력문자스트림 열기
     
       // while((ch = frd.read()) != -1)  // 파일의 끝에 도달할 때까지 한 문자씩 읽기
        //    fwt.write(ch);  //  출력파일에 문자저장
    
        //frd.close(); fwt.close();  // 스트림 닫기
  }
  //public List<Person> dataDownload(){
    
        //FileReader frd = new FileReader("data.txt");  // 파일입력문자스트림 열기
        //int ch;
        //String flag= "";
        //String memo= "";
        //while((ch = frd.read()) != -1)  // 파일의 끝에 도달할 때까지 한 문자씩 읽기
        //    string  //  문자화면출력
        //System.out.println("");  // 줄 바꾸기
     
        //frd.close();  // 스트림 닫기
     
        //frd = new FileReader("data.txt");  // 파일입력문자스트림 열기
        //FileWriter fwt = new FileWriter("out.txt");  // 파일출력문자스트림 열기
     
        //while((ch = frd.read()) != -1)  // 파일의 끝에 도달할 때까지 한 문자씩 읽기
          //  fwt.write(ch);  //  출력파일에 문자저장
    
        //frd.close(); fwt.close();  // 스트림 닫기
    //}

  
}
