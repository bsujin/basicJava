package c_statement;

import java.util.Scanner;

public class ReptitiveStatement {

	public static void main(String[] args) {

		/*
		 * 반복문 
		 * - for문 
		 * - while문 
		 * - do-while문
		 * 
		 * 
		 * 
		 * for문 ->(횟수가 정해진 경우 사용) 
		 * - for(초기화; 조건식; 증감식){} 
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하게 해주는 문장
		 */

		for (int i = 1; i <= 10; i++) {
			// for(int (i) = 1; i <= 10; i++){
			// (i)벗어날 수 없는 변수

			// 초기화 : 조건식과 증감식에서 사용할 변수 초기화
			// 조건식 : 연산결과가 'true'이면 블럭안의 내용을 수행한다.
			// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.

			// 실행 - 증가해서-조건식 검사 , false가 나오면 조건문 탈출

			System.out.println(i + "번째 반복");
		}

		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용

		int sum = 0; // 1부터 10까지 합계를 저장

		sum += 1; // 1씩 증가된다는 규칙
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 증감
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 100; i >= 1; i--) { // 위와 반대로 100부터 1까지 감소
			sum += i;
		}
		System.out.println(sum);

		// 예제문제
		// 1부터 100까지 짝수의 합을 출력해주세요.
		// 방법1
				sum = 0;
				for (int i = 2; i <= 100; i++) {
					if (i % 2 == 0) {
						sum += i;
					}
				}
				System.out.println(sum);

				// 방법2
				for (int i = 2; i <= 100; i += 2) {
					sum += i;
				}

				System.out.println(sum);
	
		// 1부터 100가지 홀수의 합을 출력해주세요.
				sum = 0;

				for (int i = 1; i <= 100; i++) {
					if (i % 2 == 1) {
						sum += i;
					}
				}System.out.println(sum);
				

		// 구구단출력
		/*
		 * 2 * 1 = 2 ->(증가 * 2) 
		 * 2 * 2 = 4
		 *  2 * 3 = 6 
		 *  2 * 4 = 8 ...
		 */
		
		//2단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + i * 2);
		}	//(앞의 값  + 두번째 값 ( 1씩 증가이므로 i) + "" +i *(규칙적인 증가값));
	
		//7단 출력
		for (int i = 1; i<= 9; i++){
			System.out.println(" 7* " + i + " = " + i * 7);
		}
	
		//2단부터 9단까지	->여러개일 경우 for을 감싸는 또다른 for문
		
		for(int i = 2; i<=9; i++){		//2단부터 9단, i 변수사용=> (2부터 9까지의 고정된값)
			for(int j= 1; j <=9; j++){		//값이 1씩 증가 (규칙)
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
			/*
			 * 구구단 전체를 가로로 출력해주세요.
			 * 2 * 1 = 2  3 * 1 = 3	4 * 1 = 4
			 *    2 * 2 = 4  3 * 2 = 6 	4 * 2 = 8
			 *    탭 : \t			 
			 */		// 위에 문제와 달리, '앞자리'가 증가하므로 i와 j의 위치를 바꿔줌
			
		
			for(int i=1; i<=9; i++){		// 두번째 자리 (규칙)
				for(int j=2; j<=9; j++){ 	// 첫번째 자리 (앞자리가 변함=변수)
					System.out.print(j+ " * " + i + " = " + i *j + "\t"); // (한줄 = print)
								// 첫번째 자리 (앞자리가 변함=변수) + * + 두번째 자리 
				}	System.out.println();	//가로 위치 맞게 (for문 안에 문장 수행)
			}	
		
			//*for 문과 가로의 위치 잘 확인할것.
			
			/*
			 * while문
			 * - while(조건식){}	(조건식만 있는것)
			 * - 조건식이 true인 경우 반복
			 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
			 * - '반복횟수가 정확하지 않은' 경우에 주로 사용한다.
			 */
			
			int a = 1;
			//a에 2씩 몇번 곱해야 1000이상이 되는지 알아보자.
			int count = 0;
			while(a < 1000){
				a *= 2;
				count++;
				System.out.println(count + " : "+a);
			}
			
			/*
			 * do-while문 
			 * - do{}while(조건식);
			 * - 최소한 한번의 수행을 보장한다.(조건값이 false여도)
			 */
			//숫자 맞추기 게임
			//1-100 랜덤한 수 맞추기
			int answer = (int)(Math.random() * 100) + 1; //1~100랜덤수
			int input = 0;
			
			Scanner s = new Scanner(System.in);
					
			do{
				System.out.print("1~100 사이의 수를 입력해주세요>");
				input = Integer.parseInt(s.nextLine());
				
				if(answer < input){
					System.out.println(input + "보다 작습니다.");
				}else if(input < answer){
					System.out.println(input + "보다 큽니다.");
				}else {
					System.out.println("정답입니다!!");
				}
			}while(input != answer);
				
						
	
			
			//구구단 전
			
			
			for(int i=1; i<=9; i++){		
				for(int j=2; j<=9; j++){ 	
					System.out.print(j+ " * " + i + " = " + i *j + "\t"); 
				}	System.out.println();	
			}	
			
			//while문으로 바꿔주세요  
			
			//초기화와 증감식의 유무- for문과의 차이

		int i = 1; // 초기화는 먼저해주기

		while (i <= 9) {
			int j = 2;
			while (j <= 9) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
			
			//이름붙은 반복문
			//'outer'(이름) :
			
			outer : for(int x = 2; x <= 9; x++){
				for(int j = 1; j <=9; j++){
					if( j == 5){
						break; //가장 가까운 반복문 하나를 빠져나간다.  (j의 반복문 빠져나감)
//						break outer; //outer라는 이름의 반복문을 빠져나간다.
//						
//						continue; // 가장 가까운 반복문의 현재 반복회차를 빠져나간다. (가까운 if문-5 건너뛰어 반복)
//						continue outer; //  outer라는 이름의 현재 반복회차를 빠져나간다.
						
						// break& continue : 차이점 구분하기
					}
					System.out.println(x + " * " + x + " = " + x * j);
				}
				System.out.println();
			}
		
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
			
		for(int v = 1; v<=3; v++){
			for(int j = 1; j <=5; j++){
			System.out.print("*");	
			}
			System.out.println();
			}
	
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		for(int k = 1; k<=5; k++){
			for(int j = 1; j<=i; j++){ 	 // 반복횟수 제한 설정을변경
			System.out.println("*");
			}System.out.println();
	}
		
	
	   for(int k = 2; k <= 5; k++){   //(나타내고자 하는 줄수)
		   for(int j=5; j>=i; j--){   //(
	   System.out.println("*");
	   }System.out.println();
	   }
	
	
	
	}
			}
		
		
			
			
			
			
			
			
