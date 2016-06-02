
class GStack<T>{
	int tos;
	Object [] stck;
	
	public GStack(){
		tos = 0;
		stck = new Object [10];
	}
	
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos ==0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

class Coin {
	String name;
	int coin;
	
	public void GetCoin(String name, int coin){
		this.name = name;
		this.coin = coin;
	}
	
	public String SetName(){
		return name;
	}
	
	public Int SetCoin(){
		return coin;
	}
	
}

public class Stack2 {
	public static void main(String[] args){
		GStack<Coin> stringStack = new GStack<Coin>();
		stringStack.push("십원", 10);
		stringStack.push("오십원", 50);
		stringStack.push("백원", 100);
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop());
	}
}
