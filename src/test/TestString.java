import java.io.*;

public class TestString{
  public static void main(String[] args){
        FileReader frd = new FileReader("data.txt");  // �����Է¹��ڽ�Ʈ�� ����
        int ch;
        String flag= "";
        String memo= "";
        while((ch = frd.read()) != -1)  // ������ ���� ������ ������ �� ���ھ� �б�
            System.out.println(ch);  //  ����ȭ�����
        System.out.println("");  // �� �ٲٱ�
     
        frd.close();  // ��Ʈ�� �ݱ�
     
        frd = new FileReader("data.txt");  // �����Է¹��ڽ�Ʈ�� ����
        FileWriter fwt = new FileWriter("out.txt");  // ������¹��ڽ�Ʈ�� ����
     
        while((ch = frd.read()) != -1)  // ������ ���� ������ ������ �� ���ھ� �б�
            fwt.write(ch);  //  ������Ͽ� ��������
    
        frd.close(); fwt.close();  // ��Ʈ�� �ݱ�
    }
}