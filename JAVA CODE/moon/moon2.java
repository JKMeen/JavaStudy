import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class moon2 {

    public static void main(String[] s) {
        Scanner scanner = new Scanner(System.in);
	    
        Calendar curTime = Calendar.getInstance();
        Calendar firstDate = Calendar.getInstance();
        firstDate.set(1900,0,31);
        
        int year, month, day;
        year = curTime.get(Calendar.YEAR);
        month = curTime.get(Calendar.MONTH);
        day = curTime.get(Calendar.DAY_OF_MONTH);
        System.out.println("������ " + year + "��" + (month+1) + "��" + day + "��");

        long daysPassed =  daysBetween(firstDate, curTime);     
        double moonPhase = moonPhase(daysPassed);       
        System.out.println("Moon Phase = " + moonPhase);
    
        System.out.println("���� ���¸� �˰� ���� ��¥�� �Է��ϼ���>>");   
        int[] arr = new int[3];
	    String Day = scanner.nextLine();
	    StringTokenizer st = new StringTokenizer(Day, ".,=-& ");
	   
	    arr[0]=Integer.parseInt(st.nextToken());
	    arr[1]=Integer.parseInt(st.nextToken());
	    arr[2]=Integer.parseInt(st.nextToken());
	    System.out.println("��Ʈ�迭"  + " : "  + arr[0] + " | " + arr[1] + " | " + arr[2]);
	    
	    curTime.set(arr[0], arr[1]-1, arr[2]);
	    daysPassed =  daysBetween(firstDate, curTime);      
	    moonPhase = moonPhase(daysPassed);      
	    System.out.println("Days Moon Phase = " + moonPhase);
    }
    static double moonPhase(long daysPassed) {
        double cycle = 29.530508853;
        double phase = daysPassed/cycle;
        phase = phase - Math.floor(phase);
        return phase;
    }
    static long daysBetween(Calendar s, Calendar e) {
        Calendar date = (Calendar) s.clone();
        int days = 0;
        while(date.before(e)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            days ++;
        }
        return days;
    }
}
