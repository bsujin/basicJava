package 백수진;

import java.util.Scanner;

public class card {

	int [] com_Card = new int [] {1,2,3,4,5,6,7,8,9,10}; 
	int [] user_Card = new int [] {1,2,3,4,5,6,7,8,9,10};
	Scanner sc = new Scanner(System.in);
	User user = new User();
	
	void question(){
		User user = new User();	
		
		for (int c = 0; c <this.com_Card.length; c++){
			this.com_Card[c] = (int)(Math.random() * 10)+1;
		for (int u = 0; u < this.user_Card.length; u++){
		 this.user_Card[u] =  (int)(Math.random()*10)+1;
		 int getcard =  user_Card.length;
		 System.out.println("당신의 카드는  : " +getcard);
		System.out.println("배팅 하시겠습니까?  ");
		System.out.println("1.네  \t 2.아니오" );
		
		int a = sc.nextInt();
		if(a==1){
			batting();
				
			}else if(a==2){
				System.out.println("졌습니다.");
				user.showInfo();
		
	}
		}
		}}
	
	void batting(){
	
		 
		 System.out.println("얼마를 배팅하시겠습니까?");
			int b = sc.nextInt();
				
			for (int c = 0; c <this.com_Card.length; c++){
				for (int u = 0; u < this.user_Card.length; u++){
			 if(user_Card[u]>com_Card[c]){
			  	int user_coin = b*2;
			  	System.out.println("코인을 얻었습니다."  + user.coin);
					user.showInfo();
						
				}else if(user_Card[u] > com_Card[c]){		//컴퓨터의 카드 값이 큰 경우
					user.coin -= b;
				System.out.println("컴퓨터의 카드는 : " + com_Card);
				System.out.println("코인을 잃었습니다." + user.coin);
				user.showInfo();
							
				}else{
				System.out.println("컴퓨터의 카드는 : " + com_Card);
				System.out.println("무승부, 다시 시작하세요.");
				user.showInfo();
							
					} 
					
		 }
		 }
		
	}
	
	
}
