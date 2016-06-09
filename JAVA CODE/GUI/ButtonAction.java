import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonAction extends JFrame {

	ButtonAction(){
		setTitle("My first window");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		add(btn);
		
		setSize(512,360);
		setVisible(true);
	}
	
	public static void main(String[] arg){
		new ButtonAction();
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("¾×¼Ç");
		else
			b.setText("Action");
	}
}