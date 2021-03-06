import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		play p = new play();
		int pHP=50, cHP=100;
		int num =0;
		CardList card[] = new CardList[3];
		
		p.SetHP(pHP, cHP); // 체력 생성
		p.display();

		while(true){
		
			System.out.print(">> 플레이어 카드 : ");
			for(int i=0; i<3; i++)
			{
				int play = rand.nextInt(5)+1;
				switch(play){
				case 1 : card[i] = new CardList("공격",1); break;
				case 2 : card[i] = new CardList("강타",2); break;
				case 3 : card[i] = new CardList("회복",3); break;
				case 4 : card[i] = new CardList("방어",4); break;
				case 5 : card[i] = new CardList("공격반사",5); break;
				} // 카드 리스트에 저장	
				card[i].display();
			}
			System.out.println("");
			
			////////////////////////////////////////////////////////////////
			System.out.println("(1)공격 , (2)강타, (3)회복 , (4)방어, (5)공격반사");
			
			for(int i=0; i<3; i++)
			{
				System.out.println("");
				System.out.println("<<플레이어 턴! 사용할 카드의 번호를 입력하시오.>>");
				
			    num = scan.nextInt(); // 입력받은 카드 번호
			    
			    if (num == card[0].getNum() || num == card[1].getNum()|| num == card[2].getNum())                                   
			    { 
			    	//플레이어 턴
			    	p.choice(num); // 플레이어 카드 값을 넣어줌	
			    	
			    }
			    
				else { System.out.println("잘못된 카드번호를 입력하였습니다. 다시 입력하세요."); i--; }
			}
			
			//보스 턴
			int com = rand.nextInt(7)+1; 
		    
			p.comchoice(com, num ); // 컴퓨터 카드 값을 넣어줌
			
			 if(p.pHP <= 0) {
					System.out.println("");
					System.out.println("***********************************");
					System.out.println("**********    보스 승!!    **********");
					System.out.println("***********************************");
					break;
			}else if(p.cHP <= 0) {
					System.out.println("");
					System.out.println("***********************************");
					System.out.println("**********   플레이어 승!!   **********");
					System.out.println("***********************************");
					break;
			}else{
					System.out.println("    <<다음 라운드!>>    "); System.out.println(""); continue;
			}
			
		}
	}
}