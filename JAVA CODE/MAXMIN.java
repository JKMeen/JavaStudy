/*�Է¹��� �� �ִ밪 �ּҰ� ã��
 ���: Scanner / InputStreamReader(String->int) / �迭 / switch�� 
      / for�� / if�� / do~while�� / try~catch��
 */
import java.util.Scanner;
import java.io.*;

public class MAXMIN {
	public static void main(String[] arg)throws Exception{
		Scanner sr = new Scanner(System.in);
		InputStreamReader rd = new InputStreamReader(System.in);
		int MAX=0,MIN=0,flag=0;
		System.out.println("-- MAX�� MIN�� �����Է����ּ��� ( M / N )--");
		do{
			char a = (char)rd.read(); //a = a=='M' ? 'M' : a=='N' ? 'N' : 'X';
			if(a=='M'||a=='N')
			{	
				try{
					System.out.print("���� ���ڵ��� �Է��ϼ��� : ");
					String input = sr.nextLine();
			
					String data[] = input.split(" ");

					int[] arr = new int[data.length];
		
					for(int i=0; i<data.length; i++){
						arr[i] = Integer.parseInt(data[i]);
					}
					switch(a)
					{
					case 'M':
						for(int i=0; i<data.length-1; i++){
							if(i==0){MAX=arr[i];}
							if(i>=0){
								if(MAX<=arr[i+1]){
									MAX = arr[i+1];
								}
							}
						} System.out.println("MAX�� : "+MAX);
						break;
			
					case 'N':
						for(int i=0; i<data.length-1; i++){
							if(i==0){MIN=arr[i];}
							if(i>=0){
								if(MIN>arr[i+1]){
									MIN = arr[i+1];
								}
							}
						} System.out.println("MIN�� : "+MIN);
						break;
					}
					System.out.println("�Ϸ�Ǿ����ϴ�.");
					flag=0;
				} catch(NumberFormatException e){flag=1;}
			}else {flag=1; System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");}
		} while(flag==1);
	}
}