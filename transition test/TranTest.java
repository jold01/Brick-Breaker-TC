import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TranTest extends JFrame{
   
   private JButton jbTran;
	private JButton jbTran2;
	private JTextField jtf2;
   
   public static void main(String[] args){
   
      new TranTest();
   }
   
   public TranTest(){

		JFrame jfMain = new JFrame();
   
      JPanel jpTest = new JPanel();
   
      jbTran = new JButton("test1");
      
      jpTest.add(jbTran);
      
      jfMain.add(jpTest);
      
      jfMain.setTitle("TEST");
     
		jbTran.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent ae){
				
				jfMain.dispose();
				new Transition();
			}

		});

     	jfMain.pack();
      jfMain.setLocationRelativeTo(null);
      jfMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jfMain.setVisible(true);
      
   
   
   }

	class Transition{
		
		public Transition(){
			JFrame newFrame = new JFrame();

			JPanel jpMain = new JPanel(new GridLayout(0,1));

			jbTran2 = new JButton("Test2");

			jtf2 = new JTextField(10);

			jpMain.add(jbTran2);
			jpMain.add(jtf2);

			newFrame.add(jpMain);

			jbTran2.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent ae){
					
					newFrame.dispose();
					new TranTest();
				}

			});
			
			newFrame.pack();
			newFrame.setLocationRelativeTo(null);
			newFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			newFrame.setVisible(true);

		}
	}

}
