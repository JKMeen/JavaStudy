import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MouseAdaptorExample extends JFrame{
	JLabel label; // Ŭ���� ����� �� (���� label�� ����)
	JLabel lCode, lChar, lString;
	JPanel panel;
	
	MouseAdaptorExample(){
		setTitle("Mouse Adaptor"); // Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷� ����� ���ε� �ݾ���
		
		label = new JLabel("Hello"); // Hello��� �̸��� ���̺� ����
		label.setSize(50,20); // setSize�� �ؼ� label�� ũ�⸦ �����
		label.setLocation(30,30); // label�� ��ǥ
		
		lCode = new JLabel("Code");
		lChar = new JLabel("Char");
		lString = new JLabel("String");
		lCode.setSize(50,20);
		lCode.setLocation(100,30);
		lChar.setSize(50,20);
		lChar.setLocation(150,30);
		lString.setSize(50,20);
		lString.setLocation(200,30);
		
		panel = new JPanel(); //�ڽ��� �г��� ����
		panel.setLayout(null); // JFrame���� ���� ���̾ƿ��� ������� �ʰڴ�
		panel.setBackground(Color.YELLOW);
		setContentPane(panel); // ������ ��� �Ƕ��� (�����̳�)
		panel.add(label); // �гο� label�� �߰���
		panel.add(lCode);
		panel.add(lChar);
		panel.add(lString);
		
	    panel.addMouseListener(new MyMouseListener2()); //���콺�����ʸ� �߰�
		panel.addKeyListener(new MyKeyListener());
	    
	    
	    setSize(512,512); //ȭ�� ������
		setVisible(true); // �� �ۼ��� �͵��� Visible(��üȭ)��
		panel.requestFocus(); //Ű�� �������� ��Ŀ���� �޾ƾ� ��(Visible �Ŀ� ������Ʈ�ؾߵ�)
	}
	
	public static void main(String[] arg){
		new MouseAdaptorExample();
	}
	
	private class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int code = e.getKeyCode();
			char c = e.getKeyChar();
			String text = e.getKeyText(code);
			lCode.setText(Integer.toString(code));
			lChar.setText(Character.toString(c));
			lString.setText(text);
		}
	}
	
	private class MyMouseListener2 extends MouseAdapter { //extends�� �߻��� �ƴ� Ŭ������ ���
		public void mousePressed(MouseEvent e) { // ���콺 Ŭ�� �� �̺�Ʈ
			int x = e.getX(); // ���콺 ��ġ x�� 
			int y = e.getY(); // ���콺 ��ġ y��
			label.setLocation(x, y); //x.y�� ��ġ�� �����
		}
		public void mouseReleased(MouseEvent e){
			label.setLocation(30,30);
		}
		public void mouseClicked(MouseEvent e){
			if(e.getClickCount()==2)
				panel.setBackground(Color.RED);
			else{
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				JPanel p = (JPanel)e.getSource();
				p.setBackground(new Color(r,b,g));
			}
		}
	}
}
