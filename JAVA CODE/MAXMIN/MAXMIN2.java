/* �Է¹��� �� �ִ밪 �ּҰ� ���ϱ�2
  ���:��Scanner / BurfferedReader / �迭 
  / for�� / if�� / do~while�� / try~catch��
 */
import java.util.Scanner;
import java.io.*;

public class MAXMIN2 {
	public static void main(String[] arg)throws Exception{
		Scanner sr = new Scanner(System.in);
		int MAX=0,MIN=0,flag=0;
		
		System.out.println("MAX�� MIN�� �����Ͻÿ� (MAX / MIN)");
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
					System.out.print("���� ���ڵ��� �Է��Ͻÿ� : ");
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
						System.out.println("MAX�� : "+MAX);
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
						System.out.println("MIN�� : "+MIN);
					}flag=0;
				} catch(NumberFormatException e){flag=1;}
				System.out.println("�Ϸ�Ǿ����ϴ�.");
			}else {flag=1; System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");}
		}while(flag==1);
	}
}