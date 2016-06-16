import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CheckBox extends JFrame{
	CheckBox(){
		setTitle("CheckBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon naver = new ImageIcon("./images/naver.jpg");
		ImageIcon naver2 = new ImageIcon("./images/naver2.jpg");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cb = new JCheckBox("���̹�", naver);
		cb.setSelectedIcon(naver2);
		
		c.add(apple);
		c.add(pear);
		c.add(cb);
		setSize(512,512);
		setVisible(true);
		
	}
	
	public static void main(String[] arg){
		new CheckBox();
	}
}
