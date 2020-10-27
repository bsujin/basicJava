package e_oop;

import java.util.Scanner;

public class Static {

	/*
	 *  -static을 붙이면 프로그램 실행 시 메모리에 올라간다.
	 * - 객체 생성을 하지 않아도 사용할 수 있다.
	 * - static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * - static을 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * - static이 붙지 않은 멤버의 명칭 : 인스턴스변수, 인스턴스 메서드
	 */
	
	//값을 공유하기 위해 static을 붙인다.
	static int var;
	//int var2;
	
	public static void main(String[] args) {
		//Static.var = 33;
		
		//Static.var2 = 33;
		
		//Static gg = new Static();
		//gg.var2 = 44;
		
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);

		철수.saveDateMoney(200000);
		영희.saveDateMoney(200000);
		// 객체 간 값을 공유함
		
		System.out.println("문자열 입력 > ");
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.println("숫자 입력> ");
		int num = ScanUtil.nextInt();	
		System.out.println(num);
		
		
		// 호출하는 방법의 차이 static이 붙는 , 안붙는 
		new Scanner(System.in).nextLine(); //객체를 통해접근
		ScanUtil.nextLine(); //클래스를 통해 접근
		
	//	int k = 영희.add(100, 200);
	//	System.out.println("k = " + k);
		
	}

}

// 변수에 static을 붙이는 경우


class Human{
	
	int account;
	
	//저금하는매서드
	void saveMoney(int money){
		account += money;
		System.out.println("통장 잔고 : " + account);
	}
		
	
	static int dateAccount;	//변수에 static

	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : "+ dateAccount);
	
	}
	
//	int add(int a, int b){
	//	int c = a + b;
	//	return c;
	}
	

