//�л��� ���������� ��Ÿ����
import java.util.Scanner;

public class Program {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many Student? ");
		int nStudent = sc.nextInt();
		
		Student[] aArr = new Student[nStudent]; //c++������ ���⼭ �ϰ�
		//�ڹٴ� �̰� �ּҰ��� �����Ѽ� ���� ��üó�� ����������
		for(int i=0; i<nStudent; i++){
			aArr[i] = new Student(); //��ü ó�� ����� �̰���
			System.out.print("�̸� : ���� : ����: ����: ");aArr[i].setName(sc.next());
			aArr[i].setScore(0, sc.nextInt());
			aArr[i].setScore(1, sc.nextInt());
			aArr[i].setScore(2, sc.nextInt());
		}

		Student bestStudent = aArr[0]; // bestStudent�� �ּҰ����� ����
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
