import java.io.*;

public class MyDiary {
    public static void main(String[] argv) {
        try {
            if(argv.length<2) {
                System.out.println("arguments missing");
                return;
            }
            String tempFile = "./tempXYZEncoded_YYYY.out";
            FileInputStream fin = new FileInputStream(argv[0]); // source file
            FileOutputStream fout = new FileOutputStream(tempFile); // destination file
            int pass = Integer.parseInt(argv[1]);
            int c;
            while ( (c=fin.read()) != -1 ) {
                fout.write(c^pass);
            }
            fin.close();
            fout.close();

            // remove original and rename temp file
            File original = new File(argv[0]);
            File newFile = new File(tempFile);

            original.delete();
            newFile.renameTo(original);
        }
        catch (IOException e) {
        }
    }
}