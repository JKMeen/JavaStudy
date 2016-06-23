import java.io.*;
import java.util.Scanner;
//결과가 파일로 저장
public class FileOutputStream_Examp {
	public static void main(String[] arg){
		try{
			BufferedWriter fout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test.txt")));
			System.out.println("숫자입력");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			String so;
				for(int i=2; i<=num; i=i+2){
					System.out.println("i : " + i);
					so = Integer.toString(i);
					fout.write(so);
					fout.write(" ");
				}		
				fout.close();
		}
		catch(IOException e){
			System.out.println("IO Error");
		}
	}
}
