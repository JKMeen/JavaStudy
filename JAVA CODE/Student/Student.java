
public class Student {
	private String name;
	private int Korea;
	private int English;
	private int Math;
	
	void setName(String n){
		name = n;
	}
	void setScore(int course, int score){
		switch(course){
		case 0 : Korea = score; break;
		case 1 : English = score; break;
		case 2 : Math = score; break;
		default : System.out.println("Invalid course ID");
		}
	}
	
	int getTotalScore(){
		return Korea+English+Math;
	}
	String getName(){
		return name;
	}
	
	public void display(){
		System.out.println(name + ":" + Korea + "," + English + "," + Math);
	}
}
