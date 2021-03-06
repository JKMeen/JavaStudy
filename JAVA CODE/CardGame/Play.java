interface Choice { // 카드 번호 입력 받음
	void choice(int num); 
}

interface ComChoice { // 카드 번호 입력 받음
	void comchoice(int com, int com2); 
}

class play implements Choice, ComChoice{
	public int pHP, cHP;
	public int com, num;
	
	public void SetHP(int pHP, int cHP) 
	{ 
		this.pHP = pHP; this.cHP = cHP;
	}
	
	public void choice(int num) // 
	{
		switch (num){
			case 1 : cHP--; System.out.println("->보스 공격! HP-1"); break;
			case 2 : cHP-=3; System.out.println("->보스 강타! HP-3"); break;
			case 3 : pHP+=4; System.out.println("+>플레이어체력 회복! HP+4"); break;
			case 4 : System.out.println("보스 공격 방어! (다음 턴 적용)"); break;
			case 5 : System.out.println("보스 공격 반사! (다음 턴 적용)"); break;
		}

		System.out.println("( 플레이어 체력 : " + pHP + " ) ( 보스 체력 : " + cHP + " )"); 
	}
		
	public void comchoice(int com, int num)
	{
		this.com = com;
		this.num = num;
		
		System.out.println(""); System.out.println("-------------------"); 
		System.out.println("    <<보스 턴!>>    ");
		
		switch (com){
			case 1 : 
				if(num == 4) {
					System.out.println("플페이어 공격!");
					System.out.println("플레이어: 공격 방어!");break;
				}
				else if(num == 5) {
					cHP-=10; System.out.println("플레이어: 공격 반사! cHP-10");break;
				}
				else if(num != 4 && num !=5) {pHP-=10; System.out.println("->플레이어 공격! HP-10");}break;
			
			case 2 : 
				if(num == 4) {
					System.out.println("->플페이어 강타!");
					System.out.println("+>플레이어: 공격 방어!");break;
				}
				else if(num == 5) {
					cHP-=20; System.out.println("->플레이어: 공격 반사! cHP-20");break;
				}
				else if(num != 4 && num !=5) {pHP-=20; System.out.println("->플레이어 강타! HP-20");}break;
			
			case 3 : cHP+=20; System.out.println("+>보스체력 회복! HP+20"); break;
			
			case 4 : 
				if(num == 4) {
					System.out.println("+>플레이어: 공격 방어!");break;
				}
				else if(num == 5) {
					System.out.println("->보스 육참골단 사용!");
					cHP-=40; System.out.println("->플레이어: 공격 반사! cHP-40");break;
				}
				else if(num != 4 && num !=5) {cHP-=40; pHP-=40; System.out.println("+>보스 육참골단 사용! 플레이어, 보스  HP-40!");}break;
				
			default : System.out.println("** 보스 스턴! **"); break;
			
		}
		System.out.println("( 플레이어 체력 : " + pHP + " ) ( 보스 체력 : " + cHP + " )");
		System.out.println(""); System.out.println("");
	}
	
	public int PlayHP() 
	{return pHP;}
	public int ComHP() 
	{return cHP;}
	
	public void display() {
		System.out.println("( 플레이어 체력 : " + pHP + " ) ( 보스 체력 : " + cHP + " )");
	}
}