package basicjava;

import java.awt.*;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f1 = new JFrame("Calculator");
		f1.setSize(600, 800);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		NumberPanel n1 = new NumberPanel();
		n1.setBackground(Color.CYAN);

		f1.add(n1);
		f1.setVisible(true);

	}

}