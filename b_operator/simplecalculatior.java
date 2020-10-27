
package b_operator;

import java.util.Scanner;


public class simplecalculatior {

	public static void main(String[] args) {
		
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		//+-*/
		
		// 조건식 ? 참 : 거짓 ( equals 문자열끼리 쓰는 명령어, 문자열의 내용을 비교 

		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자 두개를 입력하세요 >");
		int num = Integer.parseInt(sc.nextLine());
		int num1 = Integer.parseInt(sc.nextLine());		//문자를 숫자로 형변환
	
		System.out.println("사용할 연산자를 입력하세요 > (+,-,*,/,%)");
		String op = sc.next();	
		
		
		int result = op.equals("+")? (num+num1): (op.equals("-")? (num-num1) : (op.equals("*")? (num*num1):
			(op.equals("/")? (num/num1): (op.equals("%")? (num % num1) : 0))));
	
		System.out.println(num + op + num1 + " = " + result);
		
//		
//		int a;
//		if (op.equals("+")){
//			a = num += num1;
//			System.out.println(a);
//		}else if (op.equals("-")){
//			a =  num -=num1;
//			System.out.println(a);
//		}else if (op.equals("*")){
//			a= num * num1;
//			System.out.println(a);
//		}else if (op.equals("/")){
//			a = num / num1;
//			System.out.println(a);
//		}
//		
		
		
				
	}
		
}
