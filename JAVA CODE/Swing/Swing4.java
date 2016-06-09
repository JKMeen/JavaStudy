import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing4 extends JFrame{ //JFrame�� ���
	Swing4(){ //�����ڸ� ����
		setTitle("window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����â�� X��ư ������ �ڹٵ� ���� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new BorderLayout()); //BorderLayout ���
		contentPane.add(new JButton("East"), BorderLayout.EAST);
		contentPane.add(new JButton("West"), BorderLayout.WEST);
		contentPane.add(new JButton("North"), BorderLayout.NORTH);
		contentPane.add(new JButton("South"), BorderLayout.SOUTH);
		contentPane.add(new JButton("Center"), BorderLayout.CENTER);
		
		setSize(1024,768);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Swing4();
	}
}
