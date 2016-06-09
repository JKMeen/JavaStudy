import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing4 extends JFrame{ //JFrame을 상속
	Swing4(){ //생성자를 만듬
		setTitle("window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//메인창의 X버튼 누르면 자바도 같이 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new BorderLayout()); //BorderLayout 사용
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
