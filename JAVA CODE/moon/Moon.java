import java.util.*;

public class Moon {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		Calendar curTime = Calendar.getInstance();
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.set(1900,0,31); // ���� 0���� �����ؼ� 12�������� 11�Է�
		
		int year, month, day;
        year = curTime.get(Calendar.YEAR);
        month = curTime.get(Calendar.MONTH);
        day = curTime.get(Calendar.DAY_OF_MONTH);
        System.out.println("������ " + year + "�� " + (month+1) + "�� " + day + "��");

		
		long daysPassed = daysBetween(firstDate, curTime);
		double moon = moonPhase(daysPassed);
		
		System.out.println("���� ���� ���� = " + moon);
		//////////////////////////////////////////////////////////////////
		
		System.out.println("���� ���¸� �˰� ���� ��¥�� �Է� : ");
		String Days = scan.nextLine();
		String data[] = Days.split(". ");
		
		int[] arr = new int[data.length];
		
		for(int i=0; i<data.length; i++)
		{
			arr[i] = Integer.parseInt(data[i]);
		}
		
		curTime.set(arr[0], arr[1]-1, arr[2]);
		
		daysPassed = daysBetween(firstDate, curTime);
		moon = moonPhase(daysPassed);
		System.out.println("���� ���� ���� = " + moon);
	}
	//���� ���� ���� ���ϱ�
	static double moonPhase(long daysPassed) {
		double cycle = 29.530508853;
		double phase = daysPassed/cycle;
		phase -= Math.floor(phase); // ���� ����
		return phase;
	}
	//�����޿��� ������ ��¥ ���ϱ�
	public static long daysBetween(Calendar s, Calendar e) {
		Calendar date = (Calendar) s.clone(); // ������ �����ؼ� ��, ������Ʈ�� ����
		int days = 0;
		while(date.before(e)) {
			date.add(Calendar.DAY_OF_MONTH, 1);
			days ++;
		}
		return days;
	} // s�� �¾ ��¥, e�� ���� ��¥
}