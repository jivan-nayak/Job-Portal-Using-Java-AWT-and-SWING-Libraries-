package Sample;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Sample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("The title goes here");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		ImageIcon image = new ImageIcon("F:\\Study\\Web development\\CSS");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(250,125,30));
		
	}

}
