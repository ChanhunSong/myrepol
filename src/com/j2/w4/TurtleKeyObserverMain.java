package com.j2.w4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import ch.aplu.turtle.*;


  

class TurtleKeyListener extends Turtle {
  public TurtleKeyListener() {
    addKeyListener(new KeyAdapter(){
    public void keyPressed(KeyEvent e){
     
      int KeyCode = e.getKeyCode();
      switch(KeyCode) {
      case KeyEvent.VK_UP:
        setStatusText("for20");
        forward(20);
        break;
        
      case KeyEvent.VK_DOWN:
        setStatusText("back20");
        back(20);
        break;  
       case KeyEvent.VK_RIGHT:
        setStatusText("right20");
        right(90);
        forward(20);
        break;
        
       case KeyEvent.VK_LEFT:
        setStatusText("left20");
        left(90);
        forward(20);
        break;
        
      case KeyEvent.VK_W:
        setStatusText("for20");
        forward(20);
        break;
        
      case KeyEvent.VK_S:
        setStatusText("back20");
        back(20);
        break;  
       case KeyEvent.VK_D:
        setStatusText("right20");
        right(90);
        forward(20);
        break;
        
       case KeyEvent.VK_A:
        setStatusText("left20");
        left(90);
        forward(20);
        break;
      case KeyEvent.VK_Q:
        setStatusText("Q");
        break;  
      }
    }
    }
    );
  }
}


public class TurtleKeyObserverMain {
  public static void main(String[] args) {
    TurtleKeyListener t =new TurtleKeyListener();
    t.addStatusBar(20);
      t.setStatusText("press any key");
  }
}
