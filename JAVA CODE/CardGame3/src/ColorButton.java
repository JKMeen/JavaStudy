import java.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class ColorButton extends JFrame {
	int save = 0, sv = 11, top = 0;

	JButton[] btn = new JButton[100];

	ColorButton() {
		setTitle("ColorButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		for (int i = 0; i < 100; i++)
			btn[i] = new JButton();

		for (int i = 0; i < 100; i++) {
			int rand = (int) (Math.random() * 3);
			if (rand == 0)
				btn[i].setBackground(Color.RED);
			if (rand == 1)
				btn[i].setBackground(Color.BLUE);
			if (rand == 2)
				btn[i].setBackground(Color.YELLOW);
			btn[i].addActionListener(new MyActionListener());
			contentPane.add(btn[i]);
		}
		setSize(250, 400);
		setVisible(true);
	}

	public static void main(String[] arg) {
		new ColorButton();
	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b != btn[sv]) {
				save++;

				for (int i = 0; i < 100; i++) {
					if (b == btn[i]) {
						if (save == 2) {
							if (b.getBackground().equals(btn[sv].getBackground())) {
								b.setBackground(Color.BLACK);
								btn[sv].setBackground(Color.BLACK);
								top++;
								if (top == 50) { // 몇개 맞췄는지
									JOptionPane.showMessageDialog(null, "축하합니다. 클리어!", "Massage",
											JOptionPane.INFORMATION_MESSAGE);
								}
							}
							save = 0;
						}
						sv = i;
					}
				}
			}
		}
	}
}