package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		
		/* 비교연산자
		 * - <, >, <=, >=, ==, !=, 
		 * - 문자열비교 : equals() 
		 */	
		boolean b = 10 < 20;	//비교연산자의 연산결과는 boolean이다
			System.out.println(b);
			b = 10 <= 20 - 15; 	//산술연산 먼저 수행 후 연산을 수행한다.
			System.out.println(b);
			
			String str1 = "abc";
			String str2 = "abc";
			b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한것이다.
			System.out.println(b);

			
			//문자열의 내용비교
			//String의 내용을 비교하기 위해서는 equals()메서드를 사용한다.
			b = str1.equals(str2);
			System.out.println(b);
			
			b = !str1.equals(str2);
			System.out.println(b);
			
			
			//int타입의 x와 y변수를 만들고, 다음의 문장들을 코드로 작성해주세요.
			
			int x = 4;
			int y = 7;
					
			
			//1. x가 y보다 크다.
			
			b = x > y ;
			System.out.println(b);
			
			
			//2. x + 5 와  y는 같다.
			
			b = x+5 == y;
			System.out.println(b);
			
			//3. y는 홀수이다.
			
			b = y%2==1;
			System.out.println(b);
			
			//4. "변수"와 "데이터"는 같다.
			b = "변수" .equals("데이터");
			System.out.println("변수".equals("데이터"));
			
			
	
	
	}

}
