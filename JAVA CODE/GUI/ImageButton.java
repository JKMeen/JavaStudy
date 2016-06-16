import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ImageButton extends JFrame{
	ImageButton(){
		setTitle("ImageButton Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon Naver = new ImageIcon("./images/naver.jpg");
		ImageIcon Naver2 = new ImageIcon("./images/naver2.jpg");
		ImageIcon Naver3 = new ImageIcon("./images/naver3.jpg");
		
		JButton btn = new JButton(Naver);
		btn.setRolloverIcon(Naver2);
		btn.setPressedIcon(Naver3);
		
		c.add(btn);
		setSize(512,512);
		setVisible(true);
	}
	
	public static void main(String[] arg){
		new ImageButton();
	}
}
