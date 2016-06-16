import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUITest1 extends JFrame {
	JLabel label;
	JLabel text;
	JPanel panel;
	
	GUITest1(){
		setTitle("GUITest1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Hi");
		label.setSize(50,20);
		label.setLocation(30,30);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.YELLOW);
		setContentPane(panel);
		panel.add(label);
		panel.addMouseListener(new MouseListenerTest());		
		
		setSize(512,512);
		setVisible(true);
		panel.requestFocus();
	}
	
	public static void main(String[] arg){
		new GUITest1();
	}
	
	private class MouseListenerTest extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
		}
	}
	
	private class KeyListenerTest extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			
		}
	}
	
}
