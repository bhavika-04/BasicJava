package basicjava;

import java.awt.*;
import javax.swing.*;

public class NumberPanel extends JPanel {

	NumberPanel() {
		setSize(600, 400);
		setBackground(Color.CYAN);
		GridLayout numberPanelLayout = new GridLayout(4,3);
		setLayout(numberPanelLayout);

		for (int x = 1; x <= 10; x = x + 1) {
			JButton b1 = new JButton(Integer.toString(x));
			b1.setSize(100, 100);
			b1.setBackground(Color.WHITE);
			Font font = new Font("Serif", Font.BOLD, 66);
			b1.setFont(font);
	
			add(b1);

		}
	}
}
