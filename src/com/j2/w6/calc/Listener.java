package com.j2.w6.calc;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Listener implements MouseListener{
 CalcData data = new CalcData();
 CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
 @Override
 public void mouseClicked(MouseEvent e) {
  // TODO Auto-generated method stub
  JButton button = (JButton)e.getSource();
  String res = CalculatorMain.result.getText();
  String division = button.getText();
  Double reres=0d;
  switch(division){
  case "=":
   CalculatorMain.result.setText(data.getString());
   
   break;
  case "C":
   CalculatorMain.result.setText("0");
   data.setMeasurements("0");
   break;
  case "<<":
    CalculatorMain.result.setText(res.substring(0, res.length()-1));

    break;
  case "+":
   System.out.println(Double.parseDouble(res));

   reres =Double.parseDouble(res)+Double.parseDouble(data.getString());
   data.setMeasurements(reres.toString());
   CalculatorMain.result.setText("");
   
    break;
  case "-":
   reres =Double.parseDouble(res)-Double.parseDouble(data.getString());
   data.setMeasurements(reres.toString());
   reres =reres-Float.parseFloat(res);
   CalculatorMain.result.setText("");
   break;
  case "*":
   reres =Double.parseDouble(res)*Double.parseDouble(data.getString());
   data.setMeasurements(reres.toString());
   reres =reres*Float.parseFloat(res);
   CalculatorMain.result.setText("");
   break;
  case "/":
   reres =Double.parseDouble(res)/Double.parseDouble(data.getString());
   data.setMeasurements(reres.toString());
   reres =reres/Float.parseFloat(res);
   CalculatorMain.result.setText("");
   break;
  case "p":
   
   CalculatorMain.result.setText("");
   break;
  case "c":
   CalculatorMain.result.setText("");
   break;
  default:
   CalculatorMain.result.setText(res + division);
   break;
  }
  
  
 }

 @Override
 public void mouseEntered(MouseEvent e) {
  // TODO Auto-generated method stub
  
 }

 @Override
 public void mouseExited(MouseEvent e) {
  // TODO Auto-generated method stub
  
 }

 @Override
 public void mousePressed(MouseEvent e) {
  // TODO Auto-generated method stub
  
 }

 @Override
 public void mouseReleased(MouseEvent e) {
  // TODO Auto-generated method stub
  
 }
} 