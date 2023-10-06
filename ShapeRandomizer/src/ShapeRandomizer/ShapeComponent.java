
package ShapeRandomizer;
import java.awt.Color;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.*;
import javax.swing.JComponent;
public class ShapeComponent extends JComponent {
	//random position, coordinates using x and y
	private int xq1=randoQ1();
	private int yq1= randoQ1();
	private int xq2=randoQ2();
	private int yq2=randoQ2();
	//variables that hold a different randomized number
	private int n=randomInt1();
	private int m=randomInt2();
	private int l=randomInt3();
	private int w=randomInt4();
	public int randoQ1() {
		Random random= new Random();
		int randoQone=random.nextInt(25, 100);
		return (randoQone);
	}
	public int randoQ2() {
		Random random= new Random();
		int randoQtwo=random.nextInt(325, 375);
		return (randoQtwo);
	}
	public int randomInt1() {
		Random random= new Random();
		int randoSize=random.nextInt(26, 100);
		return (randoSize);
		}
	public int randomInt2() {
		Random random= new Random();
		int randoSize2=random.nextInt(26, 100);
		return (randoSize2);
		}
	public int randomInt3() {
		Random random= new Random();
		int randoSize3=random.nextInt(26, 100);
		return (randoSize3);
		}
	public int randomInt4() {
		Random random= new Random();
		int randoSize4=random.nextInt(26, 100);
		return (randoSize4);
		}
//	random color
	public int randomIntC() {
	Random random2= new Random();
	int randoC=random2.nextInt(0, 256);
	return (randoC);
	}
	
//	4 circle for each quad
	public Shape circle(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Ellipse2D.Double circle=new Ellipse2D.Double(xq1,yq1,n,n);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(circle);
		g2.draw(circle);
		return circle;
	}
	public Shape circleq2(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Ellipse2D.Double circle=new Ellipse2D.Double(xq1,yq2,m,m);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(circle);
		g2.draw(circle);
		return circle;
	}
	public Shape circleq3(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Ellipse2D.Double circle=new Ellipse2D.Double(xq2,yq1,l, l);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(circle);
		g2.draw(circle);
		return circle;
	}
	public Shape circleq4(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Ellipse2D.Double circle=new Ellipse2D.Double(xq2,yq2,w, w);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(circle);
		g2.draw(circle);
		return circle;
	}

//	4 rectangles for each quad
	public Shape rect (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double rec=new Rectangle2D.Double (xq1,yq1,n,((n)*2));
		g2.setColor (new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(rec);
		g2.draw(rec);
		return rec;
	}
	public Shape rectq2 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double rec=new Rectangle2D.Double (xq1,yq2,m,((m)*2));
		g2.setColor (new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(rec);
		g2.draw(rec);
		return rec;
	}
	public Shape rectq3 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double rec=new Rectangle2D.Double (xq2,yq1,l,((l)*2));
		g2.setColor (new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(rec);
		g2.draw(rec);
		return rec;
	}
	public Shape rectq4 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double rec=new Rectangle2D.Double (xq2,yq2,w,((w)*2));
		g2.setColor (new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(rec);
		g2.draw(rec);
		return rec;
	}
	
//	4 squares for each quad
	public Shape square (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double square= new Rectangle2D.Double(xq1,yq1,n, n);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(square);
		g2.draw(square);
		return square;
	}
	public Shape squareq2 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double square= new Rectangle2D.Double(xq1,yq2,m, m);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(square);
		g2.draw(square);
		return square;
	}
	public Shape squareq3 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double square= new Rectangle2D.Double(xq2,yq1,l, l);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(square);
		g2.draw(square);
		return square;
	}
	public Shape squareq4 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double square= new Rectangle2D.Double(xq2,yq2,w, w);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fill(square);
		g2.draw(square);
		return square;
	}
	
//	4 triangles for each quad
	public Shape trian (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int y=(int)(yq1+(n/2)*Math.sqrt(3));
		int [] x2= {xq1,xq1+((n/2)),(xq1+n)};
		int [] y2= {y,yq1,y};
		Polygon tri1= new Polygon(x2,y2,3);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fillPolygon(tri1);
		g2.drawPolygon(tri1);
		return (tri1);
	}
	public Shape trianq2 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int y=(int)(yq2+(m/2)*Math.sqrt(3));
		int [] x2= {xq1,xq1+((m/2)),(xq1+m)};
		int [] y2= {y,yq2,y};
		Polygon tri1= new Polygon(x2,y2,3);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fillPolygon(tri1);
		g2.drawPolygon(tri1);
		return (tri1);
	}
	public Shape trianq3 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int y=(int)(yq1+(l/2)*Math.sqrt(3));
		int [] x2= {xq2,xq2+((l/2)),(xq2+l)};
		int [] y2= {y,yq1,y};
		Polygon tri1= new Polygon(x2,y2,3);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fillPolygon(tri1);
		g2.drawPolygon(tri1);
		return (tri1);
	}
	public Shape trianq4 (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int y=(int)(yq2+(w/2)*Math.sqrt(3));
		int [] x2= {xq2,xq2+((w/2)),(xq2+w)};
		int [] y2= {y,yq2,y};
		Polygon tri1= new Polygon(x2,y2,3);
		g2.setColor(new Color (randomIntC(),randomIntC(),randomIntC()));
		g2.fillPolygon(tri1);
		g2.drawPolygon(tri1);
		return (tri1);
	}
	
//	4 shape pickers for each quad
	public int shapePInt () {
		Random random= new Random();
		int randoS=random.nextInt(1, 5);
		return (randoS);
	}
	public Shape shapePickerQ1(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int SInt= shapePInt ();
		if (SInt==1) {
			return (circle(g2));
		}else if (SInt==2){
			return (rect(g2));
		}else if (SInt==3) {
			return (square(g2));
		}else {
			return (trian(g2));
		}
	}
	public Shape shapePickerQ2(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int SInt= shapePInt ();
		if (SInt==1) {
			return (circleq2(g2));
		}else if (SInt==2){
			return (rectq2(g2));
		}else if (SInt==3) {
			return (squareq2(g2));
		}else {
			return (trianq2(g2));
		}
	}
	public Shape shapePickerQ3(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int SInt= shapePInt ();
		if (SInt==1) {
			return (circleq3(g2));
		}else if (SInt==2){
			return (rectq3(g2));
		}else if (SInt==3) {
			return (squareq3(g2));
		}else {
			return (trianq3(g2));
		}
	}
	public Shape shapePickerQ4(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		int SInt= shapePInt ();
		if (SInt==1) {
			return (circleq4(g2));
		}else if (SInt==2){
			return (rectq4(g2));
		}else if (SInt==3) {
			return (squareq4(g2));
		}else {
			return (trianq4(g2));
		}
	}	
	
	public void paintComponent (Graphics g) {
		Graphics2D g2= (Graphics2D) g;
//		dividing the quads
		g2.drawLine( 300, 0, 300,600);
		g2.drawLine(0, 300, 600, 300);
//		in quad one
		g2.draw(shapePickerQ1(g));
//		in quad two
		g2.draw(shapePickerQ2(g));
//		in quad three
		g2.draw(shapePickerQ3(g));
//		in quad four
		g2.draw(shapePickerQ4(g));

	}
}
