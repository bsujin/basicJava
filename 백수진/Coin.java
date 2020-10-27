package 백수진;

import java.util.Scanner;

public class Coin {
	Scanner sc = new Scanner(System.in);
	
	//배팅하는 창
	//1.배팅 질문
	void question(){
		User user = new User();	
		System.out.println("카드는 : " + user.user_Card.length);
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
	//2. 배팅 결과 
	void batting() {		//모두 접근 가능 
		User user = new User();
		
		
		System.out.println("얼마를 배팅하시겠습니까?");
		int b = sc.nextInt();
		
		
		if(user.user_Card.length > user.com_Card.length){		//유저의 카드값이 큰 경우
			int c = b*2;
			user.coin += c; 					//원래 코인에서 더해줌 
			System.out.println("컴퓨터의 카드는 : " + user.com_Card.length);
			System.out.println("코인을 얻었습니다."  + user.coin);
			user.showInfo();
		
		}else if(user.com_Card.length > user.user_Card.length){		//컴퓨터의 카드 값이 큰 경우
			user.coin -= b;
			System.out.println("컴퓨터의 카드는 : " + user.com_Card.length);
			System.out.println("코인을 잃었습니다." + user.coin);
			user.showInfo();
			
		}else{
			System.out.println("컴퓨터의 카드는 : " + user.com_Card);
			System.out.println("무승부, 다시 시작하세요.");
			user.showInfo();
			
		} 
		
	}
}