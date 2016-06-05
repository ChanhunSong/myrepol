package test;

import java.io.*;  // FileReader, FileWriter 클래스를 제공하는 패키지

public class FileIO2 {
  public static void main(String[] args) throws Exception { // 파일 예외처리 미루기
    FileReader frd = new FileReader("data.txt");  // 파일입력문자스트림 열기
    Reader channelReader = new Reader(frd);
    BufferedReader reader = new BufferedReader(channelReader);
    String ch;
    
    ch = reader.readLine(); // 파일의 끝에 도달할 때까지 한 문자씩 읽기
    System.out.print(ch);  //  문자화면출력
    System.out.println("");  // 줄 바꾸기
    
    frd.close();  // 스트림 닫기
    
    frd = new FileReader("data.txt");  // 파일입력문자스트림 열기
    FileWriter fwt = new FileWriter("out.txt");  // 파일출력문자스트림 열기
    
    
    frd.close(); fwt.close();  // 스트림 닫기
  }
}