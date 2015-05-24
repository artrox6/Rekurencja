import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;



public class RekurencjaRysowanie {


public static void main(String[] args)
{
   EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            JFrame frame =new JFrame();
            RysujLinie linia= new RysujLinie();
            frame.add(linia);
            
            linia.rysowanieRekurencyjne(10, 10, 100, 10);
        
            frame.setSize(400,400);
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
         } 
      });
}



}