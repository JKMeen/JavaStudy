import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MouseButtonAction extends JFrame {

	MouseButtonAction() {
		setTitle("Mouse리스너");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Action");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
		}
		public static void main(String [] args) {
		new MouseButtonAction();
		}
}
	class MyMouseListener implements MouseListener {
		public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e){}
}