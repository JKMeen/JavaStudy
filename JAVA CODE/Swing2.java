import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing2 extends JFrame{ //JFrame을 상속
	Swing2(){ //생성자를 만듬
		setTitle("My first window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//메인창의 X버튼 누르면 자바도 같이 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); //FlowLayout사용
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
