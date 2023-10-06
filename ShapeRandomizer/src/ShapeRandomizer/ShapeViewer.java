package ShapeRandomizer;

import javax.swing.*;
public class ShapeViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setTitle("HW02");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ShapeComponent());
		frame.setVisible(true);
			}
}