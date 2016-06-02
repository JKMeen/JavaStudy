import java.util.*;

public class hashmap1 {

    public static void main(String[] s) {
        Scanner myScanner = new Scanner(System.in);

        HashMap<String, String> dictionary = new HashMap<String,String>();

        while(true) {
            System.out.println("input key:");
            String key = myScanner.next();
            if(key.equals("end")) break;

            System.out.println("meaning: ");
            String value = myScanner.next();

            dictionary.put(key, value);
        }
        while(true) {
        	String quas = myScanner.next();
        	String meaning = dictionary.get("quas");
        	if(meaning.equals("end")) break;
        	System.out.println(meaning);
        }
    }
}
