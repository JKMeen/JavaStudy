import java.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class CardGame2 extends JFrame {
	int save = 0, sv = 11, top = 0;
	ImageIcon cur = new ImageIcon("./images/abc.jpg");
	ImageIcon clear = new ImageIcon("./images/clear.jpg");
	ImageIcon card[] = new ImageIcon[12];

	ImageIcon[] ima = { new ImageIcon("./images/a.jpg"), new ImageIcon("./images/b.jpg"), new ImageIcon("./images/c.jpg"), 
			new ImageIcon("./images/d.jpg"), new ImageIcon("./images/e.jpg"),new ImageIcon("./images/f.jpg") };

	JButton[] btn = new JButton[12]; // 버튼 12개 생성

	CardGame2() {
		setTitle("CardGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		for (int i = 0; i < 12; i++)
			btn[i] = new JButton(cur); // 뒷면 카드 생성

		int randcount = 0;
		int[] rand = new int[12];

		for (int i = 0; i < 12; i++) {
			rand[i] = (int) (Math.random() * 6); rand[i] = (int) (Math.random() * 6);

			for (int j = 0; j < i; j++) {
				if (rand[i] == rand[j])
					randcount++;
				if (randcount == 2) {
					rand[i] = (int) (Math.random() * 6);
					i--;
				}
			}
			card[i] = ima[rand[i]];
			randcount = 0;
		}

		for (int i = 0; i < 12; i++) {// 카드 눌렀을 경우
			btn[i].addActionListener(new MyActionListener());
			contentPane.add(btn[i]);
		}
		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] arg) {
		new CardGame2();
	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b != btn[sv]) {
				save++;
				if (b.getIcon().equals(cur)) {
					for (int i = 0; i < 12; i++) {
						if (b == btn[i]) {
							b.setIcon(card[i]);
							if (save == 2) {
								if (b.getIcon().equals(btn[sv].getIcon())) {
									b.setIcon(clear);
									btn[sv].setIcon(clear);
									top++;
									if (top == 6) {
										JOptionPane.showMessageDialog(null, "축하합니다. 클리어!", "Massage",JOptionPane.INFORMATION_MESSAGE);
									}
								} else { // 두장이 같은 카드가 아닐 때
									b.setIcon(cur);
									btn[sv].setIcon(cur);
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
}