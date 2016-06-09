import java.util.*;

class GStack<T>{
	int tos;
	Object [] name;
	Object [] coin;
	
	public GStack(){
		tos = 0;
		name = new Object [10];
		coin = new Object [10];
	}
	
	public void GetCoin(String name, int coin){
		if(tos == 10) return;
		this.name[tos] = name;
		this.coin[tos] = coin;
		tos++;
	}
	
	public T pop() {
		if(tos ==0)
			return null;
		tos--;
		return (T)name[tos];
	}
	
	public String coinpop(){
		if(tos ==0)
			return null;
		tos--;
		return (String)"(" + name[tos] +" , " + coin[tos] + ")";
	}
}

public class stack2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		GStack<Object> CoinStack = new GStack<Object>();
		
		System.out.println("입력할 갯수 입력 : ");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++){
			System.out.println("한글, 숫자 입력");
			CoinStack.GetCoin(scan.next(), scan.nextInt());
		}

		for(int n=0; n<num; n++)
			System.out.println(CoinStack.coinpop());
	}
}
