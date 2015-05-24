import java.awt.EventQueue;

import javax.swing.JFrame;


public class RysujKwadraty {
	public static void main(String[] args)
	{
	   EventQueue.invokeLater(new Runnable()
	      {
	         public void run()
	         {
	            JFrame frame =new JFrame();
	          
	         
	            RekurencyjneKwadraty kwadrat = new RekurencyjneKwadraty();
	            frame.add(kwadrat);
	            kwadrat.rysujKwadraty(10, 300 , 10 ,10);
	        
	            frame.setSize(400,400);
	            frame.setTitle("DrawTest");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setVisible(true);
	            
	         } 
	      });
	}


}
