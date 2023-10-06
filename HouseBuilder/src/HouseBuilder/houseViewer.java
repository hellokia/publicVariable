package HouseBuilder;
import javax.swing.*;
public class houseViewer {
		public static void main(String[] args) {
			JFrame frame = new JFrame();
			frame.setSize(600,600);
			frame.setTitle("Lab05");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new house());
			frame.setVisible(true);
				}
	}

