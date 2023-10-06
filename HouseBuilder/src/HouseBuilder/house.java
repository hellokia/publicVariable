package HouseBuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.*;
import javax.swing.JComponent;

public class house extends JComponent{
	public void paintComponent (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double bckgrnd= new Rectangle2D.Double(0,0,600,600);
		g2.setColor(new Color (80,50,124));
		g2.fill(bckgrnd);
		g2.draw(bckgrnd);
		
		Rectangle2D.Double grass= new Rectangle2D.Double(0,400,600,300);
		g2.setColor(new Color (34,139,34));
		g2.fill(grass);
		g2.draw(grass);
		
		Rectangle2D.Double tree= new Rectangle2D.Double(450,250,50,150);
		g2.setColor(new Color (139,69,19));
		g2.fill(tree);
		g2.draw(tree);
		
		Ellipse2D.Double treeg=new Ellipse2D.Double(425,200,100,100);
		g2.setColor(new Color (154,205,50));
		g2.fill(treeg);
		g2.draw(treeg);
		
		Ellipse2D.Double treeg2=new Ellipse2D.Double(490,315,35,35);
		g2.setColor(new Color (154,205,50));
		g2.fill(treeg2);
		g2.draw(treeg2);
		
		Ellipse2D.Double f1=new Ellipse2D.Double(475,245,10, 10);
		g2.setColor(new Color (255,165,0));
		g2.fill(f1);
		g2.draw(f1);
		
		Ellipse2D.Double f2=new Ellipse2D.Double(450,230,10, 10);
		g2.setColor(new Color (255,165,0));
		g2.fill(f2);
		g2.draw(f2);
		
		Ellipse2D.Double f3=new Ellipse2D.Double(495,255,10, 10);
		g2.setColor(new Color (255,165,0));
		g2.fill(f3);
		g2.draw(f3);
		
		Ellipse2D.Double f4=new Ellipse2D.Double(500,325,10, 10);
		g2.setColor(new Color (255,165,0));
		g2.fill(f4);
		g2.draw(f4);
		
		Ellipse2D.Double f5=new Ellipse2D.Double(450,275,10, 10);
		g2.setColor(new Color (255,165,0));
		g2.fill(f5);
		g2.draw(f5);
		
		Rectangle2D.Double house= new Rectangle2D.Double(200,250,200,150);
		g2.setColor(new Color (250,240,230));
		g2.fill(house);
		g2.draw(house);
		
		Rectangle2D.Double door= new Rectangle2D.Double(275,325,50,75);
		g2.setColor(new Color (255,192,203));
		g2.fill(door);
		g2.draw(door);
		
		Ellipse2D.Double drknob=new Ellipse2D.Double(280,360,10, 10);
		g2.setColor(new Color (255,255,51));
		g2.fill(drknob);
		g2.draw(drknob);
		
		Ellipse2D.Double window=new Ellipse2D.Double(285,275,35, 35);
		g2.setColor(new Color (135,206,250));
		g2.fill(window);
		g2.draw(window);
		
		Ellipse2D.Double window2=new Ellipse2D.Double(345,320,35,35);
		g2.setColor(new Color (135,206,250));
		g2.fill(window2);
		g2.draw(window2);
		
		g2.setColor(new Color (30,144,25));
		g2.drawLine( 285, 292, 320,292);
		g2.drawLine(302, 310, 302,275 );
		
		g2.setColor(new Color (30,144,25));
		g2.drawLine(345, 338, 380,338);
		g2.drawLine(363, 353, 363,319 );
		
		int [] x= {200,303,400};
		int [] y= {250,190,250};
		Polygon roof= new Polygon(x,y,3);
		g2.setColor(new Color (205,133,63));
		g2.fillPolygon(roof);
		g2.drawPolygon(roof);	
		
		Font name=(new Font("Serif", Font.PLAIN, 20));
		g2.setFont(name);
		g2.drawString("Zakiyyah", 500, 550);
		
	
		
	}
}
