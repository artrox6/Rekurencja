import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;

class RysujLinie extends JComponent
{

private	Line2D current;
private ArrayList<Line2D> lines = new ArrayList();
	
	public void  rysowanieRekurencyjne(int x,int y, int dlugosc, int promien)
	{
		if (dlugosc >0)	{
			
		current = new Line2D.Double(x, y, x + dlugosc, y);
		lines.add(current);
		
		current = new Line2D.Double(x + dlugosc, y, x+ dlugosc , y + dlugosc);
		lines.add(current);
		
		current = new Line2D.Double(x+ dlugosc,y+ dlugosc,x +promien, y  + dlugosc);
		lines.add(current);
		
		current = new Line2D.Double(x +promien  ,y + dlugosc , x + promien ,  y + promien);
		lines.add(current);
		
		rysowanieRekurencyjne(x+promien ,y+promien,dlugosc-2*promien,promien);}
	}
	
	
	public void paintComponent(Graphics g)
	{
	
		Graphics2D g2 = (Graphics2D)g;
		 for (Line2D r : lines)
	         g2.draw(r);
	}
}