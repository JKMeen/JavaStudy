import java.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class ColorButton2 extends JFrame {
	int save = 0, top = 0;
	int btnnum = 0;
	int gamecount=0;
	
	JButton resetbtn = new JButton("리셋");
	
	JButton[] btn = new JButton[100];

	ImageIcon zoo[] ={
			new ImageIcon("./images/펭귄.jpg"),
			new ImageIcon("./images/북극곰.jpg"),
			new ImageIcon("./images/곰.jpg"),
			new ImageIcon("./images/클리어.jpg")
	};
	
	ColorButton2() {
		setTitle("ColorButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(resetbtn);
		resetbtn.setPreferredSize(new Dimension(570,30));
		resetbtn.addActionListener(new ResetActionListener());
		
		for (int i = 0; i < 100; i++) {
			btn[i] = new JButton();
			btn[i].setPreferredSize(new Dimension(50,50));
			rand(i);
			btn[i].addActionListener(new MyActionListener());
			contentPane.add(btn[i]);
		}
		
		for(int i=0; i<100; i++){
			if (btn[i].getIcon().equals(zoo[3]))
				top++;
			if (top > 1000) { // 몇개 맞췄는지
				JOptionPane.showMessageDialog(null, "축하합니다!"+gamecount+"회 만에 성공하셨습니다.", "게임 클리어!",JOptionPane.INFORMATION_MESSAGE);
			}
		}

		setSize(580, 640);
		setVisible(true);
	}

	public static void main(String[] arg) {
		new ColorButton2();
	}
	
	private class ResetActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			save = 0; top = 0; btnnum = 0; gamecount=0;

			for(int i=0; i<99; i++){
				rand(i);
			}
		}
	}
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			gamecount++;
			
			for (int i = 0; i < 100; i++) {
				
				if (b == btn[i]) {
					Search(i); // 상하좌우 같은색 검색

					if (save > 0) { // 바꿀 색이 있는 버튼의 경우
						b.setIcon(zoo[3]);
						
						save = 0;
					}

					else { // 바꿀 색깔이 없을 경우
						if (i > 10) { // 위로 버튼
							rand(i - 10);
						}
						if (i < 90) { // 아래로 버튼
							rand(i + 10);
						}
						if (i % 5 != 0) { // 왼쪽 버튼
							rand(i - 1);
						}
						if ((i - 4) % 5 != 0) { // 오른쪽 버튼
							rand(i + 1);
						}
						rand(i);
					}
				}
			}
		}
	}

	private void rand(int num) {

		int rand = (int) (Math.random() * 3);
		if (rand == 0)
			btn[num].setIcon(zoo[0]);
		if (rand == 1)
			btn[num].setIcon(zoo[1]);
		if (rand == 2)
			btn[num].setIcon(zoo[2]);
	}

	private void Search(int i) {
		if (i > 10)
			Upsearch(i, i);
		if (i < 90)
			Downsearch(i, i);
		if (i % 10 != 0 && i != 0)
			Leftsearch(i, i);
		if (i % 10 != 9 && i != 9)
			Rightsearch(i, i);
	}

	private void Upsearch(int n, int i) {
		int num = n;
		while (num > 10) {
			num -= 10;
			if (num < 0)
				break;

			if (btn[num].getIcon().equals(btn[i].getIcon())) {
				btn[num].setIcon(zoo[3]);
				Upsearch(num, i);
				Rightsearch(num, i);
				Leftsearch(num, i);
				save++;
			} else
				break;
		}
	}

	private void Downsearch(int n, int i) {
		int num = n;
		while (num < 90) {
			num += 10;
			if (num > 99)
				break;

			if (btn[num].getIcon().equals(btn[i].getIcon())) {
				btn[num].setIcon(zoo[3]);
				Downsearch(num, i);
				Leftsearch(num, i);
				Rightsearch(num, i);
				save++;
			} else
				break;
		}
	}

	private void Leftsearch(int n, int i) {
		int num = n;
		while (num > 0) {
			num -= 1;
			if (num % 10 == 9)
				break;

			if (btn[num].getIcon().equals(btn[i].getIcon())) {
				btn[num].setIcon(zoo[3]);
				Upsearch(num, i);
				Downsearch(num, i);
				Leftsearch(num, i);
				save++;
			} else
				break;
		}
	}

	private void Rightsearch(int n, int i) {
		int num = n;
		while (num < 99) {
			num += 1;
			if (num % 10 == 0)
				break;

			if (btn[num].getIcon().equals(btn[i].getIcon())) {
				btn[num].setIcon(zoo[3]);
				Upsearch(num, i);
				Downsearch(num, i);
				Rightsearch(num, i);
				save++;
			} else
				break;
		}
	}
}