//학생의 성적순으로 나타내기
import java.util.Scanner;

public class Program {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many Student? ");
		int nStudent = sc.nextInt();
		
		Student[] aArr = new Student[nStudent]; //c++에서는 여기서 완결
		//자바는 이게 주소값을 가르켜서 새로 객체처럼 만들어줘야함
		for(int i=0; i<nStudent; i++){
			aArr[i] = new Student(); //객체 처럼 만든게 이것임
			System.out.print("이름 : 국어 : 영어: 수학: ");aArr[i].setName(sc.next());
			aArr[i].setScore(0, sc.nextInt());
			aArr[i].setScore(1, sc.nextInt());
			aArr[i].setScore(2, sc.nextInt());
		}

		Student bestStudent = aArr[0]; // bestStudent의 주소값만을 가짐
		for(Student s : aArr){//for(int i=0;i<nStudent; i++){
			if(s.getTotalScore() > bestStudent.getTotalScore()){
				bestStudent = s;
			}
		}
		System.out.println("Best Student = "+bestStudent.getName());
		
		
		Student worstStudent = aArr[0];
		for(Student s : aArr){
			if(s.getTotalScore() < worstStudent.getTotalScore()){
				worstStudent = s;
			}
		}
		System.out.println("Worst Student = "+worstStudent.getName());
			
		/*for(int i=0;i<nStudent; i++){
			aArr[i].display();
		}*/	
	}
}
