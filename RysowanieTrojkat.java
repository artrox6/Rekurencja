import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JComponent;


public class RysowanieTrojkat extends JComponent {
	private Line2D current;
	private ArrayList<Line2D> lines = new ArrayList();
	
	public void RysujTrojkat(int startX,int startY , int count)
		{
			if(count>0)
				{
				current = new Line2D.Double(startX, startY, startX-50, startY-100);
				lines.add(current);
				current = new Line2D.Double(startX, startY, startX+50, startY-100);
				lines.add(current);
				current = new Line2D.Double(startX-50, startY-100, startX+50, startY-100);
				lines.add(current);
				RysujTrojkat(startX-50, startY-100,count-1);
				RysujTrojkat(startX+50, startY-100,count-1);
				}
		}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		for(Line2D r: lines)
			g2.draw(r);

	}


}
