import java.io.*;

public class FileStream {
	public static void main(String[] arg){
		
		try{
			FileOutputStream fout = new FileOutputStream("./test.out");
	
			for(int i=0; i<=1024; i++){
				int num=i;
				fout.write(num);
				fout.write(num>>8);
				fout.write(num>>16);
				fout.write(num>>24);
			}
			fout.close();
			
			FileInputStream fin = new FileInputStream("./test.out");
			int input;
			while((input = fin.read())!=-1){
				int value =0;
				value +=input;
				value += fin.read()*256;
				value += fin.read()*256*256;
				value += fin.read()*256*256*256;
				System.out.println(value);
			}
			fin.close();
		}
		
		catch(IOException e){
			System.out.println("IO Error");
		}
	}
}
