package test;

import java.io.*;  // FileReader, FileWriter Ŭ������ �����ϴ� ��Ű��

public class FileIO2 {
  public static void main(String[] args) throws Exception { // ���� ����ó�� �̷��
    FileReader frd = new FileReader("data.txt");  // �����Է¹��ڽ�Ʈ�� ����
    Reader channelReader = new Reader(frd);
    BufferedReader reader = new BufferedReader(channelReader);
    String ch;
    
    ch = reader.readLine(); // ������ ���� ������ ������ �� ���ھ� �б�
    System.out.print(ch);  //  ����ȭ�����
    System.out.println("");  // �� �ٲٱ�
    
    frd.close();  // ��Ʈ�� �ݱ�
    
    frd = new FileReader("data.txt");  // �����Է¹��ڽ�Ʈ�� ����
    FileWriter fwt = new FileWriter("out.txt");  // ������¹��ڽ�Ʈ�� ����
    
    
    frd.close(); fwt.close();  // ��Ʈ�� �ݱ�
  }
}