import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TranTest extends JFrame{
   
   private JButton jbTran;
   
   public static void main(String[] args){
   
      new TranTest();
   }
   
   public TranTest(){
   
      JPanel jpTest = new JPanel();
   
      jbTran = new JButton("test1");
      
      jpTest.add(jbTran);
      
      add(jpTest);
      
      setTitle("TEST");
      
      pack();
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
   
   
   }

}