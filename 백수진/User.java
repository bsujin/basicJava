package 백수진;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	
	int coin = 10;
	


	// 상태창 만들기

	void showInfo() {
		System.out.println("===============================");
		System.out.println("-------------상태---------------");
		System.out.println(" 보유한 코인  : " + coin);
		System.out.println("================================");
		System.out.println(" 카드를 뽑겠습니까? ");
		System.out.println(" 1.네 \t2.아니오 ");
		int s =  sc.nextInt();
		if(s==1){
			game();
		}else if(s==2){
			showInfo();
		}else{
			showInfo();
		}
	}

	// 게임 실행
	// 컴퓨터 카드보다 카드의 숫자가 높으면 이기는 게임
	// 랜덤으로 카드를 받아 컴퓨터의 카드보다 높은지 배팅 
	
	
	void game() {
		card C = new card();
		C.question();
		
			
			
			


	}

}


