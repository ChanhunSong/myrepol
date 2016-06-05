import java.io.*;

public class TestString{
  public static void main(String[] args){
        FileReader frd = new FileReader("data.txt");  // 파일입력문자스트림 열기
        int ch;
        String flag= "";
        String memo= "";
        while((ch = frd.read()) != -1)  // 파일의 끝에 도달할 때까지 한 문자씩 읽기
            System.out.println(ch);  //  문자화면출력
        System.out.println("");  // 줄 바꾸기
     
        frd.close();  // 스트림 닫기
     
        frd = new FileReader("data.txt");  // 파일입력문자스트림 열기
        FileWriter fwt = new FileWriter("out.txt");  // 파일출력문자스트림 열기
     
        while((ch = frd.read()) != -1)  // 파일의 끝에 도달할 때까지 한 문자씩 읽기
            fwt.write(ch);  //  출력파일에 문자저장
    
        frd.close(); fwt.close();  // 스트림 닫기
    }
}