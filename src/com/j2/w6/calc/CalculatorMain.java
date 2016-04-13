package com.j2.w6.calc;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorMain extends JFrame{
  static JTextField result = new JTextField("");
  Listener lis = new Listener();
  CalcData data = new CalcData();
  CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);

  Container c ; 

  JPanel p = new JPanel();
  JButton b[] = new JButton[20];
  String s[] = {"C","/","*","<<","7","8","9","-","4","5","6","+","1","2","3",".","0","pi","e","="};


  public CalculatorMain(){
   
   c=getContentPane();
   result.setEditable(false);
   result.setBackground(Color.WHITE);
   result.setPreferredSize(new Dimension(280, 40)); 
    p.setLayout(new GridLayout(5,4));
    for (int i=0;i<20;i++)
    {
     b[i] = new JButton(s[i]);
     b[i].addMouseListener(lis);
     p.add(b[i]);
    }
    c.add(result,BorderLayout.NORTH);
    c.add(p);
    
    setSize(300,300);
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    
    } 
   //main
   public static void main (String[] args) {
    CalculatorMain calc=  new CalculatorMain();
      }

   

}