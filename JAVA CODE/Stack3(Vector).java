import java.util.*;

class Coin {
    private String x;
    private int y;

    public Coin(String x, int y) {
        this.x = x; this.y = y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }
}

public class Vector1 {
    public static void main(String[] arg) {
    	Scanner scan = new Scanner(System.in);
        Vector<Coin> v = new Vector<Coin>();
        
        int end = 0;
        while(end != -1){
        	System.out.println("���ڿ� ���� �Է�(����� ���ڿ� -1 �Է�) : ");
        	String st = scan.next(); 
            int in = scan.nextInt();
           end = in;
            v.add(new Coin(st,in));
        }
        	
        v.insertElementAt(new Coin("��",0), 2);

        Iterator<Coin> it = v.listIterator();

        for(int i= v.size()-1; i>=0; i--){
        	System.out.println(v.get(i));
        }
    }
}
