package a_variable;

import java.util.Scanner;


public class Variable {

	public static void main(String[] args) {
		//클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		//매서드 : 명령문의 집합
		//main메서드 : 프로그램의 시작과 끝 
		
		
		//주석 : 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명하는데 사용한다.)
		//한줄 주석 : ctrl + shift + c
		/* 범위주석 : ctrl + shift + / (해제 : \) */
		/*범위주석*/
		
		
		/*데이터의 종류
		 * - 정수 : 10,-5
		 * - 실수 : 3.15, -1.5
		 * - 문자 : 'a', '3'
		 * - 논리 : true, false
		 * 
		 * 프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여놓았다.
		 * (자료형/Data Type)
		 * 
		 * 기본형 타입
		 * - 정수 : byte(1), short(2), *int(4), long(8)
		 * - 실수 : float(4), *double(8)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 *   데이터타입은 변수를 만들때 주로 사용한다.
		 */
		
		//상수 : 값이 변하지 않는 데이터(예 : 10, -5)
		//변수: 값이 변하는 데이터(예: x , y)
		//변수를 만들고 변수를 조작해서 원하는 결과를 만들어내는 것이 프로그래밍의 전부라 할 수 있다. 
		
		//변수를 만드는 것 : 변수 선언
		//변수를 만드는 방법 : 데이터타입 변수이름
		int name;
		
		//데이터타입을 선택할 때는 표현하고자 하는 데이터에 맞는 타입을 선택해주면 된다. 	
		//변수이름을 정할때는 표현하고자 하는 데이터의 의미와 부합하는 이름을 지어주면 된다.
		double pi;
		
		
//		long name; //한 블럭 한 블럭 ({})안에서 변수의 이름은 중복될 수 없다

		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10; //초기화: 변수에 처음으로 값을 저장하는 것	
		pi = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
	
		int abc = 30; //보통 선언과 초기화를 동시에 한다.
		long l = 40L; //접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; // 따옴표안에 한글자만 넣어야한다.
		boolean b = true; //true, false
		
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte a = 1;
		short y = 1;
		int x = 3;
		long s = 30L;
		float d = 4.4f;
		double u = 3.24;
		char w = '강';
		boolean t = false;
		
		System.out.println(name);
		//실행 단축키 : ctrl + F11
		
				
		name = 100;
		System.out.println(name);
		
		//위에서 만든 8개의 변수에 새로운 값을 저장하고 출력해주세요.
		
		 a = 20;
		 y = 13;
		 x = 34;
		 s = 36L;
		 d = 4.5f;
		 u = 3.5;
		 w = 'A';
		 t = true;
		
		
		
		System.out.println(a);
		System.out.println(y);	
		System.out.println(x);
		System.out.println(s);
		System.out.println(d);
		System.out.println(u);
		System.out.println(w);
		System.out.println(t);
		
		
		
	/*타입의 선택기준
	 *
	 * 정수
	 * - byte, short : 메모리를 절약해야 할 때
	 * - int : 기본
	 * - long : int의 범위를 벗어날때
	 * 
	 * 실수 
	 * - float : 메모리를 절약해야 할때
	 * - double : 기본
	 */
		
		//문자열
		String str ="문자 여러개..";
		System.out.println(str);
		
		//형변환
		// 다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해줘야 하는데 이를 형변환(type casting)이라 한다.		
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = small; //표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략가능
		
		/*
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다
		 * - 예약어는 사용할 수 없다.
		 * - [낙타식 표기법을 사용한다. (mySampleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다. (MySampleClass)]
		 */
		
		/*
		 * 상수
		 * - 처음 담긴 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		
		final int MAX_NUMBER = 10;
		//MAX_NUMBER = 100; //컴파일 에러발생
		
		
		
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.");
		System.out.print("줄바꿈을 하지 \n않는다.");
		System.out.println("줄바꿈을 한다.");
		System.out.println("줄바꿈을\t한다.");
		System.out.println("줄 바 꿈 을  \t 한다." + name);
		System.out.printf("문자열:%s", "숫자:%d", "Hello", 10);
		//출력 포멧을 지정한다
	
		System.out.println();
		System.out.println("A" + 100);
		System.out.println(10 + 20 + "30");
		System.out.println("10" + 20 +30);
		System.out.println("10" + (20 +30));
		
		
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기위한 클래스
		//import 단축키 : ctrl + shift + o
		
		System.out.println("아무거나 입력해주세요>");
		String str2 = sc.nextLine(); 
		System.out.println("입력받은 내용 : " + str2);
//		
		
		// int nextInt = sc.nextInt();
		// double nextDouble = sc.nextDouble();
		// 이런것들이 있지만 버그로 사용하지 않음
		
		
//		System.out.println("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		
//		System.out.println("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.println(number);
		
		//Double.parseDouble(sc.nextLine());
		
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		String myName;
		
		
		//위에서 선언한 변수를 초기화 하기위해 이름을 입력받아 주세요.
		
		myName = "백수진";
	 
		System.out.println("이름을 입력해주세요>");
		myName = sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언
		int myAge;
		
		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아 주세요.
		
		System.out.println("나이를 입력해주세요>");
		myAge = Integer.parseInt(sc.nextLine());
		
		//위에서 입력받은 이름과 나이를 출력해주세요.
		System.out.println(" 이름: " + myName + " / 나이 : " + myAge);
		
		
		
		
		
		
	}		
		
}	
