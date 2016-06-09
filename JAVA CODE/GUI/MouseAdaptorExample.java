import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MouseAdaptorExample extends JFrame{
	JLabel label; // 클래스 멤버가 됨 (전역 label이 됐음)
	JLabel lCode, lChar, lString;
	JPanel panel;
	
	MouseAdaptorExample(){
		setTitle("Mouse Adaptor"); // 타이틀 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 종료시 메인도 닫아줌
		
		label = new JLabel("Hello"); // Hello라는 이름의 레이블 생성
		label.setSize(50,20); // setSize로 해서 label의 크기를 잡아줌
		label.setLocation(30,30); // label의 좌표
		
		lCode = new JLabel("Code");
		lChar = new JLabel("Char");
		lString = new JLabel("String");
		lCode.setSize(50,20);
		lCode.setLocation(100,30);
		lChar.setSize(50,20);
		lChar.setLocation(150,30);
		lString.setSize(50,20);
		lString.setLocation(200,30);
		
		panel = new JPanel(); //자신의 패널을 만듬
		panel.setLayout(null); // JFrame에서 쓰는 레이아웃을 사용하지 않겠다
		panel.setBackground(Color.YELLOW);
		setContentPane(panel); // 내용을 담는 판떼기 (컨테이너)
		panel.add(label); // 패널에 label을 추가함
		panel.add(lCode);
		panel.add(lChar);
		panel.add(lString);
		
	    panel.addMouseListener(new MyMouseListener2()); //마우스리스너를 추가
		panel.addKeyListener(new MyKeyListener());
	    
	    
	    setSize(512,512); //화면 사이즈
		setVisible(true); // 위 작성한 것들을 Visible(실체화)함
		panel.requestFocus(); //키를 받으려면 포커스를 받아야 함(Visible 후에 리퀘스트해야됨)
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
	
	private class MyMouseListener2 extends MouseAdapter { //extends는 추상이 아닌 클래스를 상속
		public void mousePressed(MouseEvent e) { // 마우스 클릭 시 이벤트
			int x = e.getX(); // 마우스 위치 x값 
			int y = e.getY(); // 마우스 위치 y값
			label.setLocation(x, y); //x.y의 위치를 잡아줌
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
