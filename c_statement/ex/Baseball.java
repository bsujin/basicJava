package c_statement.ex;

import java.util.Scanner;


public class Baseball {
	
		
//		//숫자야구게임 만들기
//			//숫자가 같은데 자리수가 똑같으면 s
//			//숫자만 같으면 b
//			//아예 없는 수는 o
//			//135는 기본/ 123은 랜덤

//			/*
//			 * 135 
//			 * 123 : 1S 1B 1O
//			 * 345 : 1S 1B 1O
//			 * 147 : 1S 0B 2O
//			
//			 * 1,2,5,6, 9, 
//			 *  345 : 0S 2B 1O
//			 *  _34 : 1S 1B 1O
//			 *  438 :3S
//			 *  
//			 */
			
//		1. 랜덤함수 만들기
//		int a= (int) (Math.random() * 최대값+ 증감값);  //랜덤숫자
	// 0~1.0 미만
	// 0.~0.999999
	//1부터 100까지 범위의 난수를 발생시키고 싶다면 'nextInt(100) + 1' 처럼 쓰시면 됩니다.
	//즉, 'nextInt(최대값) + 증감값'이라고 보시면 됩니다. 랜덤값은 0부터 시작을 하기때문에 0부터 계산할게 아니라면 더할 값을 추가
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in); 
		System.out.println("숫자야구 \n");
		
		
		int random1; 
		int random2; 
		int random3; 
	
		
		do {
			random1 = (int) (Math.random() * 9 + 1 );
			random2 = (int) (Math.random() * 9 + 1 );
			random3 = (int) (Math.random() * 9 + 1 );
			
		} while((random1 == random2) || (random1 == random3) || (random3 == random2)); 
		
		//for(int i = 1; true; i++) {
		
		int strike = 0 ;
		int ball = 0; 
		int out = 0; 
		
		do {
			System.out.println("숫자 세가지 입력하세요 1~9");
			
			System.out.println("첫번째숫자");
			int a = sc.nextInt();
			System.out.println("두번째숫자");
			int b = sc.nextInt();
			System.out.println("세번째숫자");
			int c = sc.nextInt();
			
			
			
			if(a == random1) {
				strike ++; 
			}if (a == random2) {
				ball++;
			} if (a == random3) {
				ball++;
			}if(b == random2) {
				strike ++; 
			} if (b == random1) {
				ball++;
			}  if (b == random3) {
				ball++;
			} if(c == random3) {
				strike ++; 
			} if (c == random1) {
				ball++;
			}  if (c == random2) {
				ball++;
			} out = 3 - strike - ball;
			
			System.out.println("입력숫자 : " + a + ", " + b + ", " + c );
			System.out.println(strike + "스트라이크 " + ball + "볼" + out + "아웃\n");
			System.out.println();
			
		}while (strike != 3); 
			
		System.out.println("정답");
		System.out.println("랜덤숫자 : " + random1 + ", " + random2 + ", " + random3 );

	
		
		
		
		
		
		
		
		
	}

}



	
	
//				
//Scanner  sc = new Scanner(System.in); 
//	
//		System.out.println("숫자야구 게임");
//		System.out.println("숫자를 입력하세요");
//		
//		int random1 =  (int)(Math.random()*9)+1;
//		
//		
//		
//		
//	}
//}
