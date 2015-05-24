import java.awt.EventQueue;

import javax.swing.JFrame;


public class RysujTrojkaty {
	public static void main(String[] args)
	{
	   EventQueue.invokeLater(new Runnable()
	      {
	         public void run()
	         {
	            JFrame frame =new JFrame();        
	            RysowanieTrojkat trojkat = new RysowanieTrojkat();
	            frame.add(trojkat);
	            trojkat.RysujTrojkat(500,500,10);
	            frame.setSize(1000,700);
	            frame.setTitle("DrawTest");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setVisible(true);
	            
	         } 
	      });
	}
}
