package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=,*=, /=, %=
		 * - 증감연산자 : ++, --
		 */

		int result = 10 + 20 - 30 * 40 / 50 % 60;
		// 곱하기와 나누기가 더하기 뺴기보다 우선순위가 높다.
		
		//나머지 연산
		result = 10 % 4;
		System.out.println(result);
		
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		// + - * / %
			int e,f,g,h,i;
			
			e = 3+5;
			f = 18-6;
			g = 43*3;
			h = 74/2;
			i = 62%2;
			
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
			System.out.println(i);
			

		
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입 연산자를 결합해 사용할 수 있다.
			result = result + 3;
	 System.out.println(result);
	 
	 result += 3;
	 System.out.println(result);
	 
	 result -= 5;
	 System.out.println(result);
	 
	 result *= 2;
	 System.out.println(result);
	 
	 //아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
	 
	 //result = result + 10;
	   result += 10;
	
	 //result = result -2 * 3;
	  result -= 2 *3;

	 //result = result % 5;
		 result %= 5;
	 
		 
		 //증감연산자
		 //증가연산자(++) : 변수의 값을 1 증가시킨다.
		 //감소연산자(--) : 변수의 값을 1 감소시킨다.
		 int ia = 0;
		 
		 ++i; // 전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		 i++; // 후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		 --i; // 전위형 : 변수의 값을 읽어오기 전에 1 감소된다.
		 i--; // 후위형 : 변수의 값을 읽어온 후에 1 감소된다.
		 
		 ia = 0;
		 System.out.println("++i = " + ++i );
				
		 ia = 0;
		 System.out.println("i++ = " + i++ );
		 System.out.println(i);
		 
		 
		 //피연산자의 타입이 서로 같아야만 연산이 가능하다.
		 int _int = 10;
		 double _double = 3.14;
		 double result2 = (double)_int + _double; // 표현범위가 더 큰 타입으로 형변환된다
		 System.out.println(result2);
		 
		 
		 byte _byte = 5;
		 short _short = 10;	
		 int result3 = (int)_byte + (int)_short;  //int보다 작은 타입은 int로 형변환된다.
		 System.out.println(result3);
		 
		 //오버플로우, 언더플로우
		 //표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		
		byte s = 127;
		s++;
		System.out.println(s);
		s--;
		System.out.println(s);
		
//		타입을 선택할 때는 연산의 범위를 고려해야한다.
		
		//다음을 한줄 씩 계산해서 최종 결과값을 출력해주세요.
		//1.123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		double y = 123456 + 654321;
		y = y * 123456;
		y /= 123456;
	    y -= 654321;
	    y %= 123456;
	   System.out.println(y);
	   
	   
	//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요
	   
	   int q,w,u;
	   
	   q = 356;
	   w = 231;
	   u = 453;
	   
	   System.out.println("합 : " + (q+w+u));
	   System.out.println("평균 : " + (q+w+u)/3);
	   
	   int num1 = 15;
	   int num2 = 34;
	   int num3 = 49;
	   int sum = num1 + num2 + num3;
	   double avg = sum/3.0;
	   System.out.println("합계 : " + sum + "/ 평균 :" + avg);
	   
	   //반올림하는법
//	   avg = Math.round(avg);
//	   System.out.println(avg);
	   
	   avg = Math.round(avg * 10) / 10.0;     
	   System.out.println(avg);
	   
	   
	   //랜덤
	   System.out.println((int) (Math.random() * 100) +1);
	   //Math.random() - 0.0~1.0 미만 랜덤한 수를 발생시켜줌

			
		
	}

}
