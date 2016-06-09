import java.util.*;

public class Moon {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		Calendar curTime = Calendar.getInstance();
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.set(1900,0,31); // 달은 0부터 시작해서 12월이지만 11입력
		
		int year, month, day;
        year = curTime.get(Calendar.YEAR);
        month = curTime.get(Calendar.MONTH);
        day = curTime.get(Calendar.DAY_OF_MONTH);
        System.out.println("오늘은 " + year + "년 " + (month+1) + "월 " + day + "일");

		
		long daysPassed = daysBetween(firstDate, curTime);
		double moon = moonPhase(daysPassed);
		
		System.out.println("달의 현재 상태 = " + moon);
		//////////////////////////////////////////////////////////////////
		
		System.out.println("달의 상태를 알고 싶은 날짜를 입력 : ");
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
		System.out.println("달의 현재 상태 = " + moon);
	}
	//달의 현재 상태 구하기
	static double moonPhase(long daysPassed) {
		double cycle = 29.530508853;
		double phase = daysPassed/cycle;
		phase -= Math.floor(phase); // 현재 상태
		return phase;
	}
	//보름달에서 부터의 날짜 구하기
	public static long daysBetween(Calendar s, Calendar e) {
		Calendar date = (Calendar) s.clone(); // 생일을 복제해서 씀, 오브젝트를 리턴
		int days = 0;
		while(date.before(e)) {
			date.add(Calendar.DAY_OF_MONTH, 1);
			days ++;
		}
		return days;
	} // s는 태어난 날짜, e는 현재 날짜
}