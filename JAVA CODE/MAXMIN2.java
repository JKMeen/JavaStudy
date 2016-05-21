/* 입력받은 수 최대값 최소값 구하기2
  사용:　Scanner / BurfferedReader / 배열 
  / for문 / if문 / do~while문 / try~catch문
 */
import java.util.Scanner;
import java.io.*;

public class MAXMIN2 {
	public static void main(String[] arg)throws Exception{
		Scanner sr = new Scanner(System.in);
		int MAX=0,MIN=0,flag=0;
		
		System.out.println("MAX와 MIN를 선택하시오 (MAX / MIN)");
	do
		{
			BufferedReader x = null;
			x = new BufferedReader(new InputStreamReader(System.in));
			String a = x.readLine();
	    
			String MAX1 = "MAX";
			String MIN1 = "MIN";
			if(a.equals(MAX1) || a.equals(MIN1))
			{	
				try{
					System.out.print("비교할 숫자들을 입력하시오 : ");
					String input = sr.nextLine();
					String data[] = input.split(" ");
		
					int[] arr = new int[data.length];
		
					for(int i=0; i<data.length; i++){
						arr[i] = Integer.parseInt(data[i]);
					}

					if(a.equals(MAX1))
					{
						for(int i=0; i<data.length-1; i++){
							if(i==0){MAX=arr[i];}
							if(i>=0){
								if(MAX<=arr[i+1]){
									MAX = arr[i+1];
								}
							}
						}
						System.out.println("MAX값 : "+MAX);
					}
					else if(a.equals(MIN1)){
						for(int i=0; i<data.length-1; i++){
							if(i==0){MIN=arr[i];}
							if(i>=0){
								if(MIN>arr[i+1]){
									MIN = arr[i+1];
								}
							}
						}
						System.out.println("MIN값 : "+MIN);
					}flag=0;
				} catch(NumberFormatException e){flag=1;}
				System.out.println("완료되었습니다.");
			}else {flag=1; System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");}
		}while(flag==1);
	}
}