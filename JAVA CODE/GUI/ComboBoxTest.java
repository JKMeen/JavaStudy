import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComboBoxTest extends JFrame{
	Container c;
	String[] fruits = {"apple", "banana", "kiwi", "mango"};
	ImageIcon[] images = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")};
	JLabel imgLabel = new JLabel(images[0]);
	
	
	ComboBoxTest(){
		setTitle("ComboBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JComboBox cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		c.add(strCombo);
		c.add(imgLabel);
		
		setSize(600,400);
		setVisible(true);
	}
	
	public static void main(String[] arg){
		new ComboBoxTest();
	}
}
