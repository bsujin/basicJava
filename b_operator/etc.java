package b_operator;

import java.util.Scanner;

public class etc {

	public static void main(String[] args) {
		
		/*
		 * 비트연산자
		 * - |, &, ^, ~. <<, >>
		 * - 비트단위로 연산한다.
		 * 
		 * 기타연산자
		 * - .(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * - (type): 형변환
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 : 조건식이 거짓일 경우
		 */		
		
		//1byte : 01010101
		System.out.println(10 | 15); 	 // | : 둘 다 0인경우 0 그 외 1
		//계산 방법
		// 10 : 00001010
		// 15 : 00001111
		//		00001111 = 결과값 15
		
		
		//삼항연산자
		int x = 10;
		int y = 20;
		int result = ( x < y) ? x : y ;
				  //  조건식   ? 반환값1 : 반환값2
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자, 2면 여자
		 int regNO = 1;
		 
		 String result1 = (regNO == 1) ? "남자" : "여자";  //** ->문자 STRING사용
		 System.out.println(result1);
		 
		

		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
	 //입력- 
		Scanner sc = new Scanner(System.in);
	 
		// 1. 2개의 숫자 입력받기
		System.out.println("첫번째 숫자를 입력하세요>");
		int number1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력하세요>");
		int number2 = Integer.parseInt(sc.nextLine());
				
	 //2.둘 중 더 큰 숫자 출력
		
		int sum = (number1>number2) ? number1 : number2;
		System.out.println(sum);
		
		//result = (number1 > number2) ? number1 : (number1==number2? 0000:number2);
		//System.out.println(number1 > number2 ? number1 : number2);
				
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.println("숫자를 입력하세요>");
		int num	=  Integer.parseInt(sc.nextLine()); 
		
		String re = num == 1 || num==3 ? "남자" :( num == 2 || num ==4 ? "여자":"확인불가");
		System.out.println(re);
		
		
//		int num1;
//		num1 = Integer.parseInt(sc.nextLine());   // 변수 = Integer.parse()(변수.nextLine());
//		num1 == 1 || num1 == 3 ? "남자" : (num1 == 2 || num1 == 4 ? "여자" : "확인불가");
//		System.out.println(gender)
		
		
		
		// 변수 = Integer.parse()(변수.nextLine());
		//syso +ctrl + space = System.out.println();
		
		
		
	}
}
