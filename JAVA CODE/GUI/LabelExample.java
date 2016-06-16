import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class LabelExample extends JFrame{
	
	Container contentPane;
	LabelExample(){
		setTitle("Image Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("³×ÀÌ¹ö!");
		ImageIcon Naver = new ImageIcon("./images/naver.jpg");
		JLabel label2 = new JLabel(Naver);
		
		contentPane.add(label);
		contentPane.add(label2);
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] arg){
		new LabelExample();
	}
	
}
