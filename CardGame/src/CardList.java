public class CardList {
	private String name; // ī�� �̸�
	private int num; // ī�� ����
	
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