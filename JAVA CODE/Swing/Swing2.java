import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing2 extends JFrame{ //JFrame�� ���
	Swing2(){ //�����ڸ� ����
		setTitle("My first window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����â�� X��ư ������ �ڹٵ� ���� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); //FlowLayout���
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Swing2();
	}
}
