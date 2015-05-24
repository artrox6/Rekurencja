import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JComponent;


public class RekurencyjneKwadraty extends JComponent
{
	private Line2D current;
	private ArrayList<Line2D> lines=new ArrayList() ;
	public void rysujKwadraty(int n, int dlugosc , int x ,int y)
	{
		if (n>0)
			{
			current = new Line2D.Double(x,y, x+dlugosc,y);
			lines.add(current);
			current = new Line2D.Double(x+dlugosc,y, x+dlugosc,y+dlugosc);
			lines.add(current);
			current = new Line2D.Double(x+dlugosc,y+dlugosc,x,y+dlugosc);
			lines.add(current);
			current = new Line2D.Double(x,y+dlugosc,x,y);
			lines.add(current);
			
			current = new Line2D.Double(x,y+dlugosc/2, x+dlugosc/2,y);
			lines.add(current);
			current = new Line2D.Double(x+dlugosc/2,y, x+dlugosc,y+dlugosc/2);
			lines.add(current);
			current = new Line2D.Double(x+dlugosc,y+dlugosc/2,x+dlugosc/2,y+dlugosc);
			lines.add(current);
			current = new Line2D.Double(x+dlugosc/2,y+dlugosc,x,y+dlugosc/2);
			lines.add(current);
			rysujKwadraty(n-2, dlugosc/2 , x+dlugosc/4  ,y+dlugosc/4);
			}

	}
	public void paintComponent(Graphics g)
	{
	
		Graphics2D g2 = (Graphics2D)g;
		 for (Line2D r : lines)
	         g2.draw(r);
	}
}