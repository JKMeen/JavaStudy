import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing1 extends JFrame{ //JFrame을 상속
	
	Swing1(){ //생성자를 만듬
		setTitle("첫번째 프레임");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		Swing1 sw = new Swing1();
	}
}
