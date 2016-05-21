public class CardList {
	private String name; // 카드 이름
	private int num; // 카드 숫자
	
	public CardList(){
	}
	
	public CardList(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNum(){
		return num;
	}
	
	public void display() {
		System.out.print("[ " + name + " / (" + this.num + ") ]");
	}
}